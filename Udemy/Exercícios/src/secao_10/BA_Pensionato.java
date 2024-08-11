package secao_10;

import java.util.Scanner;

public class BA_Pensionato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		B_Pensionato[] product = new B_Pensionato[10];

		System.out.print("How many rooms will be rented? -> ");
		int cont = sc.nextInt();

		for (int i = 0; i < cont; i++) {
			System.out.printf("Rent #%d:\n", i + 1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			product[room] = new B_Pensionato(name, email);
		}

		System.out.println("Busy Rooms:");
		for (int i = 0; i < 10; i++) {
			if (product[i] != null) {
				System.out.println(i + ": " + product[i]);
			}
		}

		sc.close();
	}

}
