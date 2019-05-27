package com.salesianostriana.dam.storage;

/**
 * @author Daniel Santano Fernández
 * Clase de excepciones del storage
 */
public class StorageException extends RuntimeException {

	/**
	 * Metodo que te muestra el mensaje de la excepcion
	 * @param message
	 */
    public StorageException(String message) {
        super(message);
    }

    /**
     * Metodo que te muestra el mensaje de la excepcion y su causa
     * @param message
     * @param cause
     */
    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
