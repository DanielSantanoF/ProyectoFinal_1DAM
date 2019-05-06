package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.model.Producto;

@Controller
public class ProductoController {

		@GetMapping ("/producto")
		public String showForm(Model model) {
		
		model.addAttribute("productoForm", new Producto());
		return "ProductosAdmin";
		
		}
		
		@PostMapping ("/addProducto")
		public String submit(@ModelAttribute("productoForm") Producto producto,  Model model) {
			
			model.addAttribute("producto", producto);
			return "ProductoAñadidoAdmin";
			
		}
}
