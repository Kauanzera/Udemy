package secao_9;

public class Construtores02 {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Construtores02(String nome, double preco, int quantidade) {		//Método Construtor, com parâmetros
		this.nome = nome;
		this.preco = preco;													//Ao usar o this. se é referenciado ao atributo do objeto, e não ao parâmetro do método
		this.quantidade = quantidade;
	}
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;	
	}
	
	public void addQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", R$ " 
				+ String.format("%.2f", preco)
				+ ", " + quantidade 
				+ " Unidades, Total: R$ " 
				+ String.format("%.2f", valorTotalEmEstoque());
	}
	
}
