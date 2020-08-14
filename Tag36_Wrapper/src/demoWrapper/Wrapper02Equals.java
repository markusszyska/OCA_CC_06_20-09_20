package demoWrapper;

public class Wrapper02Equals {
//	In order to save memory, two instances of the
//	following wrapper objects (created through boxing), will always be == when their
//	primitive values are the same:
//	–  Boolean
//	–  Byte
//	–  Character from \u0000 to \u007f (7f is 127 in decimal)
//	–  Short and Integer from -128 to 127
//	Note: When == is used to compare a primitive to a wrapper, the wrapper will be
//	unwrapped and the comparison will be primitive to primitive.

	public static void main(String[] args) {
		int int1 = 2001;
		int int2 = 2001;
		System.out.println(int1 == int2);

		Integer i1 = 2001;
		Integer i2 = 2001;
		System.out.println((i1 == i2) + " " + i1.equals(i2));

		Integer i3 = 21;
		Integer i4 = new Integer(21);
		System.out.println((i3 == i4) + " " + i3.equals(i4));

		Integer i3a = new Integer(21);
		Integer i4a = new Integer(21);
		System.out.println((i3a == i4a) + " " + i3a.equals(i4a));

		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println((i5 == i6) + " " + i5.equals(i6));

		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println((i7 == i8) + " " + i7.equals(i8));
		
		int int3 = 1211;
		Integer i9 = new Integer(1211);
		System.out.println(int3 == i9);
		
		
	}
}
