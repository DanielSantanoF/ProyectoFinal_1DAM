package com.salesianostriana.dam.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Accesorios;
import com.salesianostriana.dam.repository.AccesoriosRepository;

@Service
public class AccesoriosService extends BaseService<Accesorios, Long, AccesoriosRepository>{

	@Autowired
	AccesoriosRepository accesoriosRepository;
	
	public List<Accesorios> listaAccesoriosFormBean() {
		
		List<Accesorios> lista = accesoriosRepository.findAll();
		
		lista = lista.stream().map(p ->{
			p.setImagen("/images/" + p.getImagen());
			return p;
		}).collect(Collectors.toList());
						
		return lista;
	}
}
