package secao_10;

import java.util.Scanner;

public class Media_Pares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? -> ");
		int[] vect = new int[sc.nextInt()];
		int i, pares = 0;
		double media = 0;
		
		for (i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				media += vect[i];
				pares += 1;
			} 
		} 
		media /= pares;
		
		if (pares > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", media);			
		} else {
			System.out.println("NENHUM NÚMERO PAR!");
		}
	
	}

}
