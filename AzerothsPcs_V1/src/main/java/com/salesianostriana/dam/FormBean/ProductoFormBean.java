package com.salesianostriana.dam.FormBean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoFormBean {

	private String nombre;
	private String descripcion;
	private double precio;
	private boolean enOferta;
	private double precioConDescuento;
	private int cantidad;
	private boolean disponible;
	private String marca;
	
	public ProductoFormBean() {
		
	}
	
	
	
}
