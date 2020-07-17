package ml.neumann;

import java.util.Scanner;

public class LottoII {
	public static void main(String[] args) {
		
	///////////////////////////////////////////////////////////////////
	// Aufgabe: Es soll w�chentlich eine Ziehung durchgef�hrt werden. 
	// insgesamt sollen 52 Ziehungen ausgef�hrt werden bzw. so viele wie der Nutzer m�chte
	//////////////////////////////////////////////////////////
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Bitte geben Sie die gew�nschte Anzahl Ziehungen ein");
			int anzahl = sc.nextInt();

		int[][]ziehung = new int [anzahl][6];
	
		
		int i; // Dimension 1  - Wochen
	
		int j; //Dimension 2 - Lottozahlen 
		int z; // hilfsvariable f�r doppelte aussortieren 
		
		// Dimension 1: 
		for (i=0; i< anzahl; i++) {
			
	
			
		
		// Dimension 2 - Ziehung von 6 unterschiedlichen zahlen
		outer: for (j=0; j<6; j++) {
			 int lotto = (int)(Math.random() *49 + 1 );
			//11 System.out.println("---------------");
					 
			 z = 0;
			 while (z<5) {
			//	 System.out.println("Ziehung: " + i);
				//	System.out.println("Lottozahl: " + lotto);
				
				 z++;
				 if (ziehung[i][j]==lotto) {
					 System.out.println("doppelt");
					 i--;
					 continue outer;
				 }
			 }
		
			 ziehung[i][j]=lotto;
		}
	}
		for (i = 0; i < ziehung.length; i++) {
//			
			for (j = 0; j < ziehung[i].length; j++) {
				
				System.out.println("Zahlen der " + (i+1) +". Ziehung " +  ziehung[i][j]);
				System.out.println("------------------");
				
				
			}


}
}
}
