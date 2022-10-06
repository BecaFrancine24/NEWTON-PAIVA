package Questao2;

public class TrabalhoVoluntario extends Projeto {
	
	private String trabalho;
	private String duracaoTrabalho;
	
	public TrabalhoVoluntario(String trabalho, String duracaoTrabalho) {
		this.trabalho=trabalho;
		this.duracaoTrabalho=duracaoTrabalho;
	}

	public String getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(String trabalho) {
		this.trabalho = trabalho;
	}

	public String getDuracaoTrabalho() {
		return duracaoTrabalho;
	}

	public void setDuracaoTrabalho(String duracaoTrabalho) {
		this.duracaoTrabalho = duracaoTrabalho;
	}
	
	@Override
	public boolean validaProjeto(String nomeProjeto) {
	    // TODO Auto-generated method stub
	    return false;
	}

	@Override
	public String imprimeProjeto() {
	    // TODO Auto-generated method stub
	    return null;
	}


