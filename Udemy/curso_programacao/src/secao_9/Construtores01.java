package secao_9;

import java.util.Scanner;

public class Construtores01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		Construtores02 product = new Construtores02();
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		Construtores02 product = new Construtores02(nome, preco, quantidade);		//O construtor serve pra proteger que o dev crie um produto que não tenha informações e 
																					//Fique inconsistente no sistema, sem informações fazendo assim com que o construtor 
		System.out.println("\nInformações do Produto: " + product);					//'product' obrigue a entrada de informações.
		
		System.out.print("\nInsira o número de produtos a serem Adicionados: ");
		int quant = sc.nextInt();
		product.addQuantidade(quant);
		
		System.out.println("\nAtualizações: " + product);
		
		System.out.print("\nInsira o número de produtos a serem Removidos: ");
		quantidade = sc.nextInt();
		product.removerQuantidade(quantidade);
		
		System.out.print("\nAtualizações: " + product);
		
		sc.close();
	}

}
