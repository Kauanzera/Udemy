import java.util.Scanner;

public class entrada_Dados {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		String nome;
//		int a;
//		double b;
//		
//		System.out.println("Informe: Nome, idade e altura:");
//		nome = sc.next();
//		a = sc.nextInt();
//		b = sc.nextDouble();
//		System.out.print("Informações dadas:\n");
//		System.out.println(nome);
//		System.out.println(a);
//		System.out.println(b);
//		
//		sc.close();
		
		
		Scanner p = new Scanner(System.in);
		
		int o;
		String q, w, e;
		
		o = p.nextInt();
		p.nextLine();		// Necessário quando se tem outra Entrada de informações antes de um .nextLine(); (caso não utilizado, consumirá o prox .nextLine().
		q = p.nextLine();
		w = p.nextLine();	//	.nextLine(); -> Irá ler tudo até a quebra de linha (ENTER).
		e = p.nextLine();
		
		System.out.println(o);
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		
		p.close();
		
			
	}

}
