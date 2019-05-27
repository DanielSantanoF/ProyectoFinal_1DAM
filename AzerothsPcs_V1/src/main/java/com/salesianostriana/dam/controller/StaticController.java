package com.salesianostriana.dam.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.service.UsuarioServicio;

/**
 * @author Daniel Santano Fernández
 * Clase para controlar todas las peticiones staticas que cualquiera puede consultar sin necesidad de estar logeado
 */
@Controller
public class StaticController {

	/**
	 * Lo necesario para el controler servicio en este caso
	 */
	
	private UsuarioServicio usuarioServicio;
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	/**
	 * Constructor del servicio
	 * @param servicio
	 */
	public StaticController(UsuarioServicio servicio) {
		this.usuarioServicio = servicio;
	}
	
	/**
	 * Manejo de la vista de la portada de la tienda
	 * @return view
	 */
	@GetMapping({"/", "/portada"})
	public String getPortada() {
		return "Portada";
	}
	
	/**
	 * Manejo de la vista de la informacion de la tienda
	 * @return view
	 */
	@GetMapping("/informacion")
	public String getInfo() {
		return "Informacion";
	}
	
	/**
	 * Manejo de la vista del inicio de la tienda
	 * @return web
	 */
	@GetMapping("/inicio")
	public String getInicio() {
		return "Inicio";
	}
	
	/**
	 * Manejo del registro de un usuario a la web
	 * @param model
	 * @return view
	 */
	@GetMapping("/registrarse")
	public String mostrarFormulario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "Registrarse";
	}
	
	/**
	 * Manejo del registro de un usuario a la web y guardarlo
	 * @param u
	 * @return view
	 */
	@PostMapping("/registrarse/submit")
	public String procesarFormulario(@ModelAttribute("usuario") Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		usuarioServicio.save(u);
		return "redirect:/inicio";
	}
}
