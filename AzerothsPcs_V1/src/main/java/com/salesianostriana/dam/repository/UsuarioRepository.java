package com.salesianostriana.dam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.model.Usuario;

/**
 * @author Daniel Santano Fernández
 * Clase repositorio de usuario
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	/**
	 * Busca a los usuarios primero por el email se usa en el login y en la seguridad
	 * @param email
	 * @return email buscado
	 */
	Usuario findFirstByEmail(String email);
}
