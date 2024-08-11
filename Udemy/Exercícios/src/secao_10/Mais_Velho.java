package secao_10;

import java.util.Scanner;

public class Mais_Velho {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar: -> ");
		int[] vect = new int[sc.nextInt()];
		int maiorIdade = 0;
		String maiorNome = "";

		for (int i = 0; i < vect.length; i++) {
			String[] nome = new String[vect.length];
			int[] idade = new int[vect.length];
			System.out.printf("Dados da %dª Pessoa: ", i + 1);
			System.out.print("\nNome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				maiorNome = nome[i];
			}
		}

		System.out.printf("Pessoa mais velha: %s", maiorNome);

		sc.close();

	}

}
