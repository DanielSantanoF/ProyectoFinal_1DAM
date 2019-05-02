package com.salesianostriana.dam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class LineaDePedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private double pvp;
	private int cantidad;
	private Producto item;
	
	public LineaDePedido(double pvp, int cantidad, Producto item) {
		
		this.pvp = pvp;
		this.cantidad = cantidad;
		this.item = item;
	}

	


	
}
