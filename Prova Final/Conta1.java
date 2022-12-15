package Questão1;

public class Conta1 {
	private String numero;
	private double saldo;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Conta1(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		//this.saldo=this.saldo+valor;
		this.saldo+=valor;
	}
	
	public void sacar (double valor) {
		if (valor<=this.saldo)
			this.saldo-=valor;
	}
	
	
	}