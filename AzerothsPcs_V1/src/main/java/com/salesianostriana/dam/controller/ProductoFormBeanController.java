package com.salesianostriana.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/nuevoProductoFormBean")
	public String nuevoFormBeanProducto(Model model) {
		model.addAttribute("productoFormBean", new ProductoFormBean());
		return "FormularioProductoFormBean";
	}
	
	@PostMapping("/nuevoProductoFormBean/submit") 
	public String submitFormBeanProducto(@ModelAttribute("productoFormBean") ProductoFormBean productoFormBean, 
			@RequestParam("file") MultipartFile file, Model model){
		
		Producto p = new Producto();

		p.setNombre(productoFormBean.getNombre());
		p.setDescripcion(productoFormBean.getDescripcion());
		p.setPrecio(productoFormBean.getPrecio());
		p.setEnOferta(productoFormBean.isEnOferta());
		p.setPrecioConDescuento(productoFormBean.getPrecioConDescuento());
		p.setCantidad(productoFormBean.getCantidad());
		p.setDisponible(productoFormBean.isDisponible());
		p.setMarca(productoFormBean.getMarca());

		productoService.add(p, file);
		
		
		return "redirect:/admin/listaProductos";
	}
	
	@PostMapping("/editarProductoFormBean/submit") 
	public String editFormBeanProducto(@ModelAttribute("productoFormBean") ProductoFormBean productoFormBean, 
			@RequestParam("file") MultipartFile file, Model model){

		Producto p = new Producto();

		p.setNombre(productoFormBean.getNombre());
		p.setDescripcion(productoFormBean.getDescripcion());
		p.setPrecio(productoFormBean.getPrecio());
		p.setEnOferta(productoFormBean.isEnOferta());
		p.setPrecioConDescuento(productoFormBean.getPrecioConDescuento());
		p.setCantidad(productoFormBean.getCantidad());
		p.setDisponible(productoFormBean.isDisponible());
		p.setMarca(productoFormBean.getMarca());

		productoService.add(p, file);
		
		
		return "redirect:/admin/listaProductos";
	}
}
