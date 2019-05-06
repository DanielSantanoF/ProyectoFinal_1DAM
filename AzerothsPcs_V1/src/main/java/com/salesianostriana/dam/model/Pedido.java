package com.salesianostriana.dam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPedido;
	
	private double precioFinal;
	private long idUsuario;
	
	@ManyToOne
	private LineaDePedido lineasPedido;
	
	@ManyToOne
	private Usuario usuarioDelPedido;
	
	public Pedido(double precioFinal, long idUsuario) {
		
		this.precioFinal = precioFinal;
		this.idUsuario = idUsuario;
	}
	
	
	
	/*public double calculoPrecioFinal() {
		for(LineaDePedido l : lineasPedido) {
			precioFinal = precioFinal + l.getPvp();
		}
		
		return precioFinal;
	}*/

	
	
	
	
}
