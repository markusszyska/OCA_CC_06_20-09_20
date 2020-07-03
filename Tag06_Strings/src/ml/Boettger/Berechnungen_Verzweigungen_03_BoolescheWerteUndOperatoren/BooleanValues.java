/*
 
Aufgabe 1

Erstellen Sie im Folgenden ein Programm, das zwei Variablen fuer Wahrheitswerte
definiert und für alle moeglichen Kombinationen der Wertebelegungen dieser
Variablen die Ergebnisse der logischen Operatoren "und", "oder" und 
"exklusiv oder" ermittelt und ausgibt.

Loesungshinweis:

Verwenden Sie zwei ineinander geschachtelte Schleifen, um alle moeglichen
Wertekombinationen zu erzeugen.

a) Erstellen Sie dazu zunaechst eine neue Programmdatei BoolenVaules.java.

b) Definieren Sie an geeigneter Stelle zwei Variablen fuer Wahrheitswerte sowie
(falls erforderlich) geeignete Variablen als Schleifenzaehler. (Es geht auch
ohne diese Zaehlvariablen, aber dazu ist ein Konstrukt noetig, dass
wir noch nicht in der Vorlesung besprochen haben. Wer es schon kennt darf es
bereits verwenden.)

c) Implementieren Sie zwei ineinander geschachtelte Schleifen. Jede dieser 
Schleifen modifiziert jeweils eine boolesche Variable sowie ggf. eine 
Zaehlvariable.

d) Im Rumpf (d.h. innerhalb) der inneren Schleife implementieren Sie die 
Ausgabeanweisungen. Formatieren Sie die Ausgabe so, dass sie gut lesbar ist.
Den Wert einer booleschen Variablen boolVariable geben Sie mit Hilfe der 
Anweisung System.out.print(boolVariable) aus.

e) Die Ausgabe Ihres Programmes sollte in etwa so aussehen:

Logische Operatoren:
====================
false && false liefert false
false || false liefert false
false ^ false liefert false
false && true liefert false
false || true liefert true
false ^ true liefert true
true && false liefert false
true || false liefert true
true ^ false liefert true
true && true liefert true
true || true liefert true
true ^ true liefert false

 */

package ml.Boettger.Berechnungen_Verzweigungen_03_BoolescheWerteUndOperatoren;

public class BooleanValues {

	public static void main(String[] args) 
	{
		boolean b_val_i = false;
		boolean b_val_j = false;
	
		System.out.println();
		System.out.println("Logical Operators");
		System.out.println("=================");
		
		for (int i = 1; i <= 2; i++)
		{
			b_val_i = (i == 1) ? false : true;			
			for (int j = 1; j <= 2; j++)
			{
				b_val_j = (j == 1) ? false : true;
				
				System.out.println(
					b_val_i + " && " + 
				    b_val_j + " = " +
					(b_val_i && b_val_j));
					
				System.out.println(
					b_val_i + " || " + 
					b_val_j + " = " +
					(b_val_i || b_val_j));		
	
				System.out.println(
					b_val_i + " ^ " + 
					b_val_j + " = " +
					(b_val_i ^ b_val_j));		

				System.out.println();
			}
		}
	}
}