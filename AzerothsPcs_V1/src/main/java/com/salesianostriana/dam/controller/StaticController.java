package com.salesianostriana.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.service.AccesoriosService;
import com.salesianostriana.dam.service.ComponentesService;
import com.salesianostriana.dam.service.OrdenadorService;
import com.salesianostriana.dam.service.ProductoService;
import com.salesianostriana.dam.service.UsuarioServicio;

@Controller
public class StaticController {

	@Autowired
	private ProductoService productoService;
	@Autowired
	private OrdenadorService ordenadorService;
	@Autowired
	private AccesoriosService accesoriosService;
	@Autowired
	private ComponentesService componentesService;
	
	private UsuarioServicio usuarioServicio;
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	public StaticController(UsuarioServicio servicio) {
		this.usuarioServicio = servicio;
	}
	
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
	
	@GetMapping({"/ordenadores"})
	public String listarTodosOrdenadores(Model model) {
		model.addAttribute("lista", ordenadorService.listaOrdenadoresFormBean());
		return "Ordenadores";
	}
	
	@GetMapping({"/accesorios"})
	public String listarTodosAccesorios(Model model) {
		model.addAttribute("lista", accesoriosService.listaAccesoriosFormBean());
		return "Accesorios";
	}
	
	@GetMapping({"/componentes"})
	public String listarTodosComponentes(Model model) {
		model.addAttribute("lista", componentesService.listaComponentesFormBean());
		return "Componentes";
	}
	
	@GetMapping("/registrarse")
	public String mostrarFormulario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "Registrarse";
	}
	
	@PostMapping("/registrarse/submit")
	public String procesarFormulario(@ModelAttribute("usuario") Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		usuarioServicio.save(u);
		return "redirect:/inicio";
	}
}
