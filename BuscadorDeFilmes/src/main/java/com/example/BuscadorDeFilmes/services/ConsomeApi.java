package com.example.BuscadorDeFilmes.services;

import com.example.BuscadorDeFilmes.models.Titulo;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ConsomeApi {

    private final WebClient webClient;// instancia do webclient
    private final TrataEntrada tratador = new TrataEntrada();
    private final String API_KEY = "36f31af9";
    public ConsomeApi(WebClient.Builder webClientBuilder){ //metodo construtor que cria a instancia do webClient com o WebClient builder passando a baseUrL da api como parametro
        this.webClient = webClientBuilder.baseUrl("http://www.omdbapi.com/").build();
    }

    public Mono<Titulo> tituloMono(String titulo) {//mono é quem vai retornar a saída da API formatada
        String titulo_tratado = tratador.tratarEntrada(titulo);
        return this.webClient.get()// SEÇÃO QUE CONFIGURA A SAÍDA
                .uri("?t={titulo}&apikey={API_KEY}", titulo_tratado, API_KEY)
                .retrieve()
                .bodyToMono(Titulo.class);


    }
}
