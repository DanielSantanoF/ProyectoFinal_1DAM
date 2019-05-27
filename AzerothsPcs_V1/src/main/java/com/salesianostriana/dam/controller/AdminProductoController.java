package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.model.Accesorios;
import com.salesianostriana.dam.model.Componentes;
import com.salesianostriana.dam.model.Ordenador;
import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.service.ProductoService;

/**
 * @author Daniel Santano Fernández
 * Clase para controlar los productos por parte del administrador
 */
@Controller
@RequestMapping("/admin")
public class AdminProductoController {

	/**
	 * El servicio necesario para el controlador
	 */
	private ProductoService productoServicio;
	
	/**
	 * El constructor del servicio
	 * @param productoServicio
	 */
		public AdminProductoController(ProductoService productoServicio) {
		super();
		this.productoServicio = productoServicio;
	}

		/**
		 * Manejo de la peticion de editar producto
		 * @param id
		 * @param model
		 * @return view
		 */
		 //Método que atiende la petición de mostrar el formulario de edición de un usuario
		@GetMapping("/editarProducto/{id}")
		public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
			
			Producto aEditar = productoServicio.findById(id);
			
			if (aEditar instanceof Ordenador) {
				model.addAttribute("ordenador", aEditar);
				return "FormularioOrdenadores";
			} if(aEditar instanceof Componentes){
				model.addAttribute("componentes", aEditar);
				return "FormularioComponentes";
			} if(aEditar instanceof Accesorios){
				model.addAttribute("accesorios", aEditar);
				return "FormularioAccesorios";
			}else {
				model.addAttribute("producto", aEditar);
				return "FormularioProductos";
			}
				
		}
		
		/**
		 * Manejo de la peticion de editar un producto
		 * @param p
		 * @return view
		 */
		 //Método que procesa la respuesta del formulario al editar
		@PostMapping("/editarProducto/submit")
		public String procesarFormularioEdicion(@ModelAttribute("producto") Producto p) {
			productoServicio.edit(p);
			return "redirect:/admin/listaProductos";
		}
		
		/**
		 * Manejo de la peticion de borrar un producto
		 * @param id
		 * @return view
		 */
		//Método que borrar un usuario por su Id
		@GetMapping("/borrarProducto/{id}")
		public String borrar(@PathVariable("id") long id) {
			productoServicio.deleteById(id);
			return "redirect:/admin/listaProductos";
		}
		
		//COMPONENTES__________________________________________________________________
		
		/**
		 * Manejo de editar un componente y guardarlo
		 * @param c
		 * @return view
		 */
		//Método que procesa la respuesta del formulario al editar
		@PostMapping("/editarProducto/submitComponente")
		public String procesarFormularioEdicionComponentes(@ModelAttribute("componentes") Componentes c) {
			productoServicio.edit(c);
			return "redirect:/admin/listaProductos";
		}
				
		//ACCESORIOS_____________________________________________________________________
		
		/**
		 * Manejo de editar un accesorio y guardarlo
		 * @param a
		 * @return view
		 */
		//Método que procesa la respuesta del formulario al editar
		@PostMapping("/editarProducto/submitAccesorio")
		public String procesarFormularioEdicionAccesorio(@ModelAttribute("accesorios") Accesorios a) {
			productoServicio.edit(a);
			return "redirect:/admin/listaProductos";
		}
		
		//ORDENADORES________________________________________________________________________
		
		/**
		 * Manejo de editar un ordenador y guardarlo
		 * @param o
		 * @return view
		 */
		//Método que procesa la respuesta del formulario al editar
		@PostMapping("/editarProducto/submitOrdenador")
		public String procesarFormularioEdicionOrdenadores(@ModelAttribute("ordenador") Ordenador o) {
			productoServicio.edit(o);
			return "redirect:/admin/listaProductos";
		}
}
