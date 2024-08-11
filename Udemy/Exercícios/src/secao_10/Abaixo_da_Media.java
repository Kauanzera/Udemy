package secao_10;

import java.util.Scanner;

public class Abaixo_da_Media {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? -> ");
		int cont = sc.nextInt(), i;
		double[] vect = new double[cont];
		double media = 0;
		
		for (i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		media = media / vect.length;
		System.out.printf("MÉDIA DO VETOR: %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		
		for (i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);				
			}
		}
		
		sc.close();
	}

}

//Quantos elementos vai ter o vetor? 4
//Digite um numero: 10.0
//Digite um numero: 15.5
//Digite um numero: 13.2
//Digite um numero: 9.8
//MEDIA DO VETOR = 12.125
//ELEMENTOS ABAIXO DA MEDIA:
//10.0
//9.8 
