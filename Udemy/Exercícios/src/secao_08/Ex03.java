package secao_08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Estudante aluno = new Estudante();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno);

		sc.close();
	}

}
