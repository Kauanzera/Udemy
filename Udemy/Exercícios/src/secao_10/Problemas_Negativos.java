package secao_10;

import java.util.Scanner;

public class Problemas_Negativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? -> ");
		int cont = sc.nextInt();
		
		int[] vect = new int[cont];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("DIGITE UM NÚMERO: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros Negativos: ");

		for (int i=0;i<vect.length;i++) {
			
			if (vect[i] < 0) {
				System.out.println(vect[i]);				
			}
		
		}
		
		sc.close();
	}

}


//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos