package com.example.BuscadorDeFilmes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Serie extends Titulo{

    @JsonProperty("totalSeasons")
    private String temporadas;

    @JsonProperty("Runtime")
    private String duracao_media_por_episodio;
    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public String getDuracao_media_por_episodio() {
        return duracao_media_por_episodio;
    }

    public void setDuracao_media_por_episodio(String duracao_media_por_episodio) {
        this.duracao_media_por_episodio = duracao_media_por_episodio;
    }
}
