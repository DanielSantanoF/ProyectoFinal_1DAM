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

/**
 * @author Daniel Santano Fernández
 * Clase para controlar la parte de usuarios del administrador
 */
@Controller
@RequestMapping("/admin")
public class AdminUsuarioController {

	/**
	 * El servicio necesario para el controler y el encriptador de la contraseña
	 */
	private UsuarioServicio usuarioServicio;
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	/**
	 * Contructor del servicio
	 * @param servicio
	 */
	public AdminUsuarioController(UsuarioServicio servicio) {
		this.usuarioServicio = servicio;
	}
	
	/**
	 * Manejo de crear un nuevo ususario
	 * @param model
	 * @return view
	 */
	 //Método que atiende la petición de mostrar formulario
	@GetMapping("/nuevoUsuario")
	public String mostrarFormulario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "FormularioNuevoUsuario";
	}
	
	/**
	 * Manejo de crear un nuevo usuario y guardarlo
	 * @param u
	 * @return view
	 */
	 //Método que procesa la respuesta del formulario
	@PostMapping("/nuevoUsuario/submit")
	public String procesarFormulario(@ModelAttribute("usuario") Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		usuarioServicio.save(u);
		return "redirect:/admin/listaUsuarios";
	}
	
	/**
	 * Manejo de editar un usuario
	 * @param id
	 * @param model
	 * @return view
	 */
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
	
	/**
	 * Manejo de editar el usuario y guardarlo
	 * @param u
	 * @return view
	 */
	 //Método que procesa la respuesta del formulario al editar
	@PostMapping("/editarUsuario/submit")
	public String procesarFormularioEdicion(@ModelAttribute("usuario") Usuario u) {
		usuarioServicio.edit(u);
		return "redirect:/admin/listaUsuarios";
	}
	
	/**
	 * Manejo de borrar un usuario
	 * @param id
	 * @return view
	 */
	//Método que borrar un usuario por su Id
	@GetMapping("/borrarUsuario/{id}")
	public String borrar(@PathVariable("id") long id) {
		usuarioServicio.deleteById(id);
		return "redirect:/admin/listaUsuarios";
	}
	
	/**
	 * Manejo de editar la contraseña del usuario
	 * @param id
	 * @param model
	 * @return view
	 */
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
	
		/**
		 * Manejo de editar la contraseña del usuario y guardarla
		 * @param u
		 * @return view
		 */
	 //Método que procesa la respuesta del formulario al editar
	@PostMapping("/editarUsuarioPassword/submit")
	public String procesarFormularioEdicionPassword(@ModelAttribute("usuario") Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		usuarioServicio.edit(u);
		return "redirect:/admin/listaUsuarios";
	}
}
