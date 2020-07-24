package interfaceCasts;

public class Demo_Typisierung_Vererbung_Interfaces {

	public static void main(String[] args) {
		//class A IS-A Object
		Object a = new A();
		//class A IS-A A
		A a1 = new A();
		//class A IS-A I1
		I1 a2 = new A();
		
		Object b1 = new B();
		A b2 = new B();
		B b3 = new B();
		I1 b4 = new B();
		I2 b5 = new B();
		
		
		Object c1 = new C();
		A c2 = new C();
		B c3 = new C();
		C c4 = new C();
		I1 c5 = new C();
		I2 c6 = new C();
		I3 c7 = new C();
		
		Object d1 = new D();
		A d2 = new D();
		D d3 = new D();
		I1 d4 = new D();
		I3 d5 = new D();
		I4 d6 = new D();
	}
}
class A implements I1{}
class B extends A implements I2{}
class C extends B implements I3{}
class D extends A implements I4{}
interface I1{}
interface I2{}
interface I3 extends I1{}
interface I4 extends I3{}
