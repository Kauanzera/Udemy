import java.util.Scanner;

public class switch_Case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		switch (a) {	//Dentro da variável "a", faça:
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:								//Caso (a = 4) execute:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Valor Inválido");
			break;
		}
		
		sc.close();
	}

}
