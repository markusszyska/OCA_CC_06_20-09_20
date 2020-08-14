package demoWrapper;

public class Wrapper07ValueOf {
	// throws a NumberFormatException (a.k.a. NFE) if the String argument is not
	//properly formed, 
	// and can convert String objects from different bases (radix), when the
	// underlying primitive type is any of the four integer types.

	// valueOf() returns a newly created wrapped object of the type that
	// invoked the method.

	// Jede Wrapper Klasse enthält die valueOf(...) Methode 
	// in der Regel überladen

	//Wrapper valueOf(String) - to convert a String to a Wrapper
	
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf("101010");
		System.out.println("i1: " + i1);
		
		Integer i2 = Integer.valueOf("101010", 2);
		System.out.println("i2: " + i2);
		
		Integer i3 = Integer.valueOf(101010);
		System.out.println("i3: " + i3);
		
		Float f1 = Float.valueOf("1.5");
		System.out.println(f1);
		
		Double d1 = Double.valueOf("1.5");
		System.out.println(d1);
		
		
		
		
	}
}
