package Questao1;

import java.util.Scanner;

public class AchadoPerdido implements Publicacao {
	private String titulo; 
	private String descricao; 
	private String foto; 
	private String tipo; 
	private String localAchado; 
	private String dataHora;
	private String status; 

	public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String localAchado, String dataHora) {
	super();
	this.titulo=titulo;
	this.descricao=titulo;
	this.foto=foto;
	this.tipo=tipo;
	this.localAchado=localAchado;
	this.dataHora=dataHora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocalAchado() {
		return localAchado;
	}

	public void setLocalAchado(String localAchado) {
		this.localAchado = localAchado;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	 public void inclementarDados(String foto, String local_achado, String data_hora){

	    }

	    @Override
	    public String buscarTitulo(String titulo) {
	        return "Titulo: "+this.titulo+"\n"+"Descrição: "+descricao+"\n"+"Local Achado: "+local_achado;
	    }

	    @Override
	    public void visualizarDetalhes() {
	        System.out.println("Titulo: "+titulo);
	        System.out.println("Foto: "+foto);
	        System.out.println("Local achado: "+local_achado);
	        System.out.println("Tipo: "+tipo);
	        System.out.println("Status "+status);
	    }
	
}