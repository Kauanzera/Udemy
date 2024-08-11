package secao_8;

public class Membros_Estaticos02 {

	public final double PI = 3.14159;		//'final' define a classe como um valor final
	
	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}
	
}
