package exercicioFixacao;

import java.util.ArrayList;

public class pedido {

	private int numPedido;
	private double dataPedido;
	private String nomeCliente;
	private String nomePizza;


	public int getNumPedido() {
		return numPedido;
	}


	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}


	public double getDataPedido() {
		return dataPedido;
	}



	public void setDataPedido(double dataPedido) {
		this.dataPedido = dataPedido;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomePizza() {
		return nomePizza;
	}


	public void setNomePizza(String nomePizza) {
		this.nomePizza = nomePizza;
	}
	
	
	void valor(double valor){
    
		nomePizza = nomePizza + valor;
	}
	






	public static void main(String[] args) {

        String pizza1 = "4 Queijos";
        String pizza2 = "Calabresa";
        String pizza3 = "Carne Seca";
        String pizza4 = "Frango";
        String pizza5 = "Catupiry";
        String pizza6 = "Vegetariana";
       
        

        ArrayList<String> ingrediente = new ArrayList<>();
        ingrediente.add(pizza1);
        ingrediente.add(pizza2);
        ingrediente.add(pizza3);
        ingrediente.add(pizza4);
        ingrediente.add(pizza5); 
        ingrediente.add(pizza6); 
 
        
        
      

    }
	
	
	
	

}
