package secao_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add("Kauan");
		list.add("Jeff");
		list.add("Anna");
		list.add(4, "Andreia");
		
		System.out.println("[" + list.size() + "]");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		list.remove("Maria");
		System.out.println("[" + list.size() + "]");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		list.removeIf(x -> x.charAt(0) == 'J');
		System.out.println("[" + list.size() + "]");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");

		System.out.println("Index of Kauan: " + list.indexOf("Kauan"));
		System.out.println("Index of Jeff: " + list.indexOf("Jeff"));
		
		System.out.println("-------------------");
		
		System.out.println("[" + list.size() + "] Sem formatação!");
		System.out.println("[" + list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()).size() + "] Com Formatação!");
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : resultado) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);

	}

}
