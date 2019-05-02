package com.salesianostriana.dam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String descripcion;
	private double precio;
	private boolean enOferta;
	private double descuento;
	private int cantidad;
	private boolean disponible;
	private String imagen;
	private String marca;
	
	public Producto(String descripcion, double precio, boolean enOferta, double descuento, int cantidad,
			boolean disponible, String imagen, String marca) {
		
		this.descripcion = descripcion;
		this.precio = precio;
		this.enOferta = enOferta;
		this.descuento = descuento;
		this.cantidad = cantidad;
		this.disponible = disponible;
		this.imagen = imagen;
		this.marca = marca;
	}
	
	


	
	
	
	
}
