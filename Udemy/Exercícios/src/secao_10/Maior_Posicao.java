package secao_10;

import java.util.Scanner;

public class Maior_Posicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números deseja digitar? -> ");
		double[] vect = new double[sc.nextInt()];
		double maior = 0;
		int pos = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			if (vect[i] > maior) {
				maior = vect[i];
				pos = i;
			}
		}

		System.out.printf("\nMaior valor: %.1f\n", maior);
		System.out.printf("Posição: %d", pos);

		sc.close();
	}

}
