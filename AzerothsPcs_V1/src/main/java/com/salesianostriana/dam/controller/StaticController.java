package com.salesianostriana.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.service.ProductoService;

@Controller
public class StaticController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping({"/", "/portada"})
	public String getPortada() {
		return "Portada";
	}
	
	@GetMapping("/informacion")
	public String getInfo() {
		return "Informacion";
	}
	
	@GetMapping("/inicio")
	public String getInicio() {
		return "Inicio";
	}
	
	@GetMapping({"/productos"})
	public String listarTodosProductos(Model model) {
		model.addAttribute("lista", productoService.listaProductosFormBean());
		return "Productos";
	}
}
