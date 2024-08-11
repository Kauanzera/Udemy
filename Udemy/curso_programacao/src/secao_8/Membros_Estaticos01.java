package secao_8;

import java.util.Scanner;

public class Membros_Estaticos01 {

	public static void main(String[] args) {					//Membros estaticos só funcionam quando usados sem a necessidade de instânciação de um objeto

		Scanner sc = new Scanner(System.in);
		
		Membros_Estaticos02 calc = new Membros_Estaticos02();	//Se instânciado um objeto, não se é necessário criar a classe como estática
		
		System.out.print("Enter Radious: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", calc.PI);
		
		sc.close();
	}
	
}
