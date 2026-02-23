package com.example.BuscadorDeFilmes.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Titulo {

    @JsonProperty("Title")
    private String nome;

    @JsonProperty("Released")
    private String lancamento;

    @JsonProperty("Genre")
    private String genero;

    @JsonProperty("Director")
    private String diretor;

    @JsonProperty("Writer")
    private String escritor;

    @JsonProperty("Actors")
    private String atores_principais;

    @JsonProperty("Plot")
    private String trama;

    @JsonProperty("imdbRating")
    private String avaliacao_imdb;

    @JsonProperty("Poster")
    private String poster;

    @JsonProperty("totalSeasons")
    private String totalTemporadas;

    @JsonIgnore
    private boolean isSeries;

    private void isSeries(){
        if(this.totalTemporadas != "N/A"){this.isSeries = false;}
        else{this.isSeries = true;}

    }

    public String getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(String totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }
    @JsonIgnore
    public Titulo(String nome, String lancamento, String genero, String diretor, String escritor, String atores_principais, String trama, String avaliacao_imdb, String poster, String totalTemporadas) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.genero = genero;
        this.diretor = diretor;
        this.escritor = escritor;
        this.atores_principais = atores_principais;
        this.trama = trama;
        this.avaliacao_imdb = avaliacao_imdb;
        this.poster = poster;
        this.totalTemporadas = totalTemporadas;
        isSeries();
    }
    public Titulo(){}

    public String getNome() {
        return nome;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getAtores_principais() {
        return atores_principais;
    }

    public void setAtores_principais(String atores_principais) {
        this.atores_principais = atores_principais;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public String getAvaliacao_imdb() {
        return avaliacao_imdb;
    }

    public void setAvaliacao_imdb(String avaliacao_imdb) {
        this.avaliacao_imdb = avaliacao_imdb;
    }

    public boolean isGood(){
        if(Float.parseFloat(avaliacao_imdb)  >=7 && Float.parseFloat(avaliacao_imdb) <=10){
            return true;
        }
        else{return false;}
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", lancamento='" + lancamento + '\'' +
                ", genero='" + genero + '\'' +
                ", diretor='" + diretor + '\'' +
                ", escritor='" + escritor + '\'' +
                ", atores_principais='" + atores_principais + '\'' +
                ", trama='" + trama + '\'' +
                ", avaliacao_imdb='" + avaliacao_imdb + '\'' +
                '}';
    }
}
