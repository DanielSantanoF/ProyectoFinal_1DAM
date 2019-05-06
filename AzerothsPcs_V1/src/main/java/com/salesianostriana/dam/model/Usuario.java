package com.salesianostriana.dam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data @NoArgsConstructor
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NonNull private String nombre;
	private String apellidos;
	private String dni;
	private String contrasenya;
	private String email;
	private boolean admin;

	//preguntar uso nonnull

	public Usuario(String nombre, String apellidos, String dni, String contraseña, String email,
			boolean admin) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.contrasenya = contraseña;
		this.email = email;
		this.admin = admin;
	}


	
}
