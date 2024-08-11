package secao_10;

import java.util.Scanner;

public class Dados_Pessoas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int[] vect = new int[sc.nextInt()];
		double[] altura = new double[vect.length];
		char[] genero = new char[vect.length];
		double maiorAltura = 0, menorAltura = 3.0, mediaMulher = 0;
		int homem = 0;
		
		for (int i = 0; i < vect.length; i++) {
			
			//Coleta de informações
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %dª pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
			
			//Calculo para obter a menor e maior altura
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			} else if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			
			//Media de quantos homens são
			if (genero[i] == 'M') {
				homem += 1;
			}
			
			//Calculo media de altura das mulheres
			if (genero[i] == 'F') {
				mediaMulher += altura[i];
			}
		}
		
		System.out.printf("Menor Altura: %.2fm \nMaior Altura: %.2fm\n", menorAltura, maiorAltura);
		System.out.printf("Média das alturas da Mulheres: %.2fm\n", mediaMulher / (vect.length - homem));
		System.out.printf("Número de Homens: %d", homem);
		
		sc.close();
	}

}

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
Exemplo:
Quantas pessoas serao digitadas? 5
Altura da 1a pessoa: 1.70
Genero da 1a pessoa: F
Altura da 2a pessoa: 1.83
Genero da 2a pessoa: M
Altura da 3a pessoa: 1.54
Genero da 3a pessoa: M
Altura da 4a pessoa: 1.61
Genero da 4a pessoa: F
Altura da 5a pessoa: 1.75
Genero da 5a pessoa: F
Menor altura = 1.54
Maior altura = 1.83
Media das alturas das mulheres = 1.69
Numero de homens = 2
*/