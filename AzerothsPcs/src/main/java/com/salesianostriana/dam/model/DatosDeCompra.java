package com.salesianostriana.dam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Daniel Santano Fernández
 * Clase anotada con @Data en esta se recogen los datos de compra de los usuarios
 */
@Data 
@NoArgsConstructor
@Entity
@Table(name = "datosDeCompra")
public class DatosDeCompra {

	/**
	 * Atributos de la clase
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	private String tarjetaDeCredito;
	private String codigoPostal;
	private String direccion;
	private String horaEntrega;
	private String comentariosExtra;
	private String telefonoContacto;
	private String emailContacto;
	
	@OneToOne(mappedBy = "datosDeCompra")
	private Usuario usuario;
	
	/**
	 * Contructor sin el id
	 * @param tarjetaDeCredito la tarjeta de credito del usuario
	 * @param codigoPostal el codigo postal del usuario
	 * @param direccion el codigo postal del usuario
	 * @param horaEntrega la hora de entrega marcada por el usuario
	 * @param comentariosExtra posibles comentarios extras
	 * @param telefonoContacto el telefono del usuario
	 * @param emailContacto el email de contacto del usuario
	 */
	public DatosDeCompra(String tarjetaDeCredito, String codigoPostal, String direccion, String horaEntrega,
			String comentariosExtra, String telefonoContacto, String emailContacto) {
		
		this.tarjetaDeCredito = tarjetaDeCredito;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.horaEntrega = horaEntrega;
		this.comentariosExtra = comentariosExtra;
		this.telefonoContacto = telefonoContacto;
		this.emailContacto = emailContacto;
	}

	/**
	 * Constructor sin el id pero con el usuario al que pertenecen estos datos de compra
	 * @param tarjetaDeCredito la tarjeta de credito del usuario
	 * @param codigoPostal el codigo postal del usuario
	 * @param direccion el codigo postal del usuario
	 * @param horaEntrega la hora de entrega marcada por el usuario
	 * @param comentariosExtra posibles comentarios extras
	 * @param telefonoContacto el telefono del usuario
	 * @param emailContacto el email de contacto del usuario
	 * @param usuario el usuario al que pertenecen los datos de compra
	 */
	public DatosDeCompra(String tarjetaDeCredito, String codigoPostal, String direccion, String horaEntrega,
			String comentariosExtra, String telefonoContacto, String emailContacto, Usuario usuario) {
		super();
		this.tarjetaDeCredito = tarjetaDeCredito;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.horaEntrega = horaEntrega;
		this.comentariosExtra = comentariosExtra;
		this.telefonoContacto = telefonoContacto;
		this.emailContacto = emailContacto;
		this.usuario = usuario;
	}


}
