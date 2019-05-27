package com.salesianostriana.dam.azerothspcs_v1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.service.ProductoService;

/**
 * @author Daniel Santano Fernández
 * Clase test del servicio de producto
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductoServiceTests {

	/**
	 * Instanciamos el servicio necesario para los test
	 */
	@Autowired
	ProductoService servicio;
	
	/**
	 * Test para comprobar el buscar por nombre del servicio de producto
	 */
	@Test
	public void buscarProductosPorNombreTest() {
		
		Producto nuevo = new Producto("TestDeBuscarPorNombre", "Producto nuevo", 1.1, false, 1.1, 10, true, "imagenPrueba.jpg", "MarcaTest");
		servicio.save(nuevo);
		List<Producto> lista = new ArrayList<Producto>();
		lista.add(nuevo);
		assertEquals(lista,servicio.findByNombre("TestDeBuscarPorNombre"));
	}
	
	/**
	 * Test para comprobar el buscar por id de producto
	 */
	@Test
	public void buscarProductosPorIdTest() {
		
		Producto nuevo = new Producto("Nuevo", "Producto nuevo", 1.1, false, 1.1, 10, true, "imagenPrueba.jpg", "MarcaTest");
		servicio.save(nuevo);
		assertEquals(nuevo,servicio.findById(nuevo.getId()));
	}
	
}
