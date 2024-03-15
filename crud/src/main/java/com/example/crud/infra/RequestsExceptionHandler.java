package com.example.crud.infra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class RequestsExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class) 
    public ResponseEntity threat404(){
        var response = new ExceptionDTO("Dado não encontrado"); 
        // System.out.println(response.message);
        return ResponseEntity.badRequest().body(response.message);

    }
}
