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

@Controller
@RequestMapping("/admin")
public class AdminProductoController {

	private ProductoService productoServicio;
	
	
		public AdminProductoController(ProductoService productoServicio) {
		super();
		this.productoServicio = productoServicio;
	}

		//Método que gestiona la petición "índice" o de listado
		@GetMapping({"/listaProductos"})
		public String listarTodos(Model model) {
			model.addAttribute("lista", productoServicio.findAll());
			return "IndexProductos";
		}
		
		
		 //Método que atiende la petición de mostrar formulario
		@GetMapping("/nuevoProducto")
		public String mostrarFormulario(Model model) {
			model.addAttribute("producto", new Producto());
			return "FormularioProductos";
		}
		
		 //Método que procesa la respuesta del formulario
		@PostMapping("/nuevoProducto/submit")
		public String procesarFormulario(@ModelAttribute("producto") Producto p) {
			productoServicio.save(p);
			return "redirect:/admin/listaProductos";
		}
		
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
		
		
		 //Método que procesa la respuesta del formulario al editar
		@PostMapping("/editarProducto/submit")
		public String procesarFormularioEdicion(@ModelAttribute("producto") Producto p) {
			productoServicio.edit(p);
			return "redirect:/admin/listaProductos";
		}
		
		//Método que borrar un usuario por su Id
		@GetMapping("/borrarProducto/{id}")
		public String borrar(@PathVariable("id") long id) {
			productoServicio.deleteById(id);
			return "redirect:/admin/listaProductos";
		}
		
		//COMPONENTES__________________________________________________________________
		
		@GetMapping("/nuevoComponente")
		public String mostrarFormularioComponente(Model model) {
			model.addAttribute("componentes", new Componentes());
			return "FormularioComponentes";
		}
		
		@PostMapping("/nuevoComponente/submit")
		public String procesarFormularioComponentes(@ModelAttribute("componentes") Componentes c) {
			productoServicio.save(c);
			return "redirect:/admin/listaProductos";
		}
		
		//Método que procesa la respuesta del formulario al editar
		@PostMapping("/editarProducto/submitComponente")
		public String procesarFormularioEdicionComponentes(@ModelAttribute("componentes") Componentes c) {
			productoServicio.edit(c);
			return "redirect:/admin/listaProductos";
		}
				
		//ACCESORIOS_____________________________________________________________________
		
		@GetMapping("/nuevoAccesorio")
		public String mostrarFormularioAccesorio(Model model) {
			model.addAttribute("accesorios", new Accesorios());
			return "FormularioAccesorios";
		}
		
		@PostMapping("/nuevoAccesorio/submit")
		public String procesarFormularioAccesorio(@ModelAttribute("accesorios") Accesorios a) {
			productoServicio.save(a);
			return "redirect:/admin/listaProductos";
		}
		
		//Método que procesa la respuesta del formulario al editar
		@PostMapping("/editarProducto/submitAccesorio")
		public String procesarFormularioEdicionAccesorio(@ModelAttribute("accesorios") Accesorios a) {
			productoServicio.edit(a);
			return "redirect:/admin/listaProductos";
		}
		
		//ORDENADORES________________________________________________________________________
		
		@GetMapping("/nuevoOrdenador")
		public String mostrarFormularioOrdenador(Model model) {
			model.addAttribute("ordenador", new Ordenador());
			return "FormularioOrdenadores";
		}
		
		@PostMapping("/nuevoOrdenador/submit")
		public String procesarFormularioOrdenador(@ModelAttribute("ordenador") Ordenador o) {
			productoServicio.save(o);
			return "redirect:/admin/listaProductos";
		}
		
		//Método que procesa la respuesta del formulario al editar
		@PostMapping("/editarProducto/submitOrdenador")
		public String procesarFormularioEdicionOrdenadores(@ModelAttribute("ordenador") Ordenador o) {
			productoServicio.edit(o);
			return "redirect:/admin/listaProductos";
		}
}
