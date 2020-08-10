package demoLambda02;

import java.util.function.Consumer;

@FunctionalInterface
interface IDemo01 {
	int berechne();

	default void defMethod() {
		System.out.println("default Methode im Interface");
	}

	public static void staticMethod() {
		System.out.println("statische Methode");
	}
}

interface IDemo01a {
	int go();
}

interface IDemo02 {
	int berechne(int zahl);
}

interface IDemo03 {
	int berechne(int zahl, int zahl2);
}

interface IDemo04 {
	void berechne(int zahl, int zahl2);
}

interface IDemo04a {
	void go(IDemo05 id1, IDemo05 id2);
}

interface IDemo05 {
	void go();
}

interface IDemo06 {
	void go(int... is);
}

public class DemoLambda {
	public static void main(String[] args) {
		IDemo01.staticMethod();
		IDemo01 myAnoObjRef = new IDemo01() {
			@Override
			public int berechne() {
				System.out.println("Anonymes Objekt");
				return 0;
			}
		};
		myAnoObjRef.berechne();
		myAnoObjRef.defMethod();

		int i = new IDemo01() {
			@Override
			public int berechne() {
				return 0;
			}
		}.berechne();

		IDemo01 myLambda = () -> 5;
		IDemo01 myLambda2 = () -> {
			System.out.println("Hallo Welt");
			System.out.println("zweite Anweisung");
			return 5;
		};

		int zahl = myLambda.berechne();
//		int zahl2 = ()-> {return 5;}.berechne();
//		nimmtLambda(()->5);

		IDemo02 myLambda3 = (param) -> {
			return param + param;
		};
		IDemo02 myLambda4 = param -> param * param;
		int ergebnis = myLambda3.berechne(100);
		System.out.println(ergebnis);
		int ergebnis2 = myLambda3.berechne(500);

		IDemo02[] lambdaArr = { myLambda3, myLambda4 };
		for (IDemo02 id2 : lambdaArr) {
			System.out.println(id2.berechne(100));
		}

		IDemo03 id3 = (param1, param2) -> param1 + param2;
		IDemo03 id3a = (param1, param2) -> {
			System.out.println("Hallo Welt");
			return param1 + param2;
		};

		IDemo04 id4 = (param1, param2) -> System.out.println("erste Anweisung");
		IDemo04 id4a = (param1, param2) -> {
			System.out.println("erste Anweisung");
			System.out.println("zweite Anweisung");
		};
		id4a.berechne(100, 100);
		IDemo04 id4b = (param1, param2) -> {
		};

		IDemo05 id5 = () -> {
		};
		IDemo04a id6 = (a, a1) -> {
			a.go();
			a1.go();
		};
		id6.go(() -> {
			System.out.println("erster Lambda");
		}, () -> {
			System.out.println("zweiter Lambda");
		});

		int zahl2 = returnsLambda().berechne(100, 200);

		IDemo06 id7 = (ints) -> {
			int erg = 0;
			for (int zahl1 : ints) {
				erg += zahl1;
			}
			System.out.println(erg);
		};

		id7.go(1, 2, 3, 4, 5);
		id7.go(1, 10);
		System.out.println("------------------------");
		nimmtLambda(returnsLambda(), 10, 2);

		// --------------------NICHT OCA RELEVANT-------------------------
		takesConsumer(System.out::println, new Person("Markus"));
		takesConsumer(DemoLambda::gibPersonAus, new Person("Markus"));

		
	}

	public static void nimmtLambda(IDemo01 id) {

	}

	public static IDemo03 returnsLambda() {
		return (a, b) -> a + b;
	}

	public static void nimmtLambda(IDemo03 id, int zahl, int zahl2) {
		System.out.println(id.berechne(zahl, zahl2));
	}

	public static void takesConsumer(Consumer<Person> con, Person p) {
		con.accept(p);
	}
	
	public static void gibPersonAus(Person p) {
		System.out.println(p);
	}
	
}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}