package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaController {

	@GetMapping("/inicio")
	public String getHome() {
		return "Inicio.html";
	}
}
