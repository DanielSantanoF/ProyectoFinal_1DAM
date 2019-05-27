package com.salesianostriana.dam.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Daniel Santano Fernández
 * Clase de las propiedades del storage
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "files";

    /**
     * Metodo para decir la localicacion del archivo
     * @return localizacion del archivo
     */
    public String getLocation() {
        return location;
    }

    /**
     * Metodo para indicar la localizacion del archivo
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

}
