package ml.schulzke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pirate {
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
		}else {
		String str_priateOUT = str_priateIN.replace("a", "arr");
		 str_priateOUT = str_priateOUT.replace("e", "err");
		 str_priateOUT = str_priateOUT.replace("i", "irr");
		 str_priateOUT = str_priateOUT.replace("o", "orr");
		 str_priateOUT = str_priateOUT.replace("u", "urr");
		 
		System.out.println(str_priateOUT);
		}
		}
	}
}

