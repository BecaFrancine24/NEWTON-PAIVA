package br.com.exemplo.classe;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String mostrar(){
        return getNome() + " " + getMatricula();
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}
