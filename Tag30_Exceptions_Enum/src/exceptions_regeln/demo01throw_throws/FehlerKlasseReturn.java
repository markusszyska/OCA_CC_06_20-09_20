package exceptions_regeln.demo01throw_throws;

public class FehlerKlasseReturn {

	
	public static void main(String[] args) {
		method();
		
		System.out.println("Programmende");
	}
	
	
	public static void method() {
		int num1 = 2;
		int num2 = 0;
		int result = 0;
		try {
			result = num1 /num2;
			System.out.println("result = " + result);
//			return;
			/*
			 * Im Fehlerfall:
			 * Es wird in den Catch Block gesprungen
			 * return wird nicht mehr ausgefuehrt
			 * 
			 * kein Fehler:
			 * finally wird noch ausgefuehrt
			 * Methodenausfuehrung wird abgebrochen durch return
			 */
		}catch(ArithmeticException e){
			System.out.println("Teiler war 0");
//			return;
			/*
			 * kein Fehler:
			 * Die Stelle wird nicht erreicht.
			 * finally wird ausgefuehrt
			 * Es wird daher die Methode auch nicht abgebrochen
			 * 
			 * im Fehlerfall:
			 * finally wird ausgefuehrt
			 * Die Methode wird abgebrochen und daher
			 * "Ende der Methode" nicht mehr ausgegeben
			 */
		}finally {
			System.out.println("Finally wird immer ausgefuehrt");
//			return;
			/*
			 * Ende der Methode wird nicht erreicht
			 * Kompilierfehler
			 * Unreachable Code
			 */			
		}
		
		System.out.println("Ende der Methode");
	
	}
	

	
	
	
	
}
