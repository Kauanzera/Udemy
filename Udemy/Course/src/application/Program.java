package application;

import java.util.Scanner;
import entities.Triangle;								//Importando a classe 'Triangle' de dentro do pacote 'entities'
	
public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;									//Criação da Classe Triangle e declarando suas variáveis
		x = new Triangle();								
		y = new Triangle();
		
		System.out.println("Enter the measures ot Triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();							//Chamando as var a, b, c de dentro da classe 'Triangle' do pacote 'entities'
		x.c = sc.nextDouble();
		System.out.println("Enter the measures ot Triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();


		double areaX = x.area();						//Chamando o método area() para executar dentro da var 'x', o comando que lá foi digitado
		double areaY = y.area();						//Chamando o método area() para executar dentro da var 'y', o comando que lá foi digitado

		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area Y");
		}
		
		sc.close();
	}

}
