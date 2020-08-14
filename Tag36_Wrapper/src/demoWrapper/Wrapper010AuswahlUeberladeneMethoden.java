package demoWrapper;

public class Wrapper010AuswahlUeberladeneMethoden {

	public static void main(String[] args) {
//		double d = 1.5;
//		probe(d);
		int i = 5;
		probe(i);
		
//		Integer i1 = 5;
//		probe(i1);
		
	}
	
//	static void probe(int... o) {
//		System.out.println("in varargs");
//	}	
//	static void probe(long o) {
//		System.out.println("in long");
//	}	
//	static void probe(int o) {
//		System.out.println("in int");
//	}
	static void probe(Object o) {
		System.out.println("in Object");
	}
//	static void probe(Number n) {
//		System.out.println("in Number");
//	}
//	static void probe(Integer i) {
//		System.out.println("in Integer");
//	}
//	static void probe(Long l) {
//		System.out.println("in Long");
//	}
	
	/*
	 * Prioritaeten bei der Auswahl der ueberladenen Methode
	 * 
	 * Variable primitiver Datentyp
	 * 1. primitiver Datentyp der exakt passt.
	 * 2. primitiver Datentyp mit Widening.
	 * 3. Wrapper Datentyp mit Boxing
	 * 4. Wrapper mit Boxing und Upcast zu Number bzw Object
	 * 5. Varargs
	 * 
	 * Variable Wrapper
	 * 1. Wrapper der genau passt
	 * 2. Upcast zu Number bzw Object
	 * 3. Unboxing ohne Widening
	 * 4. Unboxing + Widening
	 * 5. Varargs
	 * 
	 * 
	 */
	
}
