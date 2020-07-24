package demoAbstract;

public interface IInterface {
	/*
	 * Attribute in Interfaces sind immer
	 * public static final
	 * Hinschreiben ist optional
	 */
	int A_CONST_IN_INTERFACE = 0;
	final static public int ANOTHER_CONST = 10;
	/*
	 * Alle Methoden in Interfaces sind public abstract
	 * Hinschreiben ist optional
	 */
	void aMethodInInterface();
	abstract void anotherMethodInInterface();
	
//	void go() {		
//	};
	
	public static void aStaticMethodInInterface() {
		System.out.println("statische Methode im Interface");
	}
	
	default void defaultMethodInInterface() {
		System.out.println("Default Methode im Interface");
		if(this instanceof Child) {
			System.out.println("eins mehr");
			((Child)this).anAabstractMethodInAbstractParent();
		}
	}
	
	
	
}
interface IAnotherParentInterface{
	void anotherParentMethod();
}
interface IChildInterface extends IInterface, IAnotherParentInterface{
	
}
