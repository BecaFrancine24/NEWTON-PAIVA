package br.com.Rendimento;

public class Rendimento {
	private double investIncial;
	private double taxaRendimento;
	private int numMeses;
	public Rendimento(double investIncial, double taxaRendimento, int numMeses) {
		super();
		this.investIncial = investIncial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;
	}
	public double getInvestIncial() {
		return investIncial;
	}
	public void setInvestIncial(double investIncial) {
		this.investIncial = investIncial;
	}
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	public int getNumMeses() {
		return numMeses;
	}
	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	public void calculaRendimento() {
		double rendimentoMes;
		rendimentoMes=getInvestIncial(); 
		for(int i=0;i<getNumMeses();i++) {
			rendimentoMes=rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
		System.out.println("Mês " + (i+1) + " :	" + rendimentoMes);
	}
		}
}
