package exercicioFixacao;
import java.util.ArrayList;



public class pizza {

	private String nome;
	private Float valor;
	private Float tamanho;
	private Boolean possuiBordaRecheada;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Float getTamanho() {
		return tamanho;
	}
	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}
	public Boolean getPossuiBordaRecheada() {
		return possuiBordaRecheada;
	}
	public void setPossuiBordaRecheada(Boolean possuiBordaRecheada) {
		this.possuiBordaRecheada = possuiBordaRecheada;
	}
	
	public static void main(String[] args) {

        String ingrediente1 = "Massa";
        String ingrediente2 = "Molho de Tomate";
        String ingrediente3 = "Ketchup";
        String ingrediente4 = "Frango";
        String ingrediente5 = "Catupiry";
        String ingrediente6 = "Pimentão";
        String ingrediente7 = "Milho";
        String ingrediente8 = "Molho Bolonhesa";
        String ingrediente9 = "Bacon";
        String ingrediente10 = "Queijo";
        

        ArrayList<String> ingrediente = new ArrayList<>();
        ingrediente.add(ingrediente1);
        ingrediente.add(ingrediente2);
        ingrediente.add(ingrediente3);
        ingrediente.add(ingrediente4);
        ingrediente.add(ingrediente5); 
        ingrediente.add(ingrediente6); 
        ingrediente.add(ingrediente7); 
        ingrediente.add(ingrediente8); 
        ingrediente.add(ingrediente9);
        ingrediente.add(ingrediente10);
        
        
      

    }
	
	
	
}
