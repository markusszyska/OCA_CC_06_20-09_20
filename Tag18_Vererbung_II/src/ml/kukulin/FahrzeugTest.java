package ml.kukulin;

public class FahrzeugTest{
	public static void main (String args[]){
		System.out.println ("Start des Programms");  
		// Anlegen eines Arrays aus 6 Fahrzeugen 
	Fahrzeug[]array = new Fahrzeug[6];
		// Die ersten 3 Elemente des Arrays sollen mit Pkws gefüllt werden
		System.out.println(); 
		System.out.println ("3 Pkws");  
		
		for (int i = 0; i < 3; i++ ) {
			array[i] = new Pkw();
			
		}
			
		// Die drei letzten Elemente mit Motorrädern füllen 
		System.out.println(); 
		System.out.println ("3 Motorräder"); 
		for (int i = 3; i < 6; i++ ) {
			array[i] = new Motorrad();}
		
		// Geben Sie in einer Schleife für alle Array-Elemente die
		for (int i = 0;i < 6; i++) {
			array[i].print();
			
			
		}
		// entsprechenden Datenfelder aus   . . . . . 
		
		// Ermittlung des Gesamtwerts aller Fahrzeuge   .
		float summe = 0;
		
		 
		for (int i = 0;i < 6; i++) {
		summe =	summe + array[i].getPreis();
			
		}
		
		
System.out.println ("\n\nGesamtwert aller Fahrzeuge: " + summe);
		} 
	}   






