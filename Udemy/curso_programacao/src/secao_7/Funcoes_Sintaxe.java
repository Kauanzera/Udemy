package secao_7;

import java.util.Scanner;

public class Funcoes_Sintaxe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);					//Atribuo a função 'max' com 3 componentes, para dentro da variável inteira 'maior'
		
		mostrarResultado(maior);					//Executo a função 'mostrarResultado' usando as informções da variável 'maior'
		
		sc.close();
	}

/*	
  public -> declaro a função pública para outras classes poderem utiliza-la
  static -> declaro que a função pode ser chamada, independente se criado um objeto
  int -> declaro que a função receberá valores do tipo inteiro dentro de cada variável da função
  max() -> chamo a função que será armazenada as informações e declaro as variáveis que serão usadas dentro dos "()"
*/	

	public static int max(int x, int y, int z) {	//Crio e intruduzo comandos dentro da função inteira 'max'
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;									//Retorno um valor final (aux) para que a função tenha um valor existente
	}
	
	
	public static void mostrarResultado(int val) {	//Crio e introduzo comandos dentro da função vazia 'mostrarResultado'
		System.out.printf("%d", val);				//Por ser uma função vazia(void), não se retorna valor algum, somente executa o comando atrelado a ela
	}

}
