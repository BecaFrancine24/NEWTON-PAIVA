package Questao1;

import java.util.JFrame;
import java.util.JOptionPane;
import controllers.AchadoPerdido1;


public class AchadoPerdido1 {


	public class ProjetoSocial {
			
			private static AchadoPerdido1 gerenciador = new AchadoPerdido1();
			
			private static final int TITULO = 1;
			private static final int FOTO = 2;
			private static final int LOCAL_ACHADO = 3;
			private static final int TIPO = 4;
			private static final int STATUS = 5;
			private static final int FECHAR_ABA = 6;

			
			public static void main(String[] args) {
			
			Integer opcao = lerOpcaoDoMenu;
			
			while(opcao) {
				swith (opcao){
					case TITULO:
						titulo();
						break
					case FOTO:
							foto();
						break
					case LOCAL_ACHADO:
						localAchado();
					case TIPO:
						tipo();
					case STATUS:
						status();
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
				System.out.println("Titulo"); 
				System.out.println("Foto");
				System.out.println("Local achado:");
				System.out.println("Tipo");
				System.out.println("Status");
				System.out.println("Sair:");
				System.out.print(--------------------------);
				
				String strOpcao = JOptionPane.showInputDialog(null,menu);
				
				return Integer.parseInt(strOpcao);
		}

		//validaProjeto();
		//JOptionPane
	}
}

