package com.salesianostriana.dam.storage;

/**
 * @author Daniel Santano Fernández
 * Clase de excepciones not found del storage
 */
public class StorageFileNotFoundException extends StorageException {

	/**
	 * Metodo que te muestra el mensaje de la excepcion
	 * @param message
	 */
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    /**
     * Metodo que te muestra el mensaje de la excepcion y su causa
     * @param message
     * @param cause
     */
    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
