package br.com.exemplo3;

import java.util.ArrayList;

public class Edição {
    private int numero;
    private int volume;
    private String dataEdicao;
    private int tiragem;

    private ArrayList<Artigo> artigos;

    public Edição(int numero, int volume, String dataEdicao, int tiragem) {
        this.numero = numero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.tiragem = tiragem;
        artigos =  new ArrayList<>();
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public int getNumero() {
        return numero;
    }

    public int getVolume() {
        return volume;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public int getTiragem() {
        return tiragem;
    }


    public void adicionaArtigo(Artigo artigo){
        artigos.add(artigo);

    }
}

