package com.salesianostriana.dam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@Entity
public class LineaDePedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private double pvp;
	private int cantidad;
	
	@ManyToOne
	private Producto item;
	
	/*@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy="LineasDePedido")
	private List<Pedido> lineasDePedido = new ArrayList<>();*/
	
	public LineaDePedido(double pvp, int cantidad) {
		super();
		this.pvp = pvp;
		this.cantidad = cantidad;
	}
	
	public LineaDePedido(double pvp, int cantidad, Producto item) {
		
		this.pvp = pvp;
		this.cantidad = cantidad;
		this.item = item;
	}


	


	
}
