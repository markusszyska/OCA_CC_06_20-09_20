package exceptions_regeln.demo01throw_throws;

public class Demo01Throw {

	/*
	 * throw wird benutzt um eine Exception zu werfen
	 * 
	 * Alles was von Throwable abgeleitet ist, kann mit dem Schluesselwort throw
	 * geworfen werden.
	 */

	public static void main(String[] args) {
		// unchecked
		/*
		 * eine unchecked Exception kann ohne Fehlerbehandlung geworfen werden
		 */
//		throw new ArrayIndexOutOfBoundsException();
		// checked
		/*
		 * Wird eine checked Exception geworfen muss sie entweder aufgefangen oder
		 * delegiert werden. D.h. die aufrufende Stelle muss sich darum kuemmern
		 */
		try {
			throw new Exception("Ein Fehler ist aufgetreten");
		} catch (Exception e) {

		}
		
		try {
			go();
			//Bei einem Fehler wird sofort in den catch Block gesprungen
			System.out.println("Nach dem throw");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catched");
		}

	}

	public static void go() {
		throw new ArrayIndexOutOfBoundsException();
	}
	
	
}
