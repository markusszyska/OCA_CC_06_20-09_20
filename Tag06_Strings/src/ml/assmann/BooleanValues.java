package ml.assmann;

public class BooleanValues {
	
	public static void main(String[] args) {
		
		//Variablen deklarieren und initialisieren
		int i = 0, j = 0;
		boolean b1 = false, b2 = false;
		
		System.out.println("Logische Operatoren:");
		System.out.println("====================");
		
		//Bearbeitungsschleife
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println(b1 + " && " + b2 + " liefert " + (b1 && b2));
				System.out.println(b1 + " || " + b2 + " liefert " + (b1 || b2));
				System.out.println(b1 + "  ^ " + b2 + " liefert " + (b1 ^ b2));
				System.out.println("");
				b2 = !b2;
			}
			b1 = !b1;
		}
	}
}
