package wiederholung;

public class Wiederholung_GC {
	public static void main(String[] args) {
		/*
		 * An object is eligible when no live thread can reach it.
		 * To reach an object, you must have a live, reachable reference to that object.
		 */
		C localC = new C();
		localC.d = new D();
		localC.d.c = localC;
		localC = null;
		localC.d.c = localC.d.c;
		
	}
}

class C{
	D d;
}

class D{	
	C c;
}
