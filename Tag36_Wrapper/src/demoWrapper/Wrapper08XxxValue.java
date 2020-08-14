package demoWrapper;

public class Wrapper08XxxValue {
	/**
	 * 
	 * convert the value of a wrapped numeric to a primitive
	 * Es gibt 36 xxxValue() Methoden
	 * Jede numerische Wrapper Klasse hat sechs Methoden -	
	 *  ==> Jedes Wrapper Objekt kann zu jedem primitiven Datentyp umgewandelt werden
	 * Die Klasse Number (Oberklasse von den numerischen Typen)
	 * enthält bereits die 6 XxxValue() Methoden (Instanz) ... 
	 * 
	 * primitive xxxValue() - to convert a Wrapper to a primitive
	 */
	public static void main(String[] args) {
		demoInteger();
	}

	private static void demoInteger() {
		Integer i1 = 128;
		byte by = i1.byteValue(); //Achtung Ueberlauf
		short sh = i1.shortValue();
		int ii = i1.intValue();
		long lo = i1.longValue();
		float f1 = i1.floatValue();
		double d1 = i1.doubleValue();
		
		
	}
}
