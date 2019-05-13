package com.salesianostriana.dam.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.model.Componentes;
import com.salesianostriana.dam.service.ComponenteService;

public class ComponenteController {

	private ComponenteService componenteServicio;

	public ComponenteController(ComponenteService componenteServicio) {
		super();
		this.componenteServicio = componenteServicio;
	}
	
	/**
	 	//Método que gestiona la petición "índice" o de listado
			@GetMapping({"/listProductos"})
			public String listarTodos(Model model) {
				model.addAttribute("lista", componenteServicio.findAll());
				return "IndexProductos";
			}**/
			
			/**
			 //Método que atiende la petición de mostrar formulario
			@GetMapping("/nuevoComponente")
			public String mostrarFormulario(Model model) {
				model.addAttribute("componentes", new Componentes());
				return "FormularioComponentes";
			}
			
			 //Método que procesa la respuesta del formulario
			@PostMapping("/nuevoComponente/submit")
			public String procesarFormulario(@ModelAttribute("componentes") Componentes c) {
				componenteServicio.save(c);
				return "redirect:/listProductos";
			}**/
			/**
			 //Método que atiende la petición de mostrar el formulario de edición de un usuario
			@GetMapping("/editarProducto/{id}")
			public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
				
				Componentes aEditar = componenteServicio.findById(id);
				
				if (aEditar != null) {
					model.addAttribute("producto", aEditar);
					return "FormularioProductos";
				} else {
					// No existe ningún producto con el Id proporcionado.
					// Redirigimos hacia el listado.
					return "redirect:/listProductos";
				}
					
			}
			
			
			 //Método que procesa la respuesta del formulario al editar
			@PostMapping("/editarProducto/submit")
			public String procesarFormularioEdicion(@ModelAttribute("producto") Producto p) {
				componenteServicio.edit(p);
				return "redirect:/listProductos";
			}
			
			//Método que borrar un usuario por su Id
			@GetMapping("/borrarProducto/{id}")
			public String borrar(@PathVariable("id") long id) {
				componenteServicio.deleteById(id);
				return "redirect:/listProductos";
			}**/
}
