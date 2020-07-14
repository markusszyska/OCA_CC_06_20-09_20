package wiederholung;

public class Wiederholung_Scope {
	static String text = "";

	String text2 = "";

	public static void main(String[] args) {
		/*
		 * Lokale Variable Lebt, solange die Methode auf dem Stack ist, und ist ab der
		 * Zeile der Deklaration und Initialisierung gueltig.
		 */
		int zahl = 10;

		{
			int blockZahl = 100;
		}
		;
//		System.out.println(blockZahl);

		if (true) {
			int ifZahl = 100;
		}
//		System.out.println(ifZahl);
		int lokZahl;
		for (int i = 0; i < 5; i++) {
			lokZahl = 100;
			int outer = 100;
			for (int j = 0; j < 5; j++) {
				int inner = 100;
				System.out.println(outer);
				System.out.println(inner);
			}
//			System.out.println(inner);
		}
//		System.out.println(outer);
		lokZahl = 10;

		for (int i = 0; i < args.length; i++)
//			int inner2 = 10; //Keine Deklaration, wenn die Klammer weggelassen wird
			for (int j = 0; j < args.length; j++)
				System.out.println();

		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 2; j++)
				System.out.println("Hallo");
		System.out.println("Welt");

		/*
		 * Instanz Variablen leben solange, wie das Objekt lebt
		 */
		String meinString = new Wiederholung_Scope().text2;
		/*
		 * Statische Variablen leben solange wie die Klasse lebt
		 */
		String meinString2 = Wiederholung_Scope.text;

		switch (meinString) {
		case "":
			int switchZahl = 100;
			// The local variable switchZahl may not have been initialized
//		case "A": System.out.println(switchZahl);

		}
		boolean bool = true;
		int zahl5;
		if (bool) {
			zahl5 = 10;
		}
		// The local variable zahl5 may not have been initialized
//		System.out.println(zahl5);

	}

	static void go(int zahl) {
		zahl = 10;
	}
}
