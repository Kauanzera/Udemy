package secao_08;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		func.salBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + func);
		
		System.out.print("Qual porcentagem de aumento do salário? ");
		double aumento = sc.nextDouble();
		func.salAumento(aumento);
		
		System.out.print("Atualizações: " + func);
		
		sc.close();
	}

}
