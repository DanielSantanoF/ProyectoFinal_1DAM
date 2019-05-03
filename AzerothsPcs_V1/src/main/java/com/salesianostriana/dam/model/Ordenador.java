package com.salesianostriana.dam.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data 
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Ordenador extends Producto{

	private String procesador;
	private int ram;
	private String discoDuro;
	private String sistemaOperativo;
	private String tipo;
	private String dimensiones;
	
	public Ordenador(String nombre, String descripcion, double precio, boolean enOferta, double descuento, int cantidad,
			boolean disponible, String imagen, String marca, String procesador, int ram, String discoDuro,
			String sistemaOperativo, String tipo, String dimensiones) {
		super(nombre, descripcion, precio, enOferta, descuento, cantidad, disponible, imagen, marca);
		this.procesador = procesador;
		this.ram = ram;
		this.discoDuro = discoDuro;
		this.sistemaOperativo = sistemaOperativo;
		this.tipo = tipo;
		this.dimensiones = dimensiones;
	}
	
	
	
	
}
