package exercicioFixacao;

import java.util.ArrayList;

public class pedido {

	private int numPedido;
	private double dataPedido;
	private String nomeCliente;
	
	
	
	public String toString() {
		return "pedido [numPedido=" + numPedido + ", dataPedido=" + dataPedido + ", nomeCliente=" + nomeCliente + "]";
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
