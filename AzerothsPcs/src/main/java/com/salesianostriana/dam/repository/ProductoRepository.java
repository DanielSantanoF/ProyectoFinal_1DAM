package com.salesianostriana.dam.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.model.Producto;

/**
 * @author Daniel Santano Fernández
 * Clase repositorio de producto
 */
public interface ProductoRepository extends JpaRepository<Producto, Long>{

	/**
	 * Método que devuelve una búsqueda realizada por nombre y le tenemos que pasar
	 * el atributo por el cual deseemos buscar, en nuestro caso, por nombre ignorando las mayúsculas
	 * @param nombre Nombre del producto registrado en nuestra base de datos
	 * @return devuelve el producto buscado por nombre
	 */
	public  List<Producto> findByNombreContainingIgnoreCase(String nombre);
	
	/**
	 * Metodo que devuelve la busqueda por nombre y la pagina
	 * @param nombre nombre a buscar
	 * @param pageable hace que sea paginable
	 * @return devuelve el producto buscado por nombre paginado
	 */
	public  Page<Producto> findByNombreContainingIgnoreCase(String nombre, Pageable pageable);
}
