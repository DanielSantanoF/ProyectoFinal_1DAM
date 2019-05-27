package com.salesianostriana.dam.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.salesianostriana.dam.model.Producto;
import com.salesianostriana.dam.repository.ProductoRepository;
import com.salesianostriana.dam.storage.StorageService;

/**
 * @author Daniel Santano Fernández
 * Clase servicio de producto
 */
@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository>{

	/**
	 * Lo necesario para la clase
	 */
	@Autowired
	ProductoRepository productoRepository;
	
	@Autowired
	StorageService storageService;
	
	/**
	 * Metodo para guardar una imagen en un producto usando el form bean
	 * @param p
	 * @param file
	 */
	public void add(Producto p, MultipartFile file) {
		
		String fileName = storageService.store(file);//Guarda la imagen
		//Guardamos nombre de la imagen almacenada en el atributo de la entidad
		p.setImagen("/images/" +fileName);
		//Guardamos la entidad en la base de datos y en ella ya irá el nombre del archivo
		//en la correspondiente propiedad (fileUrl)
		productoRepository.save(p);
		
	}
	
	/**
	 * Metodo que se usa para concatenar el /images/ en la imagen de los productos en caso de ser necesario
	 * @return la lista concatenada
	 */
	public List<Producto> listaProductosFormBean() {
		
		List<Producto> lista = productoRepository.findAll();
		
		lista = lista.stream().map(p ->{
			p.setImagen("/images/" + p.getImagen());
			return p;
		}).collect(Collectors.toList());
						
		return lista;
	}
	
	/**
	 * Metodo que devuelve todos los productos para poder ser paginados
	 * @param pageable
	 * @return todos los productos
	 */
	public Page<Producto> findAllPageable(Pageable pageable) {
        return productoRepository.findAll(pageable);
    }
	
	/**
	 * Busca en producto por el nombre
	 * @param nombre
	 * @return producto encontrado
	 */
	public List<Producto> findByNombre(String nombre){
		return productoRepository.findByNombreContainingIgnoreCase(nombre);
	}

	/**
	 * Metodo que busca por nombre y pagina los prodictos encontrados
	 * @param nombre
	 * @param pageable
	 * @return productos encontrados
	 */
	public  Page<Producto> findByNombreContainingIgnoreCasePageable(String nombre, Pageable pageable){
		return productoRepository.findByNombreContainingIgnoreCase(nombre, pageable);
	}
	
}
