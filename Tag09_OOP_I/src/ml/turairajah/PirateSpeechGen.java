package ml.turairajah;

import java.util.Scanner;

public class PirateSpeechGen {

	public static void main(String[] args) 
	{
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Text eingeben, oder \"Ende\" zum rausspringen");
		String derText = sc.nextLine();
		
		while (!derText.equals("Ende")) {
			//pirate2("");
		System.out.println("Dein Text auf piratisch: \n"+derText.replace("a","arr")
		.replace("e", "err").replace("i", "irr")
				.replace("o", "orr").replace("u", "urr").replace("au", "aauurghs"));	
		
		
		
		System.out.println("Bitte Text eingeben, oder \"Ende\" zum rausspringen");
		derText = sc.nextLine();
		}
			System.out.println("Ende durch User.");		
	}
	
	public static void pirate2(String derText)
	{
		if (derText.contains("au")) {
			derText.replace("au", "aauurghs");
		}
	}

	
}
