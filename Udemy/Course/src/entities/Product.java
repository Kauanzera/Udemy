package entities;

public class Product {

	public String nome;
	public double preco;									//Declaração das variáveis que serão usadas
	public int quantidade;
	
	public double valorTotalEmEstoque() {					//Declaração do método
		return preco * quantidade;	
	}
	
	public void addQuantidade(int quantidade) {						//Declaração do método
		this.quantidade += quantidade;
	}
	
	public void removerQuantidade(int quantidade) {				//Declaração do método
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", R$ " 
				+ String.format("%.2f", preco) 				//Formatado para mostrar apenas 2 valores após o '.'
				+ ", " + quantidade 
				+ " Unidades, Total: R$ " 
				+ String.format("%.2f", valorTotalEmEstoque());
	}
	
}
