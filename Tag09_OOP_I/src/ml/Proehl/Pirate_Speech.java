package ml.Proehl;

import java.util.Scanner;

public class Pirate_Speech 
{

	public static void main(String[] args) 
	{
		
		String eingabe = "";
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("Text zum pratisieren eingeben!");
eingabe = sc.nextLine();
			
			
			System.out.println(eingabe.
					replaceAll("a", "arr").
					replaceAll("e", "err").
					replaceAll("i", "irr").
					replaceAll("o","orr").
					replaceAll("u", "urr").
					replaceAll("arrurr", "aauurgh").
					replaceAll("errurr", "eeuurgh"));	
			
		} 
		while(!eingabe.equalsIgnoreCase("ende"));
	}

}
