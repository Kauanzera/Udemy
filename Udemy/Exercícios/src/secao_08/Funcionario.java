package secao_08;

public class Funcionario {
	
	public String nome;
	public double salBruto;
	public double imposto;
	
	public double salLiquido() {
		return salBruto - imposto;
	}
	
	public void salAumento(double porcentagem) {
		salBruto += salBruto * (porcentagem / 100);
	}
	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", salLiquido());
	}

}
