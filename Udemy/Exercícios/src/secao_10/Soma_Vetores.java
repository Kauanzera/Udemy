package secao_10;

import java.util.Scanner;

public class Soma_Vetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter em cada vetor? -> ");
		int val = sc.nextInt(), i;
		int[] A = new int[val], B = new int[val], soma = new int[val];
		
		//Atribuição de valor ao vetor A
		System.out.printf("Digite os %d valores de A:\n", A.length);
		for (i = 0; i < val; i++) {
			A[i] = sc.nextInt();
		}
		//Atribuição de valor ao vetor B
		System.out.printf("Digite os %d valores de B:\n", B.length);
		for (i = 0; i < val; i++) {
			B[i] = sc.nextInt();
		}
		//Soma dos vetores A e B
		for (i = 0; i < val; i++) {
			soma[i] = A[i] + B[i];
		}
		
		//Impressão da soma de cada posição dos dois vetores
		System.out.println("VETOR RESULTANTE:");
		for (i = 0; i < val; i++) {
			System.out.println(soma[i]);
		}
		
		sc.close();
	}
}
