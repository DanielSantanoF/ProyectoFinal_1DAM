package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.service.ProductoService;

@Controller
public class ProductoController {

	private ProductoService productoService;
	
		@GetMapping ("/producto")
		public String showForm(Model model) {
		
		model.addAttribute("productoForm", new Producto());
		return "ProductosAdmin";
		
		}
		
		@PostMapping ("/addProducto")
		public String submit(@ModelAttribute("productoForm") Producto producto,  Model model) {
			productoService.add(producto);
			
			model.addAttribute("producto", producto);
			
			return "ProductoAñadidoAdmin";
			
		}
}
