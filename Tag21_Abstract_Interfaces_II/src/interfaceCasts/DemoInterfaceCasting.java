package interfaceCasts;

public class DemoInterfaceCasting {
	/*
	 * Given a compile-time reference type S (source) and a compile-time reference type T (target), 
	 * a casting conversion exists from S to T if no compile-time errors occur due to the following rules. 
	 * If T is an interface type:
	 *
	 * If S is not a final class (§8.1.1), then, if there exists a supertype X of T, and a supertype Y of S, 
	 * such that both X and Y are provably distinct parameterized types, and that the erasures of X and Y 
	 * are the same, a compile-time error occurs.
	 *
	 * Otherwise, the cast is always legal at compile time 
	 * (because even if S does not implement T, a subclass of S might).
	 *
	 * If S is a final class (§8.1.1), then S must implement T, or a compile-time error occurs. 
	 */
	public static void main(String[] args) {
		A1 a1 = new B1();
//		B1 b1 = (B1)a1;
		
//		C1 c1 = (C1)a1;
		/*
		 * Zur Kompilierzeit gueltig
		 * Es koennte sein, dass eine Kindklasse von A1
		 * das Interface implementiert
		 */
		IInterface i1 = (IInterface)a1;
//		IInterface i2 = new A1();
//		IInterface i3 = new B1();
		
		C1 c2 = new C1();
//		IInterface i2 = (IInterface)c2;
	}
	
	
}
class A1{}
class B1 extends A1{}
final class C1{}
interface IInterface{}