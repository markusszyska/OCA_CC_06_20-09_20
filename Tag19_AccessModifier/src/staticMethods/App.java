package staticMethods;

public class App {
	public static void main(String[] args) {
		B.go();
		A a = new B();
		a.go();
		B b = new B();
		b.go();
	}
}

class A {
	static void go() {
		System.out.println("go in A");
	}
}

class B extends A {
	static void go() {
		System.out.println("go in B");
	}
}