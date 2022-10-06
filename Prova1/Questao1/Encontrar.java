package Questao1;

public class Encontrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner ler = new Scanner(System.in);

	        System.out.println("Entre com um nome: ");
	        String nome = ler.nextLine();
	        System.out.println("Entre com um email: ");
	        String email = ler.nextLine();
	        System.out.println("Entre com uma senha: ");
	        String senha = ler.nextLine();

	        Usuario user = new Usuario(nome, email, senha);
	        
	        System.out.println("Entre com um titulo: ");
	        String titulo = ler.nextLine();
	        System.out.println("Entre com uma descrição: ");
	        String desc = ler.nextLine();
	        System.out.println("Entre com um tipo: ");
	        String tipo = ler.nextLine();
	        System.out.println("Entre com um status: ");
	        String status = ler.nextLine();

	        AchadoPerdido ap = new AchadoPerdido(titulo, desc, tipo, status);

	        
	        System.out.println();
	        System.out.println();

	        System.out.println("Entre com um Titulo: ");
	        System.out.println("Busca Concluída!!! ");
	        System.out.println(ap.buscarTitulo(titulo));

	        System.out.println();
	        System.out.println("Visualizar detales");
	        ap.visualizarDetalhes();

	        ler.close();

	    }
	
	}


