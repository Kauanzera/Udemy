package secao_10;

public class Boxing_Unboxing {

	public static void main(String[] args) {
	
		
		//BOXING -> É o ato de armazenar uma váriavel primitiva dentro de um objeto tipo referência.
	int x = 20;
	
//	Object obj = x;		1ª forma de declarar um objeto.
	Integer obj = x;  //2ª forma de declarar um objeto, utilizando a Wrapper class (Integer, Double, Float, Boolean, Short, Byte, Long...)
	
	System.out.println(obj);
	
	//UNBOXING -> É o ato contrário ao Boxing, o de pegar o valor do objeto tipo referência e armazenar em uma variável primitiva.
	
	int y = (int) obj; //Necessário declaração de tipo por conta do objeto não ter um necessáriamente um tipo compatível.

	System.out.println(y);
	
	}

}
