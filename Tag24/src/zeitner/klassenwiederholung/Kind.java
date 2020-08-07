package zeitner.klassenwiederholung;

public class Kind extends Elter {
	public Kind(String name) {
		super(name);
	}
	public Kind() {
		super("konkretes Kind");
	}
	public void wirdBeschenkt(Elter e) {
		System.out.println("Ich hasse das Geschenk von " + e + " ...");
		System.out.println("Bäh wie hässlich !!!!!!");
	}
}
