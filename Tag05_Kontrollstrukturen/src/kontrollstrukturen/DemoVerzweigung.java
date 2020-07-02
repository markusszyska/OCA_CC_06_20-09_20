package kontrollstrukturen;

public class DemoVerzweigung {
	public static void main(String[] args) {
		int zahl = 20;
		
		if(zahl < 15) {
			System.out.println("Die Zahl ist kleiner 15");
		}
		
		if(zahl < 15) {
			System.out.println("Die Zahl ist kleiner 15");
		}else {
			System.out.println("Die Zahl ist nicht kleiner 15");
		}
		
		if((zahl = 5) < 15) {
			
		}
		//zahl ist ein int kein boolean
//		if(zahl = 5) {}
		
		//Keine Deklaration in der Bedingung moeglich
//		if((int zahl2 = 5) < 15) {}
		
		boolean b1 = true;
		boolean b2 = true;
		//Kontrollstrukturen koennen ineinander verschachtelt werden.
		if(b1 == true) {
			if(b2 == true) {				
			}
		}
		
		boolean b3 = false;
		//hier findet eine Zuweisung statt
		if(b3 = true) {}
		//Hier findet keine Zuweisung statt
		if(b3 == true) {}
		System.out.println("-------------------------");
		int zahl2 = 10;
		
		/*
		 * Bei einem If kann die Klammer weggelassen werden,
		 * dann zaehlt nur die erste Anweisung nach der Bedingung zum if
		 */
		if(zahl2 < 10)
		System.out.println("Erste Ausgabe");
		System.out.println("Zweite Ausgabe");
		
		if(zahl2 < 10) {
			System.out.println("Erste Ausgabe");			
		}
		System.out.println("Zweite Ausgabe");
	
		/*
		 * Auch beim else kann die Klammer weggelassen werden,
		 * aber zwischen dem if und dem else darf nur eine
		 * Anweisung stehen, sonst gibt es einen Kompilerfehler
		 */
		if(zahl2 < 10)
			System.out.println("Erste Ausgabe");
//			System.out.println();
		else
			System.out.println("Zweite Ausgabe");
		
		if(zahl2 < 10)
		if(zahl2 > 10)
		System.out.println();
		else 
		System.out.println();		
		else
		System.out.println();
		
		if(zahl2 < 15) {
			System.out.println("Zahl ist kleiner 15");
		}else if(zahl > 15) {
			System.out.println("Zahl ist groesser 15");
		}else {
			System.out.println("Zahl ist genau 15");
		}
		
		if((zahl = 20) < 15 && (zahl = 15) < 10) {
			
		}
		System.out.println(zahl); // 20
		
		//Ternaerer Operator
		/*
		 * Der Ternaere Operator ist eine verkuerzte if/else Schreibweise
		 * Das Ergebnis der Auswertung muss verarbeitet werden,
		 * entweder mit einer Variablenzuweisung, oder mit Uebergabe oder Rueckgabe
		 */
		String s;
		s = (zahl<15) ? "zahl ist kleiner 15" : "zahl ist nicht kleiner 15";
		
		if(zahl < 15) {
			s = "zahl ist kleiner 15";
		}else {
			s = "zahl ist nicht kleiner 15";
		}
		
		System.out.println((zahl < 15)? "zahl ist kleiner 15": (zahl > 20)? "Zahl ist groesser 20": "Zahl ist nicht groesser 20");
		
		zahl = 0;
		boolean b = (zahl < 10) ? true: false;
		
		if((zahl < 10) ? false: true) {
			System.out.println("ja");
		}
		
		
		System.out.println("Programmende");
	}
}
