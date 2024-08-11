package secao_9;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		product.setName(sc.nextLine());
		System.out.print("Preço: ");
		product.setPreco(sc.nextDouble());
		
		product.setName("Computador");
		product.setPreco(1200.00);
		
		System.out.println("Novas informações: " + product.getName());		
		System.out.println("Novas informações: " + product.getPreco());
		System.out.println("\nInformações do Produto: " + product);
		
		System.out.print("\nInsira o número de produtos a serem Adicionados: ");
		int quantidade = sc.nextInt();
		product.addQuantidade(quantidade);
		
		System.out.println("\nAtualizações: " + product);
		
		System.out.print("\nInsira o número de produtos a serem Removidos: ");
		quantidade = sc.nextInt();
		product.removerQuantidade(quantidade);
		
		System.out.print("\nAtualizações: " + product);
		
		sc.close();
	}

}
