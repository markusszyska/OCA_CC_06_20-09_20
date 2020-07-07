package ml.kukulin;

import java.util.Scanner;

public class JAufgabe_23 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//*******************************************************************	
			System.out.println("Bit te buchstaben eingeben");
			
		char c = sc.next().charAt(0);
		
			System.out.println((int) c);
		
			
			Scanner sc2 = new Scanner(System.in);
			
			
			System.out.println("Bitte Ziffer eingeben");
			
		int c2 = sc2.nextInt();
		
			System.out.println((char) c2);
	//**********************************************************************************		
		
			Scanner sc3 = new Scanner(System.in);

			System.out.println("Bitte text eingeben");
			
		String s = sc2.next();
		
		
		for(int i =0; i< (s.length()); i++){
		    System.out.println((int)s.charAt(i)); // A = 65, B = 66
		}
			
	//************************************************************	
	
		
		
		
		
}
}