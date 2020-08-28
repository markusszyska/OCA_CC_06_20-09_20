package kapitel2.polymorphie.wiederholungPolymorphie;

class Mammal {
	String name = "furry ";
	String makeNoise() {
		return "generic noise";
	}
}

class Zebra extends Mammal {
	String name = "stripes ";
	String makeNoise() {
		return "bray";
	}
}

interface I1{
	default void goInt() {
		System.out.println("goInt in I1");
	};
}
interface I2{
	default void goInt() {
		System.out.println("goInt in I2");
	};
}

abstract class Parent implements I1{
	public void goInt() {
		I1.super.goInt();
	};
	
}

public class ZooKeeper extends Parent{
	public static void main(String[] args) {
		new ZooKeeper().go();
	}
	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name + m.makeNoise());
		super.goInt();
		super.toString();
	}
	@Override
	public void goInt() {
		
	}
	static void goStatic() {

	}
}
