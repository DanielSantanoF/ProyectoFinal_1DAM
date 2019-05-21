package com.salesianostriana.dam.service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.repository.ProductoRepository;
import com.salesianostriana.dam.storage.StorageService;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository>{

	@Autowired
	ProductoRepository productoRepository;
	
	@Autowired
	StorageService storageService;
	
	public void add(Producto p, MultipartFile file) {
		
		String fileName = storageService.store(file);//Guarda la imagen
		//Guardamos nombre de la imagen almacenada en el atributo de la entidad
		p.setImagen(fileName);
		//Guardamos la entidad en la base de datos y en ella ya irá el nombre del archivo
		//en la correspondiente propiedad (fileUrl)
		productoRepository.save(p);
		
	}
	
	public List<Producto> list() {
		
		List<Producto> partialResult = productoRepository.findAll();
		List<Producto> result = new LinkedList<Producto>(partialResult);
		
		for(int i = 0; i < partialResult.size(); i++) {
			String fileName = partialResult.get(i).getImagen();
			result.get(i).setImagen(fileName);
		}
						
		return result;
	}
	
	public List<Producto> listaProductosFormBean() {
		
		List<Producto> lista = productoRepository.findAll();
		
		lista = lista.stream().map(p ->{
			p.setImagen("/images/" + p.getImagen());
			return p;
		}).collect(Collectors.toList());
						
		return lista;
	}
	
	
}
