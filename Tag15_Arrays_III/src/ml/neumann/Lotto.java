package ml.neumann;


public class Lotto {
	
		public static void main(String[] args) {
			
			/*Methode zur Erstellung von zufälligen Zahlen zwischen 1 und 49
			 * Diese Zahlen dürfen nur einmal vorkommen.
			 * */
			//int lotto = (int)(Math.random() *49 + 1 );
			//System.out.println(lotto);
		
			/*
			 * Wie bekomme ich 6 ungleiche Zahlen: 
			 * Schleife mit abprüfung ob die Zahl schon gezogen wurde.
			 * Jede generiert Zahl muss mit dem Array verglichen werden. Wenn die Zahl
			 * noch nicht im Array ist dann kann sie hinzugefügt werden. 
			 * Ist die Zahl bereits im Array so wird sie verworfen und die nächste gezogen*/
		
			// Deklaration, initialisierung und Instanzierung des Arrays 
			int[] ziehung = new int [6];
			
			int i;// ANzahl der Zahlen im Array 
			outer: for (i=0; i<6; i++) {
				 int lotto = (int)(Math.random() *49 + 1 );
				 System.out.println("---------------");
						 
		int j = 0;
				 while (j<5) {
					 System.out.println("j: " + j);
						System.out.println("Lottozahl: " + lotto);
						System.out.println("Ziehung " + j + ": " + ziehung[j]); 
					 j++;
					 if (ziehung[j]==lotto) {
						 System.out.println("doppelt");
						 i--;
						 continue outer;
					 }
				 }
			
				 ziehung[i]=lotto;
				
				 // Überprüfung array
				 System.out.println(ziehung[0]);
				 System.out.println(ziehung[1]);
				 System.out.println(ziehung[2]);
				 System.out.println(ziehung[3]);
				 System.out.println(ziehung[4]);
				 System.out.println(ziehung[5]);
				
					
			}
			}
		}// out
// Ende Klasse
		
