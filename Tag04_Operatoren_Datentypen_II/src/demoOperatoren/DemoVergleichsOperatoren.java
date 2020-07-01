package demoOperatoren;

public class DemoVergleichsOperatoren {
	public static void main(String[] args) {
		System.out.println("Vergleich primitiver Datentypen");
		int z1 = 3;
		int z2 = 3;
		boolean b1 = z1 == z2;
		System.out.println("b1 entspricht: " + b1);
		
		System.out.println("Referenz Vergleich");
		Kunde k1 = new Kunde();
		Kunde k2 = new Kunde();
		System.out.println("k1 == k2 " + (k1 == k2));
		
	
	}
}
