package com.salesianostriana.dam.azerothspcs_v1;

import static org.junit.Assert.assertEquals;

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

	@Test
	public void concatenarImagenes() {
		
		Producto nuevo = new Producto("nuevo", "Producto nuevo", 1.1, false, 1.1, 10, true, "imagenPrueba.jpg", "MarcaTest");
		Producto esperado = new Producto("nuevo", "Producto nuevo", 1.1, false, 1.1, 10, true, "/images/imagenPrueba.jpg", "MarcaTest");
		servicio.save(nuevo);
		assertEquals(esperado, servicio.listaProductosFormBean());
	}
}
