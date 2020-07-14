package wiederholung;

public class Wiederholung_StandardDatentypen {
	public static void main(String[] args) {
		int zahl;
//		The local variable zahl may not have been initialized
//		System.out.println(zahl);
		
		ClassA a = new ClassA();
		System.out.println("Ganzzahlen\t: " + a.intAttr);
		System.out.println("Char\t\t: " + (int)a.chAttr);
		System.out.println("Kommazahlen\t: " + a.doubAttr);
		System.out.println("boolean\t\t: " + a.boolAttr);
		System.out.println("Referenztypen\t: " + a.stringAttr);
		System.out.println("Referenztypen\t: " + a.aAttr);
	}
}

class ClassA {
	int intAttr;
	char chAttr;
	double doubAttr;
	boolean boolAttr;
	String stringAttr;
	ClassA aAttr;
	
}