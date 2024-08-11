package secao_8;

import java.util.Scanner;

public class Membros_Estaticos {
	
	public static final double PI = 3.14159;
																//Se o método 'main' for estático e tiver outros métodos dentro da mesma classe, TODOS precisam ser estáticos para funcionarem
	public static void main(String[] args) {					//Membros estaticos só funcionam quando usados sem a necessidade de instânciação de um objeto
																//Não se pode chamar um método não estático dentro de outro método estático sendo ambos da mesma classe
		Scanner sc = new Scanner(System.in);					
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}