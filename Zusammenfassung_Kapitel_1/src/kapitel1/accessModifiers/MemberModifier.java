package kapitel1.accessModifiers;

public class MemberModifier {

	//Member: Attribute und Methoden einer Klasse
	
	/*
	 * Member koennen alle Sichtbarkeiten haben
	 * 
	 * Sichtbarkeiten haben Einfluss auf:
	 * Zugriff: Eine Klasse greift auf Member einer anderen Klasse zu
	 * Vererbung: Eine Klasse erbt Member einer anderen Klasse
	 * 
	 * Wenn die Klasse nicht gesehen wird, koennen auch ihre Member nicht gesehen
	 * werden.
	 * 
	 */
	//Modifier fuer Attribute
	transient int i; //transient Attribute werden nicht mit serialisiert
	volatile int i1; //volatile Attribute werden im Hauptspeicher abgelegt und nicht im Cache und werden bei Multithreading genutzt
	final int finAttr = 0;
	static int statAttr = 0;
	//+ Sichtbarkeiten
	
	/*
	 * Modifier fuer Methoden:
	 * - Sichtbarkeiten
	 * - static
	 * - abstract
	 * - final
	 * - strictfp
	 * - synchronized
	 */
	
	
	
	
	
	
	
	
	
}
