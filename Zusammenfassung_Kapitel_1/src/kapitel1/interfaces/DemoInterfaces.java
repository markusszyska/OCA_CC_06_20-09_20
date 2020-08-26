package kapitel1.interfaces;
/*
 * Interfaces geben vor was eine implementierende Klasse koennen muss, aber nicht wie sie
 * es koennen muss.
 * 
 * Interfaces koennen auf jeder Ebene in der Hirarchie implementiert werden.
 * 
 * Alle Attribute in einem Interface sind immer public static final
 * Alle Methoden ohne Koerper sind public abstract
 */

interface I1 {
	int zahl = 0;
	public int zahl2 = 0;
	final int zahl3 = 0;
	static int zahl4 = 0;
	static public int zahl5 = 0;
	
	void go();
	abstract void go2();
	public void go3();
	abstract public void go4();
	
	void go5() throws ReflectiveOperationException;
	void go6(Tier t);	
	Tier go7();
}
interface I2{
	public default void defGo() {}
//	void absGo();
}
public class DemoInterfaces implements I2, I1{
/*
 * Beim Ueberschreiben von Methoden:
 * Die Sichtbarkeit darf nicht eingeschraenkt werden.
 * Da Interface Methoden immer public sind und Methoden ohne Access Modifier
 * in Klassen aber default, waere das ein Einschraenken der Sicht -> Kompilierfehler
 * 
 * Die Uebergabeparameter:
 * Sie muessen die selbe Anzahl und den selben Typ haben, 
 * da es sich sonst um Ueberladen handelt.
 * 
 */
//	void absGo() {}	
//	void defGo() {}

	public void go() {}

	@Override
	public void go2() {}
	@Override
	public void go3() {}
	@Override
	public void go4() {}
	@Override
	public void go5() throws ReflectiveOperationException {
	}
	@Override
	public void go6(Tier s){}
//	@Override
	//Overloading
	public void go6(Schwein s){}
	
	public Schwein go7() {return null;}
}
//Covarianz
/*
 * Die ueberschreibende Methode darf einen spezielleren Typ
 * zurueckgeben als die ueberschriebene Methode.
 */
class Tier{
	Schwein goTier() {
		return new Schwein();
	}
}
class Schwein extends Tier{
//	Tier goTier() {
//		return new Tier();
//	}
//	Kuh goTier() {
//		return new Kuh();
//	}
	void doStuff() {
		Tier t = new Schwein();
		Schwein s = t.goTier();
		
		Tier t1 = new Tier();
		Schwein s1 = (Schwein)t1;
	}
}
class Kuh extends Tier{}









