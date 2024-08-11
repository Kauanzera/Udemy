package secao_10;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();				
			}
		}
		System.out.println();
		
		//System.out.printf("%d, %d, %d", myMat[0][0], myMat[1][1], myMat[2][2]);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%d ", matriz[i][j]);				
			}
			System.out.println();
		}

		System.out.printf("\nMain diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}

		int count = 0;
		System.out.println("\nNúmeros negativos: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					System.out.printf("%d ", matriz[i][j]);
					count ++;
				}
			}
		}
		
		System.out.printf("\nForam encontrados %d números negativos", count);
		
		sc.close();
	}

}
