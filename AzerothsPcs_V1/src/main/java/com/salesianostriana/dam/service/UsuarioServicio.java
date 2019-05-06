package com.salesianostriana.dam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.repository.UsuarioRepository;

@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepository>{

	private UsuarioRepository usuarioRepository;
	
	public UsuarioServicio(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario add(Usuario u) { return usuarioRepository.save(u);}
	
	public Usuario edit(Usuario u) { return usuarioRepository.save(u);}
	
	public void delete(Usuario u) { usuarioRepository.delete(u);}
	
	public void delete(long id) { usuarioRepository.deleteById(id); }
	
	public List<Usuario> finAll() { return usuarioRepository.findAll();}
	
	public Usuario findById(long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
}
