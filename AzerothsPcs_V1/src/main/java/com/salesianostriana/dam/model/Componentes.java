package com.salesianostriana.dam.model;

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
public class Componentes extends Producto{

	private String memoria;
	private String velocidad;
	private String socket;
	private String tipoMmemoria;
}