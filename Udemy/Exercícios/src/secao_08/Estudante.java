package secao_08;

public class Estudante {

	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String situacao() {
		String sit;
		if (notaFinal() < 60) {
			sit = String.format("REPROVADO! \nFaltam %.2f", 60 - notaFinal());
		} else {
			sit = "APROVADO!";
		}
		return sit;
	}
	
	public String toString() {
		return "\nNome: " + nome
			+ "\nNota Final: " + notaFinal()
			+ "\n" + situacao();
	}
	
}
