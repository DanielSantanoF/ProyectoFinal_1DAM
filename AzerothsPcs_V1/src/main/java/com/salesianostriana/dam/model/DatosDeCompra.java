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

@Data 
@NoArgsConstructor
@Entity
@Table(name = "datosDeCompra")
public class DatosDeCompra {

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
