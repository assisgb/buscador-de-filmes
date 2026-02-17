package com.example.BuscadorDeFilmes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Filme extends Titulo{
    @JsonProperty("Runtime")
    private String duracao_total;

    public String getDuracao_total() {
        return duracao_total;
    }

    public void setDuracao_total(String duracao_total) {
        this.duracao_total = duracao_total;
    }
}


