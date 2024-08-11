package secao_10;

import java.util.Scanner;

public class Vetores2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont = sc.nextInt();
		Product[] vect = new Product[cont];
		
		for (int i=0;i<vect.length;i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			
			double price = sc.nextDouble();
			vect[i] = new Product(nome, price);
		}
		
		double media = 0;
		for (int i=0; i<vect.length; i++) {
			media += vect[i].getValue();
		}
		
		double avg = media / vect.length;
		
		System.out.printf("AVERAGE ITENS: %.2f", avg);
		
		sc.close();
	}
}
