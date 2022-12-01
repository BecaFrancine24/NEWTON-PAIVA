/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package view;
import java.util.Date;
/**
 *
 * @author Micro
 */



public class Mensagem {
    
    private String conteudo;
    private Date dataHoraEnvio;
    private Perfil autor;

    public Perfil getAutor() {
        return autor;
    }

    public void setAutor(Perfil autor) {
        this.autor = autor;
    }

    public Mensagem(String conteudo, Date dataHoraEnvio, Perfil autor) {
        this.conteudo = conteudo;
        this.dataHoraEnvio = dataHoraEnvio;
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getDataHoraEnvio() {
        return dataHoraEnvio;
    }

    public void setDataHoraEnvio(Date dataHoraEnvio) {
        this.dataHoraEnvio = dataHoraEnvio;
    }

    @Override
    public String toString() {
        return " - - -  [ "+autor.getNome()+" ] " + conteudo + "\n\t" + dataHoraEnvio + "\n\t";
    }


}
