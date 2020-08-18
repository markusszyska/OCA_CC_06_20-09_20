package ml.seb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class DateTimeAPI {

	public static void main(String[] args) {
		
				
		Scanner input = new Scanner(System.in); //System.in is a standard input stream  
		
		System.out.print("Enter birthday (DD.MM.YYYY): ");  
		String birthday = input.nextLine();              //reads string  
		
		System.out.print("Enter anniversary (DD.MM.YYYY): ");  
		String anniversary = input.nextLine();      
		
		DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate localDate2 = LocalDate.parse(birthday, europeanDateFormatter);
		
		System.out.print("Your birthday is: "+ europeanDateFormatter.format(localDate2));  
		
		
		
		
		

		//System.out.println(europeanDateFormatter.format(localDate));
	}

}
