package demoWrapper;

import java.util.ArrayList;
import java.util.List;

public class Wrapper09Boxing {

	public static void main(String[] args) {

		Boolean b1 = false;
		// Java 1.4 Type Missmatch: cannot convert from boolean to Boolean
		// ab Java 1.5 Autoboxing
		
		//Loesung Java 1.4
		boolean pBool = true;
		Boolean wBool = new Boolean(pBool);
		Boolean wBool2 = new Boolean(true);

		boolean b2 = wBool2;
		// Java 1.4 Type Missmatch: cannot convert from boolean to Boolean
		// ab Java 1.5 Autoboxing
		
		//Loesung Java 1.4
		boolean pBool2 = wBool2.booleanValue();
		
		if(wBool) {}

		List<Integer> al = new ArrayList<>();
		al.add(4);
		
		usingUnboxing(10);
		usingUnboxing(new Integer(10));
		
		Integer i1 = 10;
		long l1 = i1; 		//Unboxing + Widening: 	Ja
		byte by = 10;
//		Integer i2 = by;	//Widening + Boxing:	Nein
		
	}
	/**
	 * It's very common to use wrappers in conjunction with collections. Any time
	 * you want your collection to hold objects and primitives, you'll want to use
	 * wrappers to make those primitives collection-compatible. The general rule is
	 * that boxing and unboxing work wherever you can normally use a primitive or a
	 * wrapped object.
	 * 
	 * The following code demonstrates some legal ways to use boxing:
	 *
	 */
	public static boolean usingUnboxing(Integer i) {
		Boolean ifSo = true; //boxes the literal
		Short s = 300;
		if(ifSo) { //unboxing
			System.out.println(++s);//unboxes, increments, reboxes
		}
		return !ifSo; //unboxes, returns the reverse
	}

}
