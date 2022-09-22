package estoque;

	public class estoque  {
		private String nome;
		private int qtaAtual;
		private int qtdMinima;
		
		public estoque() {
			
		}
		public estoque(String nome, int qtaAtual, int qtdMinima) {
			super();
			this.nome = nome;
			this.qtaAtual = qtaAtual;
			this.qtdMinima = qtdMinima;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getQtaAtual() {
			return qtaAtual;
		}
		public void setQtaAtual(int qtaAtual) {
			this.qtaAtual = qtaAtual;
		}
		public int getQtdMinima() {
			return qtdMinima;
		}
		public void setQtdMinima(int qtdMinima) {
			this.qtdMinima = qtdMinima;
		}
		
		public void darBaixa(int qtde) {
			if(qtde<=this.qtaAtual)
				this.qtaAtual-=qtde;
			else
				System.out.println("Impossível de dar baixa no estoque");
			
		}
		
		public boolean precisaRepor(){
			if (this.qtaAtual<=this.getQtdMinima())
				return true;
			else
				return false;
	
		}
		
		public String mostra(){
			return "produto:" + getNome() + "\nEstoque Atual: " + getQtaAtual() + "\nEstoque Mínimo:" + getQtdMinima();
		}
	
}package estoque;

public class estoque  {
	private String nome;
	private int qtaAtual;
	private int qtdMinima;
	
	public estoque() {
		
	}
	public estoque(String nome, int qtaAtual, int qtdMinima) {
		super();
		this.nome = nome;
		this.qtaAtual = qtaAtual;
		this.qtdMinima = qtdMinima;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtaAtual() {
		return qtaAtual;
	}
	public void setQtaAtual(int qtaAtual) {
		this.qtaAtual = qtaAtual;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void darBaixa(int qtde) {
		if(qtde<=this.qtaAtual)
			this.qtaAtual-=qtde;
		else
			System.out.println("Impossível de dar baixa no estoque");
		
	}
	
	public boolean precisaRepor(){
		if (this.qtaAtual<=this.getQtdMinima())
			return true;
		else
			return false;

	}
	
	public String mostra(){
		return "produto:" + getNome() + "\nEstoque Atual: " + getQtaAtual() + "\nEstoque Mínimo:" + getQtdMinima();
	}

}package estoque;

public class estoque  {
	private String nome;
	private int qtaAtual;
	private int qtdMinima;
	
	public estoque() {
		
	}
	public estoque(String nome, int qtaAtual, int qtdMinima) {
		super();
		this.nome = nome;
		this.qtaAtual = qtaAtual;
		this.qtdMinima = qtdMinima;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtaAtual() {
		return qtaAtual;
	}
	public void setQtaAtual(int qtaAtual) {
		this.qtaAtual = qtaAtual;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void darBaixa(int qtde) {
		if(qtde<=this.qtaAtual)
			this.qtaAtual-=qtde;
		else
			System.out.println("Impossível de dar baixa no estoque");
		
	}
	
	public boolean precisaRepor(){
		if (this.qtaAtual<=this.getQtdMinima())
			return true;
		else
			return false;

	}
	
	public String mostra(){
		return "produto:" + getNome() + "\nEstoque Atual: " + getQtaAtual() + "\nEstoque Mínimo:" + getQtdMinima();
	}

}