package com.salesianostriana.dam.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.repository.UsuarioRepository;

@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepository>{

	BCryptPasswordEncoder passwordEncoder;
	
	public Usuario buscarPorEmail(String email) {
		return repositorio.findFirstByEmail(email);
	}
	
	public List<Usuario> cifrarPasswordUsuarios() {
		
		List<Usuario> lista = findAll();
		
		lista = lista.stream().map(u ->{
			u.setPassword(passwordEncoder.encode(u.getPassword()));
			return u;
		}).collect(Collectors.toList());
						
		return lista;
	}
	
}
