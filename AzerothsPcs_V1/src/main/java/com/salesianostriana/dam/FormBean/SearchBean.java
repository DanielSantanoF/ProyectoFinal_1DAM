package com.salesianostriana.dam.FormBean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Daniel Santano Fernández
 * Clase para controlar la busqueda por nombre para la paginacion
 */
@Getter
@Setter
@NoArgsConstructor
public class SearchBean {

	/**
	 * Cadena de caracteres tipo String a la que se le pasa lo que queremos buscar
	 * en nuestro bucle para mostrarlo en nuestra plantilla
	 */
	private String search;
	
}
