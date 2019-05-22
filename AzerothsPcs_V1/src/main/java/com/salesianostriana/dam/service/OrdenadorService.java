package com.salesianostriana.dam.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Ordenador;
import com.salesianostriana.dam.repository.OrdenadorRepository;

@Service
public class OrdenadorService extends BaseService<Ordenador, Long, OrdenadorRepository>{

	@Autowired
	OrdenadorRepository ordenadorRepository;
	
	public List<Ordenador> listaOrdenadoresFormBean() {
		
		List<Ordenador> lista = ordenadorRepository.findAll();
		
		lista = lista.stream().map(p ->{
			p.setImagen("/images/" + p.getImagen());
			return p;
		}).collect(Collectors.toList());
						
		return lista;
	}
}
