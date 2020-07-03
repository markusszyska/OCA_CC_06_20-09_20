package ml.salastexido;

import java.util.Scanner;

public class Fragen {

	public static String ProcessAnswer(String answer) {
	   String result = "";
		if(answer.equals("j")|| answer.equals("J") ) {
		   result = "Sie haben mit " + answer + " geantwortet...";   
	   }else if(answer.equals("n") || answer.equals("N")) {
		   result = "Sie haben mit " + answer + " geantwortet..."; 
	   }
	   else {
		   result = "Sie haben eine falsche Eingabe gemacht...";
	   }
	  return result;
	}
	
	public static void main(String[] args) {
		System.out.printf("Antworten sie mit Ja(j oder J) order Nein(n oder N): ");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		System.out.println(ProcessAnswer(answer));
		scanner.close();
		
	}
}
