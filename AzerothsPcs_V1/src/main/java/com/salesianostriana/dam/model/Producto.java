package com.salesianostriana.dam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Daniel Santano Fernández
 * Clase anotada con @Data clase padre de productos
 */
@Data 
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Producto {

	/**
	 * Atributos de la clase
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean enOferta;
	private double precioConDescuento;
	private int cantidad;
	private boolean disponible;
	private String imagen;
	private String marca;
	
	/**
	 * Constructor sin el id 
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param enOferta
	 * @param precioConDescuento
	 * @param cantidad
	 * @param disponible
	 * @param imagen
	 * @param marca
	 */
	public Producto(String nombre, String descripcion, double precio, boolean enOferta, double precioConDescuento, int cantidad,
			boolean disponible, String imagen, String marca) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.enOferta = enOferta;
		this.precioConDescuento = precioConDescuento;
		this.cantidad = cantidad;
		this.disponible = disponible;
		this.imagen = imagen;
		this.marca = marca;
	}

}
