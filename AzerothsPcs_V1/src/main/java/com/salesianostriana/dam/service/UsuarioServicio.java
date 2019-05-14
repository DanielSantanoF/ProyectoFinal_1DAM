package com.salesianostriana.dam.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.repository.UsuarioRepository;

@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepository>{

	public Usuario buscarPorEmail(String email) {
		return repositorio.findFirstByEmail(email);
	}
	
}
