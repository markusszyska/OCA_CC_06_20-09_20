package kapitel1.accessModifiers;

//Access Level:
/*
 * Sichtbarkeiten: private default(Paketsichtbar), protected, public
 * Modifier: private, protected, public
 * 
 * Top Level Klassen haben nur zwei Sichtbarkeiten:
 * public oder paketsichtbar
 * 
 * Eine nicht sichtbare Klasse wirkt sich aus:
 * 
 * - auf Vererbung: Von einer nicht sichtbaren Klasse kann nicht geerbt werden
 * - Es besteht kein Zugriff auf Methoden und Attribute der Klasse
 * - Es kann kein Objekt erzeugt werden
 * 
 */
public class ClassModifier {
	public static void main(String[] args) {
//		DefClass.go();
//		DefClass dc = new DefClass();
		
		/*
		 * Die von einer finalen Klasse erzeugten Objekte
		 * koennen unterschiedliche Daten in ihren Attributen haben.
		 */
		FinalClass fc1 = new FinalClass();
		FinalClass fc2 = new FinalClass();
		fc1.name = "Name1";
		fc2.name = "Name2";
		
		/*
		 * Von einer finalen Klasse koennen keine anonymen Objekte
		 * erzeugt werden, da anonyme Klassen
		 * als Kindklassen umgesetzt werden.
		 */
//		FinalClass fc3 = new FinalClass(){ };
		
		AbstractClass ac = new AbstractClass() {
			@Override
			void abstractGo() {
			}
		};
		Parent p = new Parent() {
			void doStuff() {}
		};
//		p.doStuff();
	}
}
interface I{}
/*
 * Von einer Finalen Klasse koennen keine Kindklassen erzeugt werden.
 * Eine finale Klasse kann erben.
 * Eine finale Klasse kann Interfaces implementieren
 */
final class FinalClass extends Parent implements I{
	String name;
}
//class Child extends FinalClass{};
class Parent{}

/*
 * Sobald eine Methode in einer Klasse abstrakt ist,
 * muss die Klasse abstrakt sein
 */
abstract class AbstractClass{
	abstract void abstractGo();//Muss von der ersten konkreten SubKlasse implementiert werden
	void go() {};
}
class Child2 extends AbstractClass{
	@Override
	void abstractGo() {
		
	}	
}
//The class FinalAbstractClass can be either abstract or final, not both
//final abstract class FinalAbstractClass{}

strictfp class StrictClass{}