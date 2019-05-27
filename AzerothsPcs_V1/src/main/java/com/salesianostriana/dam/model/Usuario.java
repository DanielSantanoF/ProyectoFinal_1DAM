package com.salesianostriana.dam.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Daniel Santano Fernández
 * Clase anotada con @Data clase modelo de usuarios
 */
@Data @NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {

	/**
	 * Atributos de la clase
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String password;
	
	@Column(unique = true)
	private String email;
	
	private boolean admin;
	
	/**
	 * Datos de compra del usuario
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "datosDeCompra_id", referencedColumnName = "id")
	private DatosDeCompra datosDeCompra;

	/**
	 * Constructor sin el id
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param contraseña
	 * @param email
	 * @param admin
	 */
	public Usuario(String nombre, String apellidos, String dni, String contraseña, String email,
			boolean admin) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.password = contraseña;
		this.email = email;
		this.admin = admin;
	}

	/**
	 * Constructor sin el id y con los datos de compra
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param password
	 * @param email
	 * @param admin
	 * @param datosDeCompra
	 */
	public Usuario(String nombre, String apellidos, String dni, String password, String email, boolean admin,
			DatosDeCompra datosDeCompra) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.password = password;
		this.email = email;
		this.admin = admin;
		this.datosDeCompra = datosDeCompra;
	}
		
}
