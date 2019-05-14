package com.salesianostriana.dam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String password;
	
	@Column(unique = true)
	private String email;
	
	private boolean admin;

	public Usuario(String nombre, String apellidos, String dni, String contraseña, String email,
			boolean admin) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.password = contraseña;
		this.email = email;
		this.admin = admin;
	}


	
}
