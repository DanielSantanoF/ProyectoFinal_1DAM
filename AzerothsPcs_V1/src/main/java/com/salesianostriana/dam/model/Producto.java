package com.salesianostriana.dam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean enOferta;
	private double descuento;
	private int cantidad;
	private boolean disponible;
	private String imagen;
	private String marca;
	
	public Producto(String nombre, String descripcion, double precio, boolean enOferta, double descuento, int cantidad,
			boolean disponible, String imagen, String marca) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.enOferta = enOferta;
		this.descuento = descuento;
		this.cantidad = cantidad;
		this.disponible = disponible;
		this.imagen = imagen;
		this.marca = marca;
	}

	public Producto(String nombre, String descripcion, double precio, int cantidad, String imagen, String marca) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.imagen = imagen;
		this.marca = marca;
	}

	//CONSTRUCTO PARA PRODAR A AÑADIR PRODUCTOS
	
	
	
	
	
	
	


	
	
	
	
}
