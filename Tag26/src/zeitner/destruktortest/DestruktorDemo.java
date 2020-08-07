package zeitner.destruktortest;

public class DestruktorDemo {

	public static void erzeugeHerde() {
		for(int i = 1; i <= 10;i++) {
			Schwein n = new Schwein();
			Kuh k = new Kuh();
		}
	}
	
	public static void main(String[] args) {

		System.out.println("MyObjects im Speicher : " + MyObject.anzahl);
		System.out.println("Nutztiere im Speicher : " + Nutztier.anzahl);
		System.out.println("Schweine im Speicher : " + Schwein.anzahl);
		System.out.println("Kühe im Speicher : " + Kuh.anzahl);
		erzeugeHerde();
		System.out.println("MyObjects im Speicher : " + MyObject.anzahl);
		System.out.println("Nutztiere im Speicher : " + Nutztier.anzahl);
		System.out.println("Schweine im Speicher : " + Schwein.anzahl);
		System.out.println("Kühe im Speicher : " + Kuh.anzahl);
	}
}