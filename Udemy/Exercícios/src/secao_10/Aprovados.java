package secao_10;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? -> ");
		int[] n = new int[sc.nextInt()];
		String[] nome = new String[n.length];
		double[] nota1 = new double[n.length];
		double[] nota2 = new double[n.length];
		double[] media = new double[n.length];
		
		for (int i = 0; i < n.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:\n", i + 1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		//Impressão de alunos aprovados
		System.out.println("ALUNOS APROVADOS: ");
		for (int i = 0; i < n.length; i++) {
			if (media[i] >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
Exemplo:
Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno:
Joao Silva
7.0
8.5
Digite nome, primeira e segunda nota do 2o aluno:
Maria Teixeira
9.2
6.5
Digite nome, primeira e segunda nota do 3o aluno:
Carlos Carvalho
5.0
6.0
Digite nome, primeira e segunda nota do 4o aluno:
Teresa Pires
5.5
6.5
Alunos aprovados:
Joao Silva
Maria Teixeira
Teresa Pires 
 */