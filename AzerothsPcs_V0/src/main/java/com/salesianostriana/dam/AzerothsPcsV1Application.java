package com.salesianostriana.dam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.salesianostriana.dam.model.DatosDeCompra;
import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.service.UsuarioServicio;

@SpringBootApplication
public class AzerothsPcsV1Application {

	public static void main(String[] args) {
		SpringApplication.run(AzerothsPcsV1Application.class, args);
	}

	@Bean
	public CommandLineRunner init(UsuarioServicio servicio, BCryptPasswordEncoder passwordEncoder) {
		return args -> {
			
			Usuario u = new Usuario();
			u.setAdmin(false);
			u.setNombre("Usuario");
			u.setApellidos("AUsuario");
			u.setDni("12345678B");
			u.setEmail("usuario@usuario.com");
			u.setPassword(passwordEncoder.encode("1234"));
			u.setDatosDeCompra(new DatosDeCompra("67099516928448881", "4", "East", "4:42 AM", "K", "613-803-0436", "astilgo8@youku.com"));
			servicio.save(u);

			
			Usuario a = new Usuario();
			a.setAdmin(true);
			a.setNombre("Admin");
			a.setApellidos("AAdmin");
			a.setDni("12345678A");
			a.setEmail("admin@admin.com");
			a.setPassword(passwordEncoder.encode("admin"));
			a.setDatosDeCompra(new DatosDeCompra("5007660582336411", "6", "Blue Bill Park", "1:07 AM", "L", "780-167-2805", "lblinkhorn9@jiathis.com"));
			servicio.save(a);
		};
	}
	
}
