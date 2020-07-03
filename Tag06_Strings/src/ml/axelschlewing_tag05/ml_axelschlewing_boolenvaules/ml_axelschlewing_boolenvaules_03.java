package ml.axelschlewing_tag05.ml_axelschlewing_boolenvaules;

public class ml_axelschlewing_boolenvaules_03 {
	public static void main(String[] args) {
		
		/* Initialisierung Variablen */
		boolean variable1 = false;
		boolean variable2 = false;
		boolean ergebnis_und = false;
		boolean ergebnis_oder = false;
		boolean ergebnis_exk_oder = false;
				
		/* Initialisíerung Zählindex-Variablen */
		int index1 = 0;
		int index2 = 0;
		
		/* Schleife zum Erzeugen verschiedener Kombinationen */
		for (index1 = 0; index1 < 2; index1++) 
		{
			if (index1 == 1)
			{
				variable1 = true;
			}
			else
			{
				variable1 = false;
			}
			for (index2 = 0; index2 < 2; index2++)
			{
				if (index2 == 1)
				{
					variable2 = true;
				}
				else 
				{
					variable2 = false;
				}
				
				/* Berechnung des Ergebnis */
				ergebnis_und = variable1 && variable2;
				ergebnis_oder = variable1 || variable2;
				ergebnis_exk_oder = variable1 ^ variable2;
				
				/* Ausgabe auf Konsole */
				System.out.println(variable1 + " && " + variable2 + " liefert " + ergebnis_und);
				System.out.println(variable1 + " || " + variable2 + " liefert " + ergebnis_oder);
				System.out.println(variable1 + "  ^ " + variable2 + " liefert " + ergebnis_exk_oder);
				System.out.println();
			}
		}
	}
}
