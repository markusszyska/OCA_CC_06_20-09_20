package dynamischeKonstruktoren;

public class App {
	public static void main(String[] args) {
		BodyBuilder bb = new BodyBuilder();
//		bb.whoAmI();
		/*
		 * Der Konstruktor von Bouncer ruft erst den Elternkonstruktor auf, in dem die
		 * Methode whoAmI gecallt wird. Da der Objekttyp Bouncer ist, wird die Methode
		 * whoAmI von Bouncer ausgefuehrt. Zum Zeitpunkt des Aufrufes ist die Variable
		 * who noch nicht initialisiert, da der Konstruktor von Bouncer noch nicht
		 * fertig ist.
		 */
		Bouncer bouncer = new Bouncer();
		bouncer.whoAmI();
	}
}
