package secao_09;

public class Data_Account {
	
	//Declaração de variáveis
	private int account;
	private String name;
	private double deposit;
	
	//Construtores
	public Data_Account(){
	}

	public Data_Account(int account, String name, double deposit) {
		this.account = account;
		this.name = name;
		this.deposit = deposit;
	}
	
	public Data_Account(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	//Getters e Setters
	public int getAccountNumber() {
		return account;
	}
	
	public void setAccountNumber(int account) {
		this.account = account;
	}
	
	public String getAccountHolder(){
		return name;
	}
	
	public void setAccountHolder(String name) {
		this.name = name;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	//Criação dos métodos de Depósito e Saque bancário
	public double depositValue(double deposit) {
		return this.deposit += deposit;
	}
	
	public double withdrawValue(double deposit) {
		return this.deposit -= deposit + 5;
	}
	
	//Declarando como deverá ser impresso a classe quando chamada na classe Bank_Account.java
	public String toString() {
		return "Account " + getAccountNumber()
			+ ", Holder: " + getAccountHolder()
			+ " Balance: $ " + getDeposit();
	}
	
//	System.out.printf("Account %d, ", data.getAccountNumber());
//	System.out.printf("Holder: %s, ", data.getAccountHolder());
//	System.out.printf("Balance: $ %.2f.", data.getDeposit());


}
