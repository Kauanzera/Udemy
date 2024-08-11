package secao_7;

public class Vetores {

	public static void main(String[] args) {
		
		String a = "potato banana tomato";					//Declaração de váriavel
		String[] vet = a.split(" ");						//Separando a váriavel em vetores, separados a cada " "
		
		System.out.println(vet[0]);							//Retornando o vetor da primeira posição
		System.out.println(vet[1]);							//Retornando o vetor da segunda posição
		System.out.println(vet[2]);							//Retornando o vetor da terceira posição

	}

}
