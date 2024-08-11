package secao_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		// Número de funcionários que serão registrados.
		System.out.print("How many employees will be registered? -> ");
		Integer[] vect = new Integer[sc.nextInt()];
		
		//Criação do método emp e das listas dos funcionários
		List<Employee> list = new ArrayList<>();

		// Bloco de comandos
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("\nEmployee #%d:\n", i + 1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		//Aumento de salário por Id
		System.out.print("\nEnter the employee id that will gave salary increasy: ");
		int idSalary = sc.nextInt();
		
		//Método de resolução Lambda
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
//		Integer pos  = position(list, idSalary);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
//			list.get(increaseSalary);
		}
		
		//Impressão dos dados atualizados, ou não
		System.out.println("\nList of employees:");
		for (Employee a : list) {
			System.out.println(a);
		}
		
		sc.close();
	}
	
	//Método de resolução usando outra classe externa à classe Main
	static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
