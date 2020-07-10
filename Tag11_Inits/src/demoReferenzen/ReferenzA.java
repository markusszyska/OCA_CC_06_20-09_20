package demoReferenzen;

public class ReferenzA {
	public ReferenzA ref;
	public String text;
	
	public static void main(String[] args) {
		ReferenzA refA = new ReferenzA();
		refA.text = "Text in refA";
		refA.ref = refA;
		/*
		 * Die Klasse ReferenzA hat ein Attribut, das eine Referenz
		 * vom Typ ReferenzA aufnehmen kann. Variablen und Attribute koennen
		 * jeden Datentyp haben, also auch eine Referenz auf ein Objekt 
		 * der eigenen Klasse. Diese Referenz im Objekt kann damit auch auf
		 * sich selbst zeigen.
		 */
		System.out.println(refA.ref.ref.ref.text);
	}
	
}
