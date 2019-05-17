package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.salesianostriana.dam.FormBean.ProductoFormBean;
import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.service.ProductoService;

@Controller
@RequestMapping("/admin")
public class ProductoFormBeanController {

	private ProductoService productoService;
	
	// (template: "class path resource [templates/FormularioProductoFormBean.html]" - line 54, col 83)
	@GetMapping("/nuevoProductoFormBean")
	public String showForm(Model model) {
		model.addAttribute("productoFormBean", new ProductoFormBean());
		return "FormularioProductoFormBean";
	}
	
	@PostMapping("/nuevoProductoFormBean/submit") 
	public String submit(@ModelAttribute("uploadBean") ProductoFormBean productoFormBean, 
			@RequestParam("imgFile") MultipartFile imgFile, Model model){
		
		Producto p = new Producto();

		p.setNombre(productoFormBean.getNombre());

		productoService.add(p, imgFile);
		
		
		return "redirect:/admin/listaProductos";
	}
	
	@PostMapping("/editarProductoFormBean/submit") 
	public String edit(@ModelAttribute("uploadBean") ProductoFormBean productoFormBean, 
			@RequestParam("file") MultipartFile file, Model model){

		Producto p = new Producto();

		p.setNombre(productoFormBean.getNombre());

		productoService.add(p, file);
		
		
		return "redirect:/admin/listaProductos";
	}
}
