package com.salesianostriana.dam.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.service.UsuarioServicio;


@Controller
@RequestMapping("/admin")
public class AdminUsuarioController {

	private UsuarioServicio usuarioServicio;
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	public AdminUsuarioController(UsuarioServicio servicio) {
		this.usuarioServicio = servicio;
	}
	
	
	 //Método que gestiona la petición "índice" o de listado
	@GetMapping({"/listaUsuarios"})
	public String listarTodos(Model model) {
		model.addAttribute("lista", usuarioServicio.findAll());
		return "IndexUsuarios";
	}
	
	
	 //Método que atiende la petición de mostrar formulario
	@GetMapping("/nuevoUsuario")
	public String mostrarFormulario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "FormularioUsuarios";
	}
	
	
	 //Método que procesa la respuesta del formulario
	@PostMapping("/nuevoUsuario/submit")
	public String procesarFormulario(@ModelAttribute("usuario") Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		usuarioServicio.save(u);
		return "redirect:/admin/listaUsuarios";
	}
	
	 //Método que atiende la petición de mostrar el formulario de edición de un usuario
	@GetMapping("/editarUsuario/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		
		Usuario aEditar = usuarioServicio.findById(id);
		
		if (aEditar != null) {
			model.addAttribute("usuario", aEditar);
			return "FormularioUsuarios";
		} else {
			// No existe ningún ususario con el Id proporcionado.
			// Redirigimos hacia el listado.
			return "redirect:/admin/listaUsuarios";
		}
			
	}
	
	
	 //Método que procesa la respuesta del formulario al editar
	@PostMapping("/editarUsuario/submit")
	public String procesarFormularioEdicion(@ModelAttribute("usuario") Usuario u) {
		usuarioServicio.edit(u);
		return "redirect:/admin/listaUsuarios";
	}
	
	//Método que borrar un usuario por su Id
	@GetMapping("/borrarUsuario/{id}")
	public String borrar(@PathVariable("id") long id) {
		usuarioServicio.deleteById(id);
		return "redirect:/admin/listaUsuarios";
	}
	
	//Método que atiende la petición de mostrar el formulario de edición de un usuario
		@GetMapping("/editarUsuarioPassword/{id}")
		public String mostrarFormularioEdicionPassword(@PathVariable("id") long id, Model model) {
			
			Usuario aEditar = usuarioServicio.findById(id);
			
			if (aEditar != null) {
				model.addAttribute("usuario", aEditar);
				return "FormularioUsuariosContraseña";
			} else {
				// No existe ningún ususario con el Id proporcionado.
				// Redirigimos hacia el listado.
				return "redirect:/admin/listaUsuarios";
			}
				
		}
	
	 //Método que procesa la respuesta del formulario al editar
	@PostMapping("/editarUsuarioPassword/submit")
	public String procesarFormularioEdicionPassword(@ModelAttribute("usuario") Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		usuarioServicio.edit(u);
		return "redirect:/admin/listaUsuarios";
	}
}
