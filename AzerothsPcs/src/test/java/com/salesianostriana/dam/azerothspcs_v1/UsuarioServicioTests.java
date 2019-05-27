package com.salesianostriana.dam.azerothspcs_v1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.service.UsuarioServicio;

/**
 * @author Daniel Santano Fernández
 * Clase test del servicio de usuarios
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioServicioTests {

	/**
	 * Instanciamos el servicio necesario para los test
	 */
	@Autowired
	UsuarioServicio servicio;
	BCryptPasswordEncoder passwordEncoder;
	
	/**
	 * Test que comprueba que se busque correctamente usuarios por email
	 */
	@Test
	public void buscarPorEmailUsuario() {
		Usuario nuevo = new Usuario("Prueba", "Testemail", "12345678A", "1234", "testBuscarPorEmail@email.com", false);
		servicio.save(nuevo);
		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(nuevo);
		assertEquals(nuevo,servicio.buscarPorEmail("testBuscarPorEmail@email.com"));
		
	}
	
	/**
	 * Test que comprueba que se cifre correctamente las contraseñas de los usuarios
	 */
	@Test
	public void cifradoPasswordTest() {
		//Instanciamos los usuarios
		Usuario nuevo = new Usuario("Prueba", "Testemail", "12345678A", "1234", "pruebaaaa@email.com", false);
		Usuario esperado = new Usuario("Prueba", "Testemail", "12345678A", "1234", "pruebaaaa2@email.com", false);
		esperado.setPassword(passwordEncoder.encode(esperado.getPassword()));
		//Ciframos la contraseña con el metodo del servicio
		nuevo.setPassword(servicio.cifrarPassword(nuevo.getPassword()));
		//passwordEncoder.matches("1234", nuevo.getPassword()) devuelve un boolean si la contraseña cifrada es el string que se le pasa al metodo
		//Comparamos en el assertEquals dos boolean
		assertEquals(true,passwordEncoder.matches("1234", nuevo.getPassword()));
	}
}
