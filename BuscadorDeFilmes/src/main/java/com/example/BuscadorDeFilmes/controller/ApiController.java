package com.example.BuscadorDeFilmes.controller;

import com.example.BuscadorDeFilmes.models.Filme;
import com.example.BuscadorDeFilmes.models.Titulo;
import com.example.BuscadorDeFilmes.services.ConsomeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class ApiController {
    @Autowired
    private ConsomeApi consomeApi;

    @GetMapping("/teste/titulo")
    public Mono<Filme> tituloMono(@RequestParam String titulo){
        return consomeApi.tituloMono(titulo);
    }

}
