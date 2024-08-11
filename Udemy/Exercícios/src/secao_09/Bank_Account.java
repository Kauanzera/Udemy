package secao_09;

import java.util.Scanner;

public class Bank_Account {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Data_Account data = new Data_Account();

		System.out.print("Enter account number: ");
		data.setAccountNumber(sc.nextInt());

		System.out.print("Enter account holder: ");
		sc.nextLine();
		data.setAccountHolder(sc.nextLine());

		System.out.print("Is there an initial deposit (y/n) ? ");
		char InitialDeposit = sc.next().charAt(0);

		if (InitialDeposit == 'n') {
			data.setDeposit(0);
		} else {
			System.out.print("Enter initial deposit value: $ ");
			data.setDeposit(sc.nextDouble());
		}

		System.out.println("\nAccount Data: ");
		System.out.println(data);
		
		System.out.print("Enter a deposit value: $ ");
		double deposito = sc.nextDouble();
		data.setDeposit(data.depositValue(deposito));

		System.out.println("\nAccount Data: ");
		System.out.println(data);
				
		System.out.print("Enter a withdraw value: $ ");
		deposito = sc.nextDouble();
		data.setDeposit(data.withdrawValue(deposito));
		
		System.out.println("\nAccount Data: ");
		System.out.println(data);
		
		sc.close();
	}

}
