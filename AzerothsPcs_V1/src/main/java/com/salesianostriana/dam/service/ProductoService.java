package com.salesianostriana.dam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.repository.ProductoRepository;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository>{

	private ProductoRepository productoRepository;

	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	public Producto add(Producto p) { return productoRepository.save(p);}
	
	public Producto edit(Producto p) { return productoRepository.save(p);}
	
	public void delete(Producto p) { productoRepository.delete(p);}
	
	public List<Producto> finAll() { return productoRepository.findAll();}
	
	public Producto findById(long id) {
		return productoRepository.findById(id).orElse(null);
	}
	
}
