package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Daniel Santano Fernández
 * Clase para controlar el menu del administrador
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	/**
	 * Manejo de la peticion
	 * @return view
	 */
	@GetMapping("/administrar")
	public String getAdministrar() {
		return "MenuAdmin";
	}
}
