package demoWrapper;

public class Wrapper01Constructor {

	/*
	 * Wrapper Klassen abgeleitet von Number: Byte, Short, Integer, Long, Float,
	 * Double
	 * 
	 * Wrapper Klassen abgeleitet von Object: Character und Boolean
	 */

	public static void main(String[] args) {
//		demoBoolean();
//		demoCharacter();
//		demoFloat();
		demoInteger();
	}

	private static void demoInteger() {
		int i1 = 123;
		Integer integer1 = new Integer(i1);
		System.out.println("integer1: " + integer1);
		
		String iString = "123";
		Integer integer2 = new Integer(iString);
		System.out.println("integer2: " + integer2);
		
		
	}

	private static void demoFloat() {
		float f1 = 123F;
		Float float1 = new Float(f1);
		System.out.println("float1: " + float1);
		
		double d1 = 123;
		Float float2 = new Float(d1);
		System.out.println("float2: " + float2);
		
		String fString = "123";
		Float float3 = new Float(fString);
		System.out.println("float3: " + float3);
		
		String fString2 = "       123        ";
		Float float4 = new Float(fString2);
		System.out.println("float4: " + float4);
		
	}

	private static void demoCharacter() {
		char c = 'c';
		char c1 = 5;
		Character char1 = new Character(c);
		Character char2 = new Character('c');
		//Dem Konstruktor von Character kann kein int uebergeben werden
//		Character char3 = new Character(5);
		
	}

	private static void demoBoolean() {
		// prim bool
		boolean b = true;
		Boolean bool1 = new Boolean(b);
		System.out.println(bool1);

		String sBool = new String("tRue");
		Boolean bool2 = new Boolean(sBool);
		System.out.println(bool2);

		// falsche Schreibweise oder null oder "false"-> false
		/*
		 * Allocates a Boolean object representing the value true if the string argument
		 * is not null and is equal, ignoring case, to the string "true".Otherwise,
		 * allocate a Boolean object representing the value false. Examples:
		 * 
		 * new Boolean("True") produces a Boolean objectthat represents true. new
		 * Boolean("yes") produces a Boolean objectthat represents false.
		 * 
		 */
		String sBool2 = "Hallo Welt";
		Boolean bool3 = new Boolean(null);
		System.out.println(bool3);
	}
}
