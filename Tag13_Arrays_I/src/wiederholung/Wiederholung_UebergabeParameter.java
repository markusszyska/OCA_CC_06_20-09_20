package wiederholung;

public class Wiederholung_UebergabeParameter {
	public static void main(String[] args) {
		//Uebergabe ByValue
		int zahl = 100;		
		go(zahl);
		System.out.println(zahl);
		
		
		B b1 = new B();
		b1.intAttr = 100;
		go2(b1);
		System.out.println(b1.intAttr);
	}
	
	public static void go(int z) {
		z = 1;
	}
	
	public static void go2(B b) {
		b.intAttr = 1;
	}
}

class B {
	int intAttr;
}