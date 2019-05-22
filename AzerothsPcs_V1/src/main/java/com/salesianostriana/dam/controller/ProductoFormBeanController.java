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
import com.salesianostriana.dam.model.Accesorios;
import com.salesianostriana.dam.model.Componentes;
import com.salesianostriana.dam.model.Ordenador;
import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.service.ProductoService;

@Controller
@RequestMapping("/admin")
public class ProductoFormBeanController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/nuevoProducto")
	public String nuevoFormBeanProducto(Model model) {
		model.addAttribute("productoFormBean", new ProductoFormBean());
		return "FormularioProductoFormBean";
	}
	
	@PostMapping("/nuevoProducto/submit") 
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
	
	//COMPONENTES______________________________________________________________
	
	@GetMapping("/nuevoComponente")
	public String nuevoFormBeanComponente(Model model) {
		model.addAttribute("componentesFormBean", new ProductoFormBean());
		return "FormularioComponentesFormBean";
	}
	
	@PostMapping("/nuevoComponente/submit") 
	public String submitFormBeanComponente(@ModelAttribute("componentesFormBean") ProductoFormBean productoFormBean, 
			@RequestParam("file") MultipartFile file, Model model){
		
		Componentes c = new Componentes();

		c.setNombre(productoFormBean.getNombre());
		c.setDescripcion(productoFormBean.getDescripcion());
		c.setPrecio(productoFormBean.getPrecio());
		c.setEnOferta(productoFormBean.isEnOferta());
		c.setPrecioConDescuento(productoFormBean.getPrecioConDescuento());
		c.setCantidad(productoFormBean.getCantidad());
		c.setDisponible(productoFormBean.isDisponible());
		c.setMarca(productoFormBean.getMarca());
		c.setMemoria(productoFormBean.getMemoria());
		c.setVelocidad(productoFormBean.getVelocidad());
		c.setSocket(productoFormBean.getSocket());
		c.setTipoMemoria(productoFormBean.getTipoMemoria());
		

		productoService.add(c, file);
		
		
		return "redirect:/admin/listaProductos";
	}
	
	//ACCESORIOS__________________________________________________________________________
	
	@GetMapping("/nuevoAccesorio")
	public String nuevoFormBeanAccesorio(Model model) {
		model.addAttribute("accesoriosFormBean", new ProductoFormBean());
		return "FormularioAccesoriosFormBean";
	}
	
	@PostMapping("/nuevoAccesorio/submit") 
	public String submitFormBeanAccesorio(@ModelAttribute("accesoriosFormBean") ProductoFormBean productoFormBean, 
			@RequestParam("file") MultipartFile file, Model model){
		
		Accesorios a = new Accesorios();

		a.setNombre(productoFormBean.getNombre());
		a.setDescripcion(productoFormBean.getDescripcion());
		a.setPrecio(productoFormBean.getPrecio());
		a.setEnOferta(productoFormBean.isEnOferta());
		a.setPrecioConDescuento(productoFormBean.getPrecioConDescuento());
		a.setCantidad(productoFormBean.getCantidad());
		a.setDisponible(productoFormBean.isDisponible());
		a.setMarca(productoFormBean.getMarca());
		a.setTipo(productoFormBean.getTipo());
		a.setCapacidad(productoFormBean.getCapacidad());
		

		productoService.add(a, file);
		
		
		return "redirect:/admin/listaProductos";
	}
	
	//ORDENAROES___________________________________________________________________________
	
	@GetMapping("/nuevoOrdenador")
	public String nuevoFormBeanOrdenador(Model model) {
		model.addAttribute("ordenadorFormBean", new ProductoFormBean());
		return "FormularioOrdenadoresFormBean";
	}
	
	@PostMapping("/nuevoOrdenador/submit") 
	public String submitFormBeanOrdenador(@ModelAttribute("ordenadorFormBean") ProductoFormBean productoFormBean, 
			@RequestParam("file") MultipartFile file, Model model){
		
		Ordenador o = new Ordenador();

		o.setNombre(productoFormBean.getNombre());
		o.setDescripcion(productoFormBean.getDescripcion());
		o.setPrecio(productoFormBean.getPrecio());
		o.setEnOferta(productoFormBean.isEnOferta());
		o.setPrecioConDescuento(productoFormBean.getPrecioConDescuento());
		o.setCantidad(productoFormBean.getCantidad());
		o.setDisponible(productoFormBean.isDisponible());
		o.setMarca(productoFormBean.getMarca());
		o.setProcesador(productoFormBean.getProcesador());
		o.setRam(productoFormBean.getRam());
		o.setDiscoDuro(productoFormBean.getDiscoDuro());
		o.setSistemaOperativo(productoFormBean.getSistemaOperativo());
		o.setTipo(productoFormBean.getTipo());
		o.setDimensiones(productoFormBean.getDimensiones());
		

		productoService.add(o, file);
		
		
		return "redirect:/admin/listaProductos";
	}
}
