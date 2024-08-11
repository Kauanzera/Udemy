package secao_9;

public class Product {

	private String nome;
	private double preco;
	private int quantidade;
	
	public Product() {					//Se desejado manter um ... padrão.
	}
	
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Product(String nome, double preco) {		//Método criado como sobrecarga, para voltar como valor 0 de alguma das variáveis
		this.nome = nome;
		this.preco = preco;
//		quantidade = 0;					//Não é necessário declarar o valor de quantidade, por ele já ter valor 0 padrão.
	}
	
	public String getName() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
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
