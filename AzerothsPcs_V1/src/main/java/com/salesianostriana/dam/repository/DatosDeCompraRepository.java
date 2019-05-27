package com.salesianostriana.dam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.model.DatosDeCompra;

/**
 * @author Daniel Santano Fernández
 * Clase repositorio de datos de compra
 */
public interface DatosDeCompraRepository extends JpaRepository<DatosDeCompra, Long>{

}
