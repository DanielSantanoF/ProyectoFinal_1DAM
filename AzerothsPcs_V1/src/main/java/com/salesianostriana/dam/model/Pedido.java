package com.salesianostriana.dam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

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
	private List<LineaDePedido> lineasPedido = new ArrayList<LineaDePedido>();
	//preguntar sobre como hacer la relacion con usuario
	
	public Pedido(double precioFinal, long idUsuario, List<LineaDePedido> lineasPedido) {
		
		this.precioFinal = precioFinal;
		this.idUsuario = idUsuario;
		this.lineasPedido = lineasPedido;
	}	
	
	public double calculoPrecioFinal() {
		for(LineaDePedido l : lineasPedido) {
			precioFinal = precioFinal + l.getPvp();
		}
		
		return precioFinal;
	}
	
	
	
}
