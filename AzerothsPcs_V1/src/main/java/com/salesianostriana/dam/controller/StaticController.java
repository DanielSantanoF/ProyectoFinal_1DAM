package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {

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
	
}
