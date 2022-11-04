package br.com.exemplo3;

import javax.swing.JOptionPane;

public class RevistaA {

    int numero;
    int volume;
    String dataEdicao;
    int tiragem;
    String tituloRevista;
    long issn;
    String titulo, resumo, autores;

    tituloRevista=JOptionPane.showInputDialog("Titulo da Revista");
    issn=Long.parseLong(JOptionPane.showInputDialog("ISSN"));
    periodicidade=JOptionPane.showInputDialog("Periodicidade");

    numero=Integer.parseInt(JOptionPane.showInputDialog("Numero"));
    volume=Integer.parseInt(JOptionPane.showInputDialog("Volume"));
    tiragem=Integer.parseInt(JOptionPane.showInputDialog("Tiragem"));
    dataEdicao=Integer.parseInt(JOptionPane.showInputDialog("Data da Edição"));

    Edicao ed1 =  new edicao (numero,volume,dataEdicao, tiragem);
    RevistaCientifica revista 1 = new RevistaCientifica(tituloRevista,issn,periodicidade);


    ArrayList<Artigo> artigos =  new ArrayList <>();
    for (int i=0; i<10; i++;){
        titulo=JOptionPane.showInputDialog("Digete titulo do Artigo");
        resumo=JOptionPane.showInputDialog("resumo");
        Autores=JOptionPane.showInputDialog("Autores");
        Artigos.add=(new Artigo (titulo, resumo, autores));
        ed1.adicionaArtigo(artigo.get(i));

    }

}
