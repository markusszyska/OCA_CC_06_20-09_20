package kapitel2.polymorphie.returnTypes;

public class ReturnTypes {

	public static void main(String[] args) {
		A a = retReference2();
	}

	/*
	 * Bei Methoden mit einem Referenztyp als Rueckgabetyp kann jeder Subtyp
	 * zurueckgegeben werden
	 */
	static A retReference() {
		return new B();
	}

	static A retReference2() {
		I1 refI1 = new A();
		I1 refI11 = new I1() {

		};
		return (A) refI11;
	}

	static I1 returnI1() {
//		return new A();

		I1 refI1 = new I1() {

		};
		return new I1() {

		};
	}

	// null ist ein gueltiger Rueckgabewert
	static String retNull() {
		return null;
	}

	/*
	 * Bei primitiven Rueckgabewerten kann alles zurueckgegeben werden, das implizit
	 * gecastet werden kann
	 */
	static short retShort() {
		byte b = 1;
		return b;
	}

	// oder es wird explizit gecastet
	static short retShort2() {
		int i = 10;
		return (short) i;
	}

	void retVoid() {
		return;
	}
}

interface I1 {
}

class A implements I1 {
}

class B extends A {
}
