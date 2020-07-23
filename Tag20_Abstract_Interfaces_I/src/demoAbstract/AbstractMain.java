package demoAbstract;

public class AbstractMain {
	public static void main(String[] args) {
		//Cannot instantiate the type AAbstractParent
		/*
		 * Von einer abstrakten Klasse kann kein Objekt erzeugt werden
		 */
//		AAbstractParent ab = new AAbstractParent();
		/*
		 * Eine abstrakte Klasse kann als Referenztyp genutzt
		 * werden. Der Objekttyp muss aber ein Objekt
		 * einer konkreten Kindklasse sein.
		 */
		AAbstractParent p = new Child();
		AAbstractParent[] ap = new AAbstractParent[3];
		ap[0] = new Child();
		
		p.anAabstractMethodInAbstractParent();
		AAbstrakteZwischenklasse az = new Child();
		az.anAabstractMethodInAbstractParent();
		
		p.callAMethodInAbstractParent();
		
		System.out.println("-----------------------");
		/*
		 * Statische Elemente koennen ueber den Klassennamen
		 * der Abstrakten Elternklasse bzw aller Klassen in der 
		 * Vererbungshirarchie aufgerufen werden
		 */
		AAbstractParent.aStaticMethodInAbstractParent();
		AAbstrakteZwischenklasse.aStaticMethodInAbstractParent();
		Child.aStaticMethodInAbstractParent();
		
		System.out.println(AAbstractParent.STATICCONSTANT);
		System.out.println(AAbstrakteZwischenklasse.STATICCONSTANT);
		System.out.println(Child.STATICCONSTANT);
		
		System.out.println(p.NONSTATICCONSTANT);
		System.out.println(p.STATICCONSTANT);
		
		p.aMethodInInterface();
		
	}
}
