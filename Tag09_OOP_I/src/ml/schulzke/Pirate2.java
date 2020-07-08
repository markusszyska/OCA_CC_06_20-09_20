package ml.schulzke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pirate2 {
	public static void main(String[] args) throws IOException {
		
	Boolean next = true;

	while (next==true) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Ihr Piraten-Text:");
		String str_priateIN = br.readLine();
		if(str_priateIN.equalsIgnoreCase("Ende")) {
			next = false;
			System.out.println("Script beendet!");
		}else{
		String str_priateOUT = str_priateIN;
		
		 str_priateOUT = str_priateOUT.replace("a", "arr");
		 str_priateOUT = str_priateOUT.replace("e", "err");
		 str_priateOUT = str_priateOUT.replace("i", "irr");
		 str_priateOUT = str_priateOUT.replace("o", "orr");
		 str_priateOUT = str_priateOUT.replace("u", "urr");
		 str_priateOUT = str_priateOUT.replace("arrurr", "aauurghs");
		 str_priateOUT = str_priateOUT.replace("errurr", "eeuurghs");
		 
		System.out.println(str_priateOUT);
		}
		}
	}
}

