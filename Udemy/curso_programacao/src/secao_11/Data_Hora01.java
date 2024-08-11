package secao_11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data_Hora01 {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:29Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/09/1968 04:34", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 4, 34);
		
		
		System.out.println("Data 01 = " + d01);
		System.out.println("Data 02 = " + d02);
		System.out.println("Data 03 = " + d03);
		System.out.println("Data 04 = " + d04);
		System.out.println("Data 05 = " + d05);
		System.out.println("Data 06 = " + d06);
		System.out.println("Data 07 = " + d07);
		System.out.println("Data 08 = " + d08);
		System.out.println("Data 09 = " + d09);
		System.out.println("Data 10 = " + d10);
		System.out.println("Data 11 = " + d11);
		
		
	}

}
