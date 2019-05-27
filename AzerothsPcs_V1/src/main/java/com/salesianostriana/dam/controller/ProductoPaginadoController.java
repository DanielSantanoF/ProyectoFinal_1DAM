package com.salesianostriana.dam.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.FormBean.SearchBean;
import com.salesianostriana.dam.model.Pager;
import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.service.ProductoService;

/**
 * @author Daniel Santano Fernández
 * Clase para controlar el catalogo de productos paginado
 */
@Controller
public class ProductoPaginadoController {

	/**
	 * Lo necesario para el controler
	 */
	
	@Autowired
	HttpSession session;
	
	private static final int BUTTONS_TO_SHOW = 5;
    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 3;
    private static final int[] PAGE_SIZES = {3, 6, 12, 24};
    
    @Autowired
    ProductoService productoService;
    
    /**
     * Manejo de mostrar el catalogo paginado
     *
     * @param pageSize
     * @param page
     * @return view
     */
    
    @GetMapping("/productos")
	public String showProductsPage(@RequestParam("pageSize") Optional<Integer> pageSize,
            @RequestParam("page") Optional<Integer> page, @RequestParam("nombre") Optional<String> nombre, Model model) {

    	// Evalúa el tamaño de página. Si el parámetro es "nulo", devuelve
    	// el tamaño de página inicial.
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        
        // Calcula qué página se va a mostrar. Si el parámetro es "nulo" o menor
        // que 0, se devuelve el valor inicial. De otro modo, se devuelve el valor
        // del parámetro decrementado en 1.
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        
        String evalNombre = nombre.orElse(null);
        
        Page<Producto> productos = null;
        
        if (evalNombre == null) {
        	productos = productoService.findAllPageable(PageRequest.of(evalPage, evalPageSize));
        } else {
        	productos = productoService.findByNombreContainingIgnoreCasePageable(evalNombre, PageRequest.of(evalPage, evalPageSize));
        }

        // Obtenemos la página definida por evalPage y evalPageSize de objetos de nuestro modelo
        //Page<Producto> products = productService.findAllPageable(PageRequest.of(evalPage, evalPageSize));
        // Creamos el objeto Pager (paginador) indicando los valores correspondientes.
        // Este sirve para que la plantilla sepa cuantas páginas hay en total, cuantos botones
        // debe mostrar y cuál es el número de objetos a dibujar.
        Pager pager = new Pager(productos.getTotalPages(), productos.getNumber(), BUTTONS_TO_SHOW);
        
        model.addAttribute("productos", productos);
        model.addAttribute("selectedPageSize", evalPageSize);
        model.addAttribute("pageSizes", PAGE_SIZES);
        model.addAttribute("pager", pager);
        
    	return "ProductosPaginadosBuscar";
    }
    
    /**
     * Manejo del buscar por nombre para el paginado del catalogo
     * @param searchBean
     * @param model
     * @return view
     */
    @PostMapping("/search")
	  public String searchProducto(@ModelAttribute("searchForm") SearchBean searchBean,
			 Model model){
	  	model.addAttribute("productos", productoService.findByNombre(searchBean.getSearch()));
	  
	  return "ProductosPaginadosBuscar";
	  }
}
