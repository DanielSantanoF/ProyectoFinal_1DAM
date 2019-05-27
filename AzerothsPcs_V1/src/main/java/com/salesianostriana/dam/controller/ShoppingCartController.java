package com.salesianostriana.dam.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.service.ProductoService;
import com.salesianostriana.dam.service.ShoppingCartService;

/**
 * @author Daniel Santano Fernández
 * Clase para controlar el carrito 
 */
@Controller
public class ShoppingCartController {
	
	/**
	 * Lo necesario para el carrito en este caso dos servicios
	 */
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@Autowired
	private ProductoService productoService;
	
	/**
	 * Constructor de los servicios
	 * @param shoppingCartService
	 * @param productService
	 */
    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService, ProductoService productService) {
        this.shoppingCartService = shoppingCartService;
        this.productoService = productService;
    }
    
    /**
     * Manejo del carrito
     * @param model
     * @return view
     */
    @GetMapping ("/carrito")
    public String showCarrito (Model model) {
    	
    	if (model.addAttribute("products",shoppingCartService.getProductsInCart()) == null)
    		return "redirect:/";
    	return "Carrito";
    }

    /**
     * Manejo de añadir un producto al carrito
     * @param id
     * @param model
     * @return view
     */
    @GetMapping ("/productoACarrito/{id}")
    public String productoACarrito (@PathVariable("id") Long id, Model model) {
    	
    	shoppingCartService.addProducto(productoService.findById(id));
    	    		 	
    	return "redirect:/carrito";
    }
    
    /**
     * Manejo de borrar un producto del carrito
     * @param id
     * @return view
     */
    @GetMapping("/borrarProducto/{id}")
    public String removeProductFromCart(@PathVariable("id") Long id) {
        
    	shoppingCartService.removeProducto(productoService.findById(id));
        return "redirect:/carrito";
    }
    
    /**
     * Manejo del total del carrito
     * @return view
     */
    @ModelAttribute("total_carrito")
    public Double totalCarrito () {
    	
    	Map <Producto,Integer> carrito=shoppingCartService.getProductsInCart();
    	double total=0.0;
    	if (carrito !=null) {
        	for (Producto p: carrito.keySet()) {
        		total+=p.getPrecioConDescuento()*carrito.get(p);
        	}
        	return total;
    	}
    	
    	return 0.0;
    }
}
