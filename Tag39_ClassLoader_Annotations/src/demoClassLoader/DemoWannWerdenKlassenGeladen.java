package demoClassLoader;

public class DemoWannWerdenKlassenGeladen {

	/*
	 * https://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html
	 * 
	 * 12.4. Initialization of Classes and Interfaces
	 * 
	 * Initialization of a class consists of executing its static initializers and
	 * the initializers for static fields (class variables) declared in the class.
	 * 
	 * Initialization of an interface consists of executing the initializers for
	 * fields (constants) declared in the interface.
	 * 
	 * Before a class is initialized, its direct superclass must be initialized, but
	 * interfaces implemented by the class are not initialized. Similarly, the
	 * superinterfaces of an interface are not initialized before the interface is
	 * initialized.
	 * 
	 * 
	 * 12.4.1. When Initialization Occurs
	 * 
	 * A class or interface type T will be initialized immediately before the first
	 * occurrence of any one of the following:
	 * 
	 * T is a class and an instance of T is created.
	 * 
	 * T is a class and a static method declared by T is invoked.
	 * 
	 * A static field declared by T is assigned.
	 * 
	 * A static field declared by T is used and the field is not a constant variable
	 * (§4.12.4).
	 * 
	 * T is a top level class (§7.6), and an assert statement (§14.10) lexically
	 * nested within T (§8.1.3) is executed.
	 * 
	 * A reference to a static field (§8.3.1.1) causes initialization of only the
	 * class or interface that actually declares it, even though it might be
	 * referred to through the name of a subclass, a subinterface, or a class that
	 * implements an interface.
	 * 
	 * Invocation of certain reflective methods in class Class and in package
	 * java.lang.reflect also causes class or interface initialization.
	 * 
	 * A class or interface will not be initialized under any other circumstance.
	 * 
	 * The intent is that a class or interface type has a set of initializers that
	 * put it in a consistent state, and that this state is the first state that is
	 * observed by other classes. The static initializers and class variable
	 * initializers are executed in textual order, and may not refer to class
	 * variables declared in the class whose declarations appear textually after the
	 * use, even though these class variables are in scope (§8.3.2.3). This
	 * restriction is designed to detect, at compile time, most circular or
	 * otherwise malformed initializations.
	 * 
	 * The fact that initialization code is unrestricted allows examples to be
	 * constructed (§8.3.2.3) where the value of a class variable can be observed
	 * when it still has its initial default value, before its initializing
	 * expression is evaluated, but such examples are rare in practice. (Such
	 * examples can be also constructed for instance variable initialization
	 * (§12.5).) The full power of the Java programming language is available in
	 * these initializers; programmers must exercise some care. This power places an
	 * extra burden on code generators, but this burden would arise in any case
	 * because the Java programming language is concurrent (§12.4.2).
	 */

	/*
	 * This program produces the output:
	 * 
	 * Super Two false
	 * 
	 * The class One is never initialized, because it not used actively and
	 * therefore is never linked to. The class Two is initialized only after its
	 * superclass Super has been initialized.
	 */
	public static void main(String[] args) {
		One o = null;
		System.out.println("Class One wurde nicht geladen");
		Two t = new Two();
		System.out.println((Object) o == (Object) t);
	}
}

class Super {
	static {
		System.out.println("Super");
	}
}

class One {
	static {
		System.out.println("One");
	}
}

class Two extends Super {
	static {
		System.out.println("Two");
	}
}