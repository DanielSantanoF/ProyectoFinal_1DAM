package com.salesianostriana.dam.FormBean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Daniel Santano Fernández
 * Clase FormBean para la subida de imagenes a productos
 */
@Getter
@Setter
@NoArgsConstructor
public class ProductoFormBean {

	/**
	 * Atributos de todos los productos de esta manera se puede usar este unico FormBean con todos los productos
	 */
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
	//private String tipo; atributo repetido pero accesorio tambien posee un atributo llamado tipo
	private double capacidad;
	//COMPONENTE
	private String memoria;
	private String velocidad;
	private String socket;
	private String tipoMemoria;
}
