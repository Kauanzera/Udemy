package secao_10;

public class For_Each {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//Impressão dos valores de um vetor TRADICIONAL.
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------");
		
		//Impressão dos valores de um vetor usando FOR EACH.
		for (String abc : vect) {
			System.out.println(abc);
		}
		
		//String -> Declaração do tipo do vetor que será usado.
		//obj -> Apelido dado para cada posição do vetor, que será usada para imprimí-lo, ao invés de 'vect[posição]'.
		// : vect -> A coleção/vetor que será chamada.

	}

}
