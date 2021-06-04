package com.projeto.spring.projetospringboot.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import com.projeto.spring.projetospringboot.services.exceptions.ResourcesNotAfoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ResourcesNotAfoundException.class)
    public ResponseEntity<StandardError> resourceNotAfound(ResourcesNotAfoundException e, HttpServletRequest request){
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
