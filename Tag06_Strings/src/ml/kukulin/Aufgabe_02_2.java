package ml.kukulin;

import java.util.Scanner;


	public class Aufgabe_02_2 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Antworten sie mit Ja    oder Nein : ");
			String st = sc.nextLine();
			
			String j = "Ja";
			String n = "Nein";
	
	        if (st.equals(j)) {
	        	System.out.println("Sie haben mit Ja geantwortet");
	        
	        }else if(st.equals(n)) {
	        	System.out.println("Sie haben mit Nein geantwortet");
	        } else {
	        	System.out.println("Sie haben eine falsche Eingabe gemacht");}
	        	
	        	
	       	
	
	
	
	
	
	        sc.close();	

}
}