package demoStatics;

public class Demo01_StatischeMethoden {

	public static void main(String[] args) {
		int zahl = 1;
		System.out.println(zahl);
		methodOPar();
		System.out.println("Zwischen den Methodenaufrufen");
		methodOPar();
		System.out.println("------------------------");
		methodMPar("Markus");
		System.out.println("------------------------");
		methodMPar("Klaus");
		
		methodMPar("Markus", "Szyska");
		
		methodMPar("Markus", 1977);
		
		int zurueckgegebenerWert = methodeMRueckgabe();
		System.out.println(zurueckgegebenerWert);
		
		methodWReturn();
	}

	/*
	 * Methode ohne Parameter ohne Rueckgabewert: void Rueckgabetyp
	 * Rueckgabewert steht immer vor dem Methodennamen void - kein Rueckgabewert
	 */
	public static void methodOPar() {
		int zahl = 10;
		System.out.println("Hallo Welt");
		System.out.println(zahl);
	}
	/*
	 * Methoden mit Parameter: Der Parameter steht in den runden Klammern.
	 * Auf den beim Methodenaufruf uebergebenen Wert kann in der Methode mit dem 
	 * Bezeichner, der in der Klammer steht, sowohl lesend als auch schreibend
	 * zugegriffen werden.
	 * 
	 * Die Signatur einer Methode besteht aus ihrem Namen, der Datentypen und der
	 * Reihenfolge der Uebergabeparameter
	 * 
	 * Weitere Methoden koennen den selben Namen haben, aber die Uebergabeparameter
	 * muessen sich dann in Typ, Reihenfolge oder Anzahl unterscheiden.
	 * Das nennt Overloading(Ueberladen) von Methoden
	 */
	public static void methodMPar(String name) {
		System.out.println("name: " + name);
//		name = "Anna";
		System.out.println("Hallo " + name);
		methodMPar(name, "Szyska");
		methodMPar(name, 1977);
		methodMPar(1977, name);
	}
	
	public static void methodMPar(String name, String nachname) {
		System.out.println("Hallo " +  name + " " + nachname);
	}
	public static void methodMPar(String name, int geburtsjahr) {
		System.out.println("Hallo " +  name + " sie sind im Jahr " + geburtsjahr + " geboren");
	}	
	public static void methodMPar(int geburtsjahr, String name) {
		System.out.println("Hallo " +  name + " sie sind im Jahr " + geburtsjahr + " geboren");
	}
	
	/*
	 * Methode mit Rueckgabewert: Der Rueckgabetyp steht vor dem Methodennamen und
	 * ist gekoppelt an den Typ des Wertes, den die Methode zurueckliefert.
	 * Wenn der Rueckgabewert implizit gecastet werden kann, wird er bei der Rueckgabe gecastet,
	 * sonst muss explizit gecastet werden.
	 */
	public static int methodeMRueckgabe() {
		long zahl = 5;
		return (int)zahl;
	}
	//Rueckgabetyp zaehlt nicht mit zur Signatur
//	public static long methodeMRueckgabe() {
//		long zahl = 5;
//		return zahl;
//	}
	// Darum darf der Rueckgabetyp geaendert werden
	public static long methodeMRueckgabe(int param) {
		long zahl = 5;
		return zahl;
	}
	
	public static int retInt() {
		int zahl = 5;
		if(zahl < 6) {
			return zahl;
		}else if(zahl >= 6) {
			return 10;
		}
		return 20;
	}
	
	public static void methodWReturn() {
		int x = 3;
		if(x > 2) {
			System.out.println("x: " + x);
			return;
		}
		System.out.println("Wird nicht mehr geprintet");
	}
	
	
	
}
