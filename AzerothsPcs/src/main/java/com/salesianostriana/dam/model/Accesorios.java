package com.salesianostriana.dam.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Daniel Santano Fernández
 * Clase anotada con @Data y hija de producto es un tipo de producto
 */
@Data 
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Accesorios extends Producto{

	/**
	 * Atributos de la clase
	 */
	private String tipo;
	private double capacidad;
}
