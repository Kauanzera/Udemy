package application;

import java.util.Scanner;

import entities.Product;												//Importei de dentro do pacote 'entities', a classe 'Product'

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();								//Declarei uma variável do tipo Product (entities.Product)
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		product.nome = sc.nextLine();									//Uso a var 'product' e puxo a informação do método inserido após o '.'
		System.out.print("Preço: ");
		product.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantidade = sc.nextInt();
		
		System.out.println("\nInformações do Produto: " + product);     //System.out.printf("%s - %.1f - %d", product.nome, product.preco, product.quantidade);
		
		System.out.print("\nInsira o número de produtos a serem Adicionados: ");
		int quantidade = sc.nextInt();
		product.addQuantidade(quantidade);								//Recebendo a informação, se é executado o método addQuantidade referente ao valor digitado na var 'quantidade'
		
		System.out.println("\nAtualizações: " + product);
		
		System.out.print("\nInsira o número de produtos a serem Removidos: ");
		quantidade = sc.nextInt();
		product.removerQuantidade(quantidade);							//Recebendo a informação, se é executado o método removerQuantidade referente ao valor digitado na var 'quantidade'
		
		System.out.print("\nAtualizações: " + product);
		
		sc.close();
	}

}
