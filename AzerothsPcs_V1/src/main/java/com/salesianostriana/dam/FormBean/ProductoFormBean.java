package com.salesianostriana.dam.FormBean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductoFormBean {

	//PRODUCTO
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean enOferta;
	private double precioConDescuento;
	private int cantidad;
	private boolean disponible;
	private String marca;
	//ORDENADOR
	private String procesador;
	private int ram;
	private String discoDuro;
	private String sistemaOperativo;
	private String tipo;
	private String dimensiones;
	//ACCESORIO
	//private String tipo;
	private double capacidad;
	//COMPONENTE
	private String memoria;
	private String velocidad;
	private String socket;
	private String tipoMemoria;
}
