package defaultMethoden;

public class Application {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		c1.go();
	}
}

class MyClass implements I1, I2{

	@Override
	public void go() {
		System.out.println("ueberschrieben in MyClass");
		I1.super.go();
		I2.super.go();
	}	
}

interface I1 {
	default void go() {
		System.out.println("go I1");
	}
}

interface I2 {
	default void go() {
		System.out.println("go I2");
	}

}