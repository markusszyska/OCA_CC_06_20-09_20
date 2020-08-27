package kapitel2.polymorphie.up_and_downcasts;

/*
 * Up-Cast: Cast in einen Typ, der in der Vererbungshirarchie weiter oben liegt.
 * 
 * Down-Cast: Cast in einen Typ der in der Vererbungshirarchie weiter unten liegt.
 */
public class Casting {
	public static void main(String[] args) {
		/*
		 * Upcasts werden implizit ausgefuehrt
		 */
		B refB = new C();
		A refA = refB;
		
		go(new C());
		C refC = new C();
		go(refC);
		
		/*
		 * DownCasts muessen explizit durchgefuehrt werden
		 */
		B refB1 = new C();
		C refC1 = (C)refB1 ;
		
		A refA1 = new C();
		go((B)refA1);
		
		A refA2 = new B();
		// java.lang.ClassCastException:
//		C refC2 = (C)refA2;
		
		I1 refI1 = new C();
		// java.lang.ClassCastException:
//		I2 refI2 = (I2)refI1;
		
	}
	static void go(B refB) {
		
	}
}
interface I1{}
interface I2{}
class A implements I1{}
class B extends A {}
class C extends B {}


