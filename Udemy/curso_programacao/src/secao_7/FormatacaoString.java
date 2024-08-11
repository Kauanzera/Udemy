package secao_7;

public class FormatacaoString {

	public static void main(String[] args) {
	
	String original = "abcde FGHIJ ABC abc DEFG ";		//Declaração da String Original
	String s01 = original.toLowerCase();				//Formata Original com tudo minúsculo
	String s02 = original.toUpperCase();				//Formata Original com tudo MAIÚSCULO
	String s03 = original.trim();						//Formata original retirando os espaços nas pontas das strings
	String s04 = original.substring(2);					//Imprime a partir do bit informado até o fim 
	String s05 = original.substring(2, 9);				//Imprime a partir do bit informado até o próximo bit informado
	String s06 = original.replace('a', 'x');			//Troca a 1ª letra informada pela 2ª letra informada
	String s07 = original.replace("abc", "xy");			//Troca a 1ª palavra informada pela 2ª palavra informada
	int i = original.indexOf("bc");						//Proucura a primeira aparição em bit do valor informado
	int j = original.lastIndexOf("bc");					//Proucura a última aparição em bit do valor informado
	
	System.out.println("Original: -" + original + "-");
	System.out.println("toLowerCase: -" + s01 + "-");
	System.out.println("toUpperCase: -" + s02 + "-");
	System.out.println("trim: -" + s03 + "-");
	System.out.println("substring(2): -" + s04 + "-");
	System.out.println("substring(2, 9): -" + s05 + "-");
	System.out.println("replace('a', 'x'): -" + s06 + "-");
	System.out.println("replace('abc', 'xy'): -" + s07 + "-");
	System.out.println("Index of 'bc': " + i);
	System.out.println("Last index of 'bc': " + j);
	
	}

}
