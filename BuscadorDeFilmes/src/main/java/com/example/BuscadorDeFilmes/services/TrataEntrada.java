package com.example.BuscadorDeFilmes.services;

public class TrataEntrada {
    private String nome_titulo;
    public String tratarEntrada(String nome){
        nome_titulo = nome.toLowerCase();
        nome_titulo = nome_titulo.replaceAll(" ", "+");
        return nome_titulo;
    }
}
