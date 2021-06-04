package com.projeto.spring.projetospringboot.services.exceptions;

public class ResourcesNotAfoundException extends RuntimeException {
    
    public ResourcesNotAfoundException(Object id){
        super("Resource not found. Id: " + id);
    }

}
