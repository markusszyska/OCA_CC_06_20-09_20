package demoWrapper;

public class Wrapper05ParseXXX {
	//The six parseXxx() methods (one for each numeric wrapper type) are

	// closely related to the valueOf() method that exists in all of the
	// numeric wrapper classes.

	// parseXxx() take a String as an argument
	// throw a NumberFormatException (a.k.a. NFE) if the String argument is not properly formed
	// can convert String objects from different bases (radix), when the underlying primitive type is any of the four integer types.

	// parseXxx() returns the named primitive.
	public static void main(String[] args) {
		
		demoLong();
		demoDouble();
		
	}

	private static void demoDouble() {
		double d1 = Double.parseDouble("3.14");
		System.out.println("d1: " + d1);		
	}

	private static void demoLong() {
		long l1 = Long.parseLong("101010", 2);
		System.out.println("l1: " + l1);
		
		long l2 = Long.parseLong("43");
		System.out.println("l2: " + l2);
		
	}
}
