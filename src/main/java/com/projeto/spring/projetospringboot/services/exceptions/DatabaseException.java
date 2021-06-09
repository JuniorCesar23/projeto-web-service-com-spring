package com.projeto.spring.projetospringboot.services.exceptions;

public class DatabaseException extends RuntimeException {
    
    public DatabaseException(String msg){
        super(msg);
    }

}
