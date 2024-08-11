package secao_10;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double soma = 0;
		double[] vect = new double [n];			//Declarei a criação de um vetor com o 'double[]', e após, criei o vetor com 'vect = new <tipo de var que o vetor irá armazenar> [tamanho do vetor]'
		
		//Cálculo de média.
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();			//Cada vez que o for fizer sua passagem e for inserido um valor, esse valor será integrado ao vetor da posição declarada.
			soma += vect[i];					
		}
		
		System.out.printf("%.2f", soma / n);
		
		sc.close();
	}

}
