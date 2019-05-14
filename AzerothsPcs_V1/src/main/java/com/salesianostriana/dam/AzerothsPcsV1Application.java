package com.salesianostriana.dam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
			u.setEmail("usuario@email.com");
			u.setPassword(passwordEncoder.encode("1234"));
			
			servicio.save(u);

			
			Usuario a = new Usuario();
			a.setAdmin(true);
			a.setNombre("Admin");
			a.setApellidos("AAdmin");
			a.setEmail("admin@email.com");
			a.setPassword(passwordEncoder.encode("1234"));
			
			servicio.save(a);
		};
	}
	
}
