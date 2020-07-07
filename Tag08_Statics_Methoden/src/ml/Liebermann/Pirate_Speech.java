package ml.Liebermann;

import java.util.Scanner;

public class Pirate_Speech {

	public static void main(String[] args) {
		
		String eingabe = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Text zur codierung eingeben!");
			eingabe = sc.nextLine();
			
			
			System.out.println(eingabe.
					replaceAll("a", "arr").
					replaceAll("e", "err").
					replaceAll("i", "irr").
					replaceAll("o","orr").
					replaceAll("u", "urr"));			
			
			
		} while(!eingabe.equalsIgnoreCase("ende"));
	}

}
