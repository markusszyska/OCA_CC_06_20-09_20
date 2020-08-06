package exceptions_regeln.demo02exceptions;

public class Demo01TryCatch {

	public static void main(String[] args) {
		
		/*
		 * Ein try tritt niemals eigenstaendig auf.
		 * 
		 * Als Block immer mit catch und oder finally
		 */
		
		//Minimum
		try {
			
		}catch(Exception e) {
			
		}
		
		//StringIndexOutOfBoundException
		String zeichenkette = "Hallo Welt";
		for (int i = 0; i <= zeichenkette.length(); i++) {
			try {
				System.out.println(zeichenkette.charAt(i));
			}catch(StringIndexOutOfBoundsException sioobe) {
				sioobe.printStackTrace();
			}			
		}
		//ArrayIndexOutOfBoundException
		int[] zahlen = {1,2,3,4};
		int summe = 0;
		for (int i = 0; i <= zahlen.length; i++) {
			try {
				summe += zahlen[i];
			}catch(ArrayIndexOutOfBoundsException aioobe) {
				aioobe.printStackTrace();
			}
		}
		/*
		 * Wenn mehrere Exceptions abgefangen werden:
		 * Die speziellere Exception muss ueber den
		 * allgemeineren stehen, wenn sich die Exceptions
		 * im selben Hirarchiezweig befinden
		 */
		
		for (int i = 0; i < 15; i++) {			
			try {
				zeichenkette.charAt(i);
				summe += zahlen[i];
			}
			catch (ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("Array nicht lang genug");
			}
			catch(StringIndexOutOfBoundsException sioobe) {
				System.out.println("String nicht lang genug");
			}
			catch(IndexOutOfBoundsException ioobe) {
				System.out.println("Index Ueberlauf");
			}
			catch(Exception e) {
				System.out.println("Unbekannter Fehler");
			}
			System.out.println("Summe: " + summe);			
		}
		
	}
	
	
}
