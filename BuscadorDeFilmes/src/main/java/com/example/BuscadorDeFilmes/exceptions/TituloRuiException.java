package com.example.BuscadorDeFilmes.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


public class TituloRuiException extends RuntimeException{
    public TituloRuiException(String message){super(message);}
}
