package com.salesianostriana.dam.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Ordenador extends Producto{

	private String procesador;
	private int ram;
	private String discoDuro;
	private String sistemaOperativo;
	private String tipo;
	private String dimensiones;
	
	
	
	
	
}
