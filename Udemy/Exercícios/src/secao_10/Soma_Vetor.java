package secao_10;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int cont = sc.nextInt();

		double[] vect = new double[cont];
		double soma = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: -> ");
			vect[i] = sc.nextDouble();
		}

		System.out.print("VALORES: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
			soma += vect[i];
		}
		System.out.println("\nSOMA: " + soma);
		System.out.print("MÉDIA: " + soma / vect.length);
		

		sc.close();
	}

}

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
