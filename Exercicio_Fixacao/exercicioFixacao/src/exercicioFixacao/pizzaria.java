package exercicioFixacao;

import java.util.Scanner;

public class pizzaria {

	public static void main(String[] args) {
		
		
		String  nome, opcao;
		
		Scanner pizza =  new Scanner (System.in);
		
		System.out.println("Seja bem Vindo a Pizzaria Casa Nostra ");
	
		System.out.println("Digite seu nome: ");
		nome = pizza.next();
		System.out.println("Digite a opção:1. Mussarela\r\n"
				+ "2. Bacon\r\n"
				+ "3. Presunto\r\n"
				+ "4. Frango\r\n"
				+ "5. Requeijão\r\n"
				+ "6. Possui borda\r\n"
				+ "7. Deseja outra pizza?\r\n"
				+ "8. Finalizar ");
		opcao = pizza.next();
		System.out.println("Obrigada pela a preferência!");

	}

}
