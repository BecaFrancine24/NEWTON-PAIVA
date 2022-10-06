package Questao2;

import java.util.JFrame;
import java.util.JOptionPane;
import controllers.ValidacaoProjeto;


public class ProjetoSocial {
		
		private static ValidacaoProjeto gerenciador = new ValidacaoProjeto();
		
		private static final int OPCAO1 = 1;
		private static final int OPCAO2 = 2;
		private static final int OPCAO3 = 3;
		private static final int FECHAR_ABA = 4;

		
		public static void main(String[] args) {
		
		Integer opcao = lerOpcaoDoMenu;
		
		while(opcao) {
			swith (opcao){
				case OPCAO1:
					distribuicaoDeAlimentos();
					break
				case OPCAO2:
						trabalhoVoluntario();
					break
				case OPCAO3:
					Sair();
					break
				case FECHAR_ABA:
					JOptionPane.showMessageDialog(null,"[Fechar Aba!]");
					break;
				default:
					 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
					 break;
			}
			
			opcao = lerOpcaoDoMenu();
		}
		
		private static Integer lerOpcaoDoMenu(){
			System.out.println("---------Menu---------");
			System.out.println("1 - Distribuição de Alimentos:"); 
			System.out.println("Sair:");
			System.out.print(--------------------------);
			
			String strOpcao = JOptionPane.showInputDialog(null,menu);
			
			return Integer.parseInt(strOpcao);
	}

	//validaProjeto();
	//JOptionPane
}
