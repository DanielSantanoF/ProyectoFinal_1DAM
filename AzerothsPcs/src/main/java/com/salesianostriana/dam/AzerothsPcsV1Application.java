package com.salesianostriana.dam;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.salesianostriana.dam.model.DatosDeCompra;
import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.service.UsuarioServicio;
import com.salesianostriana.dam.storage.StorageProperties;
import com.salesianostriana.dam.storage.StorageService;

/**
 * @author Daniel Santano Fernández
 * Clase principal que hace arrancar la aplicación
 */
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class AzerothsPcsV1Application {

	/**
	 * El main de la aplicación
	 * @param args el comando que inicia la aplicacion
	 */
	public static void main(String[] args) {
		SpringApplication.run(AzerothsPcsV1Application.class, args);
	}
	
	/**
	 * Usamos este bean para instanciar el StorageService necesario para la subida de imagenes a productos
	 * @param storageService el servicio de storage que usamos para subir imagenes a productos
	 * @return args El storageService.init
	 */
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			//storageService.deleteAll();
            storageService.init();
		};
	}

	/**
	 * Usamos este bean para encriptar todas las contraseñas de los usuarios
	 * @param servicio el usuario servicio
	 * @param passwordEncoder el encriptador de contraseñas
	 * @return args las contraseñas ya modificadas
	 */
	@Bean
	public CommandLineRunner init(UsuarioServicio servicio, BCryptPasswordEncoder passwordEncoder) {
		return args -> {
			
			Usuario u = new Usuario();
			u.setAdmin(false);
			u.setNombre("Usuario");
			u.setApellidos("AUsuario");
			u.setDni("12345678B");
			u.setEmail("usuario@usuario.com");
			u.setPassword("1234");
			u.setDatosDeCompra(new DatosDeCompra("67099516928448881", "4", "East", "4:42 AM", "K", "613-803-0436", "astilgo8@youku.com"));
			servicio.save(u);

			
			Usuario a = new Usuario();
			a.setAdmin(true);
			a.setNombre("Admin");
			a.setApellidos("AAdmin");
			a.setDni("12345678A");
			a.setEmail("admin@admin.com");
			a.setPassword("admin");
			a.setDatosDeCompra(new DatosDeCompra("5007660582336411", "6", "Blue Bill Park", "1:07 AM", "L", "780-167-2805", "lblinkhorn9@jiathis.com"));
			servicio.save(a);
			
			//Cifrar contraseña de los usuarios en el data sql
			List<Usuario> lista = servicio.findAll();
			
			for(Usuario user : lista) {
				user.setPassword(passwordEncoder.encode(user.getPassword()));
				servicio.save(user);
			}
		};
	}
	
}
