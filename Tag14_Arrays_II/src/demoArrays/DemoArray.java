package demoArrays;

public class DemoArray {

	static int[] attr;

	public static void main(String[] args) {

		/*
		 * Deklaration eines Arrays
		 */
		int[] zahlen;
		/*
		 * Initialisierung und Instanzierung mit der Groesse 5
		 */
		zahlen = new int[5];
		// Deklaration und Initialisierung in einem Schritt
		int[] zahlen2 = new int[5];

		int groesse = 5;
		int[] zahlen3 = new int[groesse];
		/*
		 * Eine lokale Variable mit dem Datentyp int[] ist auch
		 * nur eine lokale Variable die keinen Standardwert
		 * bekommt, also vor Benutzung initialisiert werden muss
		 */
		int[] zahlen4;
//		System.out.println(zahlen4);
		
		/*
		 * Bei der Instanzierung werden die Werte mit den jeweiligen Standardwerten des
		 * entsprechenden Datentyps belegt
		 */
		System.out.println("-------------------------------");
		System.out.println(zahlen3[0]);
		System.out.println(zahlen3[1]);
		System.out.println(zahlen3[2]);
		System.out.println(zahlen3[3]);
		System.out.println(zahlen3[4]);
		// Ein Array kann nicht einfach so ausgegeben werden
		System.out.println(zahlen3);
		
		System.out.println(attr);
//		System.out.println(attr[0]);//NullPointer
		
		zahlen3[2] = 100;
		System.out.println(zahlen3[2]);
		
		for (int i = 0; i < zahlen3.length; i++) {
			System.out.println(zahlen3[i]);
		}
		System.out.println(zahlen3.length);
		
		String s = "Hallo";
		System.out.println(s.length());
		
		/*
		 * Implizite Initialisierung
		 * Durch die Anzahl der Werte wird die Groesse
		 * festgelegt
		 */
		String[] namen = {"Name1", "Name2", "Name3"};
//		String[] namen2;
//		namen2 = {"Name1", "Name2", "Name3"};
		String name = namen[1];
		System.out.println(name);
		
		//Erweiterte For Schleife
		//Fuer jeden String s1 in namen
		for(String s1 : namen) {
			System.out.println(s1);
		}		
		for (int i = 0; i < namen.length; i++) {
			String s1 = namen[i];
			System.out.println(s1);
		}
		
		//Fuer jeden int zahl in zahlen3
		for(int zahl : zahlen3) {
			System.out.println(zahl);
		}
		System.out.println("----------------------------------");
		Person[] personen = {new Person("Max"), new Person("Peter"), new Person("Markus")};
		for(Person p : personen) {
			p.sayHello();
		}
		for (int i = 0; i < personen.length; i++) {
			personen[i].sayHello();
		}		
		
		int[] zahlen5 = {1,2,3};
		int[] zahlen6 = {1,2,3,4,5,6,7};
		zahlen5 = zahlen6;
		
		zahlen5[1] = 1000;
		System.out.println(zahlen6[1]);
		
		nimmtArray(zahlen6);
		System.out.println(zahlen5[0]);
		
	}
	
	public static int[] gibtArrayZurueck() {
		int[]zahlen = new int[10];
//		return new int[10];
		return zahlen;
	}
	public static void nimmtArray(int[] paramArray) {
		paramArray[0] = 2000;
	}
}

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Person(String name) {
		this.setName(name);
	}
	
	public void sayHello() {
		System.out.println(this.getName() + " sagt Hallo");
	}
	
}


