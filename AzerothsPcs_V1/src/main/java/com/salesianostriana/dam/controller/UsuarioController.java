package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.service.UsuarioServicio;


@Controller
public class UsuarioController {

	private UsuarioServicio usuarioServicio;
	
	public UsuarioController(UsuarioServicio servicio) {
		this.usuarioServicio = servicio;
	}
	
	
	 //Método que gestiona la petición "índice" o de listado
	@GetMapping({"/", "/listUsuarios"})
	public String listarTodos(Model model) {
		model.addAttribute("lista", usuarioServicio.findAll());
		return "IndexUsuarios";
	}
	
	
	 //Método que atiende la petición de mostrar formulario
	@GetMapping("/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "FormularioUsuarios";
	}
	
	
	 //Método que procesa la respuesta del formulario
	@PostMapping("/nuevo/submit")
	public String procesarFormulario(@ModelAttribute("usuario") Usuario u) {
		usuarioServicio.add(u);
		return "redirect:/";
	}
	
	 //Método que atiende la petición de mostrar el formulario de edición de un usuario
	@GetMapping("/editar/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		
		Usuario aEditar = usuarioServicio.findById(id);
		
		if (aEditar != null) {
			model.addAttribute("usuario", aEditar);
			return "FormularioUsuarios";
		} else {
			// No existe ningún ususario con el Id proporcionado.
			// Redirigimos hacia el listado.
			return "redirect:/";
		}
			
	}
	
	
	 //Método que procesa la respuesta del formulario al editar
	@PostMapping("/editar/submit")
	public String procesarFormularioEdicion(@ModelAttribute("usuario") Usuario u) {
		usuarioServicio.edit(u);
		return "redirect:/";
	}
	
	//Método que borrar un usuario por su Id
	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") long id) {
		usuarioServicio.delete(id);
		return "redirect:/";
	}
}
