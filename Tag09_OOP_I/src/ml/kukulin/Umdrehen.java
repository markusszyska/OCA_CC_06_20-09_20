package ml.kukulin;

import java.util.Scanner;

public class Umdrehen {
	public static void umdrehen () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Text");	
			
		String	text = sc.nextLine();
		
		
			
				
			
			for (int i = text.length()-1; i >= 0; i -- ){
				System.out.print(text.charAt(i));
				
			}
	}
	 public static void main ( String[] args ) {
		 umdrehen();
	 }
}
	