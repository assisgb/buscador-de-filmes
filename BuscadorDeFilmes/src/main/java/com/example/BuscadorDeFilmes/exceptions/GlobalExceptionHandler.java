package com.example.BuscadorDeFilmes.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TituloRuiException.class)
    public ResponseEntity<String> handlerTituloRui(TituloRuiException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
