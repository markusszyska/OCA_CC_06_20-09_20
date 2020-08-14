package demoWrapper;

public class Wrapper03Null {
	/**
	 * Remember, wrapper reference variables can be null. That means that you have
	 * to watch out for code that appears to be doing safe primitive operations, but
	 * that could throw a NullPointerException:
	 * 
	 * This code compiles fine, but the JVM throws a NullPointerException when it
	 * attempts to invoke doStuff(x), because x doesn’t refer to an Integer object,
	 * so there’s no value to unbox.
	 */
	static Integer x; //x = null
	
	public static void main(String[] args) {
		doStuff(x);
	}
	
	public static void doStuff(int z) {
		System.out.println(z);
	}
}
