package br.com.exemplo3;
import java.util.ArrayList;

public class RevistaCientifica {
    private String titulo;
    private long issn;
    private String peridiocidade;
    private Edição edioes;

    public RevistaCientifica(String titulo, long issn, String peridiocidade, Edição edioes) {
        this.titulo = titulo;
        this.issn = issn;
        this.peridiocidade = peridiocidade;
        this.edioes = edioes;
    }
}
