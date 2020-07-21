package ml.assmann;

public class FahrzeugTest{  
	public static void main (String args[]){   
		System.out.println ("Start des Programms");   
		// Anlegen eines Arrays aus 6 Fahrzeugen   
		Fahrzeug[] fahrzeuge = new Fahrzeug[6];
		// Die ersten 3 Elemente des Arrays sollen mit Pkws gefüllt werden   
		System.out.println();   
		System.out.println ("3 Pkws");  
		fahrzeuge[0] = new Pkw();
		fahrzeuge[1] = new Pkw();
		fahrzeuge[2] = new Pkw();
		// Die drei letzten Elemente mit Motorrädern füllen   
		System.out.println();   
		System.out.println ("3 Motorräder");   
		fahrzeuge[3] = new Motorrad();
		fahrzeuge[4] = new Motorrad();
		fahrzeuge[5] = new Motorrad();
		// Geben Sie in einer Schleife für alle Array-Elemente die   
		// entsprechenden Datenfelder aus
		float summe = 0;
		for(Fahrzeug fzg : fahrzeuge) {
			fzg.print();
			summe += fzg.getPreis();
		}
		// Ermittlung des Gesamtwerts aller Fahrzeuge   
		System.out.println ("\n\nGesamtwert aller Fahrzeuge: " + summe);  
	} 
}