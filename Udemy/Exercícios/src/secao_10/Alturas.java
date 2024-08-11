package secao_10;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? -> ");
		int[] vect = new int[sc.nextInt()];
		double media = 0;
		int cont=0;

		// Criação dos vetores
		String[] nome = new String[vect.length];
		int[] idade = new int[vect.length];
		double[] altura = new double[vect.length];

		// Inserção de informações em cada esçaço de cada vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %dª Pessoa: \n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			media += altura[i];
			
			if (idade[i] < 16) {
				cont += 1;
			}
		}

		System.out.printf("Altura Média: %.2f\n", media / vect.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", cont * 100.0 / idade.length);
		
		for (int i = 0; i < vect.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		sc.close();
	}
}