package secao_10;

import java.util.Scanner;

public class Numeros_Pares {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? -> ");
		int cont = sc.nextInt(), par = 0;
		int[] pares = new int[cont];

		for (int i = 0; i < pares.length; i++) {
			System.out.print("Digite um número: ");
			pares[i] = sc.nextInt();
			if (pares[i] % 2 == 0) {
				par += 1;
			}
		}
		
		System.out.println("Números Pares: ");
		
		for (int i = 0; i < pares.length; i++) {
			if (pares[i] % 2 == 0) {
				System.out.printf("%d ", pares[i]);
			}
		}
		
		System.out.printf("\nQuantidade de pares: %d", par);

		sc.close();

	}
}
