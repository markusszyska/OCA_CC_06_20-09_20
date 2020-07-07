package ml.schulzke;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
	    Boolean secure = false;
	    Boolean upper = false;
	    Boolean lower= false;
	    Boolean length = false;
	    Boolean number = false;
	    Boolean special = false;


		while (secure==false) {
			
		    upper = false;
		    lower= false;
		    length = false;
		    number = false;
		    special = false;

		    try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Passwort soll min. 10Zeichen haben sowie Klein- und Großbuchstaben, ein Sonderzeichen und eine Ziffer!");
				System.out.println("Gebend Sie Ihr Passwort ein: ");
				String str_input = scan.nextLine();
				
				if(str_input.length()>=10) {
					length = true;
				}else {
					System.out.println("Ihr Passwort hat "+(10-str_input.length())+" Zeichen zu wenig!");
				}
				
				char[] arr_pwd = str_input.toCharArray();

				for(char ch:arr_pwd){
				    if(Character.isUpperCase(ch)) {
				    	upper = true;
				    }
				    if(Character.isLowerCase(ch)) {
				    	lower = true;
				    }
				    if(Character.isDigit(ch)) {
				    	number = true;
				    }
				    if (String.valueOf(ch).matches("[^a-zA-Z0-9]")) {
				    	special = true;
				    }
				    
				    
				}
				
				//System.out.println(upper+" "+lower+" "+length+" "+number+" "+special);
				
				if(upper&&lower&&length&&number&&special) {
				secure = true;
				System.out.println("Ihr Passwort erfüllt unsere Standarts!");
				}
				
		    }
		}

	}

}
