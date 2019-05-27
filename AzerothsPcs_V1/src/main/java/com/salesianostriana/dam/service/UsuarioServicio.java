package com.salesianostriana.dam.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Usuario;
import com.salesianostriana.dam.repository.UsuarioRepository;

/**
 * @author Daniel Santano Fernández
 * Clase servicio de Usuario
 */
@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepository>{

	/**
	 * Lo necesario para el servicio
	 */
	BCryptPasswordEncoder passwordEncoder;
	UsuarioRepository usuarioRepository;
	
	/**
	 * Construcoor del repositorio
	 * @param usuarioRepository
	 */
	public UsuarioServicio(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	/**
	 * Busca usuarios por el email
	 * @param email
	 * @return usuario encontrado
	 */
	public Usuario buscarPorEmail(String email) {
		return repositorio.findFirstByEmail(email);
	}
	
	/**
	 * Metodo para cifrar la contraseña de todos los usuarios
	 * @return lista con contraseñas cifradas
	 */
	public List<Usuario> cifrarPasswordUsuarios() {
		
		List<Usuario> lista = findAll();
		
		lista = lista.stream().map(u ->{
			u.setPassword(passwordEncoder.encode(u.getPassword()));
			return u;
		}).collect(Collectors.toList());
						
		return lista;
	}
	

	/**
	 * Metodo que devuelve todos los usuarios para poder ser paginados
	 * @param pageable
	 * @return lista paginable
	 */
    public Page<Usuario> findAllPageable(Pageable pageable) {
        return usuarioRepository.findAll(pageable);
    }
	
}
