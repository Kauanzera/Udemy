import java.util.Scanner;

public class Funcoes_Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n=== CALCULADORA ===\n\n=== SOMA ===\n\n");
		System.out.print("Digite um valor X: -> ");
		int val1 = sc.nextInt();
		System.out.print("Digite um valor Y: -> ");
		int val2 = sc.nextInt();
		
		int soma = somar(val1, val2);
		int sub = menos(val1, val2);
		int multi = vezes(val1, val2);
		double divisao = div(val1, val2);
		
		resultado(soma);
		resultado(sub);
		resultado(multi);
		resultadodiv(divisao);
		
		sc.close();

	}
	
	public static int somar(int v1, int v2) {
		int cont;
		cont = v1 + v2;
		return cont;
	}
	
	public static int menos(int v1, int v2) {
		int cont;
		cont = v1 - v2;
		return cont;
	}
	
	public static int vezes(int v1, int v2) {
		int cont;
		cont = v1 * v2;
		return cont;
	}
	
	public static double div(double v1, double v2) {
		double cont;
		cont = v1 / v2;
		return cont;
	}
	
	public static void resultado(int k) {
		System.out.printf("Resultado = %d\n", k);
	}
	
	public static void resultadodiv(double k) {
		System.out.printf("Resultado = %.1f", k);
	}

}
