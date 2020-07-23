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
	
}
