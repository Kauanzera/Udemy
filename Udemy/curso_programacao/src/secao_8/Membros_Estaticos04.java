package secao_8;

import java.util.Scanner;

public class Membros_Estaticos04 {

	public static void main(String[] args) {					

		Scanner sc = new Scanner(System.in);					
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Membros_Estaticos03.circumference(radius);	//Se a classe com métodos estáticos não for instânciada, ainda se é possível utiliza-la, chamando antes do '.' o nome dela
		double v = Membros_Estaticos03.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Membros_Estaticos03.PI);
		
		sc.close();
	}

}