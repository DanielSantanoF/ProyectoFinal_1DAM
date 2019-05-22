package com.salesianostriana.dam.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Componentes;
import com.salesianostriana.dam.repository.ComponentesRepository;

@Service
public class ComponentesService extends BaseService<Componentes, Long, ComponentesRepository>{

	@Autowired
	ComponentesRepository componentesRepository;
	
	public List<Componentes> listaComponentesFormBean() {
		
		List<Componentes> lista = componentesRepository.findAll();
		
		lista = lista.stream().map(p ->{
			p.setImagen("/images/" + p.getImagen());
			return p;
		}).collect(Collectors.toList());
						
		return lista;
	}
}
