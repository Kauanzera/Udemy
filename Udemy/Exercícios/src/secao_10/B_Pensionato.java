package secao_10;

public class B_Pensionato {
	
	private String name;
	private String email;

	//Construtor
	public B_Pensionato() {
	}
	
	public B_Pensionato(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	//Getters e Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name + ", " + email;
	}

}
