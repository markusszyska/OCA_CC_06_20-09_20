package ml.kukulin;

import java.util.Scanner;

public class Pirate {
public static void main(String[] args) {
	
	
	  
	    String s1 = "Ende";
	  
	    
	   
		Scanner sc = new Scanner(System.in);
		
	LOOP: while (true) {
		System.out.println("Bitte Text  eingeben");
		
		String text = sc.nextLine();
		
		 String neu = text.replace("a","arr");
		 String neu2 = neu.replace ("e","err");
		 String neu3 = neu2.replace("i","irr");
		 String neu4 = neu3.replace("o","urr");	
		
		 Scanner en = new Scanner(System.in);
		 
		 System.out.println("Weiter?->Enter; Ende?-> Ende");
		 
		String end = en.nextLine();
		
		if (end.equalsIgnoreCase(s1)) {
		  break LOOP ;
		}else {
			System.out.println(neu4); 
		}
			

}
		 sc.close();
		 
}
}




