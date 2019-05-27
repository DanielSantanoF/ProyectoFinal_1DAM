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
	 * @param nombre nombre del producto
	 * @param descripcion descripcion del producto
	 * @param precio precio del producto
	 * @param enOferta indica si el producto esta en oferta
	 * @param precioConDescuento el precio digamos final
	 * @param cantidad la cantidad de productos que poseemos
	 * @param disponible indica si el producto esta disponible
	 * @param imagen la imagen del producto
	 * @param marca la marca del producto
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
