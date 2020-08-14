package demoWrapper;

public class Wrapper06toString {
	// Class Object, the alpha class, has a toString() method.

	// -> Because of inheritance all other Java Classes have a toString()
	// method
	// idea of toString(): to get some meaningful representation of a given
	// object

	// How does the toString() method relate to the final Wrapper classes?

	// All of the wrapper classes have a no-arg, nonstatic, instance version
	// of toString()
	// This method returns a String with the value of the primitive wrapped
	// in the object
	public static void main(String[] args) {
		Double d = new Double(3.14);
		System.out.println(d.toString());
		System.out.println(d);

		// All of the numeric wrapper classes provide an overloaded, static
		// toString()
		// method that takes a primitive numeric of the appropriate type:
		// (Double.toString() takes a double ...

		String s1 = Double.toString(3.14);

		// Integer and Long - provide a third toString() method.
		// It's static, its first argument is the primitive,
		// and its second argument is a radix.
		// The radix tells the method to take the first argument,
		// which is radix 10 (base 10) by default, and
		// convert it to the radix provided, then return the result as a String

		String s2 = "hex: " + Long.toString(254, 16);
		System.out.println(s2);

		// toXxxString() (Binary, Hexadecimal, Octal)//
		// The Integer and Long wrapper classes let you convert numbers in base
		// 10 to other bases.
		
		String s3 = Double.toHexString(d);
		System.out.println("s3: " + s3);
		
		String s4 = Integer.toHexString(5);
		System.out.println("s4: " + s4);
		
		String s5 = Integer.toBinaryString(3);
		System.out.println("s5: " + s5);
		
		String s6 = Integer.toOctalString(123);
		System.out.println("s6: " + s6);
		
	}
}
