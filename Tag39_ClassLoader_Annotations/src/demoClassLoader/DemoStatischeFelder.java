package demoClassLoader;

/*
 * This program prints only:

1729

because the class Sub is never initialized; 
the reference to Sub.taxi is a reference to a field actually declared in class 
Super and does not trigger initialization of the class Sub. 
 */
public class DemoStatischeFelder {
	public static void main(String[] args) {
		System.out.println(Sub.taxi);
		Sub b;
	}
}

class Super2 {
	static int taxi = 1729;
}

class Sub extends Super2 {
	static {
		System.out.println("Sub");
	}
}
