package com.example.BuscadorDeFilmes.services;

import com.example.BuscadorDeFilmes.exceptions.TituloRuiException;
import com.example.BuscadorDeFilmes.models.Filme;
import com.example.BuscadorDeFilmes.models.Serie;
import com.example.BuscadorDeFilmes.models.Titulo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ConsomeApi {

    private final WebClient webClient;// instancia do webclient
    private final TrataEntrada tratador = new TrataEntrada();
    private final String API_KEY = "36f31af9";
    public ConsomeApi(WebClient.Builder webClientBuilder){ //metodo construtor que cria a instancia do webClient com o WebClient builder passando a baseUrL da api como parametro
        this.webClient = webClientBuilder.baseUrl("http://www.omdbapi.com/").build();
    }

    public Mono<Filme> tituloMono(String titulo){//mono é quem vai retornar a saída da API formatada
        String titulo_tratado = tratador.tratarEntrada(titulo);
        return this.webClient.get()// SEÇÃO QUE CONFIGURA A SAÍDA
                .uri("?t={titulo}&apikey={API_KEY}", titulo_tratado, API_KEY)
                .retrieve()
                .bodyToMono(Filme.class)
                .flatMap( titulo1-> {
                    if(titulo1.isGood()){
                        System.out.println("É bom");
                        return Mono.just(titulo1);
                    }
                    else{return Mono.error(new TituloRuiException("É rui"));}
                });
    }




}
