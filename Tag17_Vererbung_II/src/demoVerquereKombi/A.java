package demoVerquereKombi;

public class A {
	public static void main(String[] args) {
		byte b = 10;
		byte b2 = 10;
		new B().go(b, b2);
		new C().go(b,b2);
		B bIstC = new C();
		bIstC.go(b, b2);
	}
}

class B {
	public void go(byte... bs) {
		System.out.println("byte varArg");
	}
	
}

class C extends B {
	public void go(byte b1, byte... bs) {
		System.out.println("byte b1, byte varArg");
	}
	public void go(String s) {
		System.out.println("byte b1, byte varArg");
	}
	
}