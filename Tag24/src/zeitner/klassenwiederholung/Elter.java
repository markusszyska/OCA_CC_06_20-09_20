package zeitner.klassenwiederholung;

public class Elter {
	private String name;

	private String getName() {
		return this.name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public Elter(String name) {
		super();
		this.setName(name);
	}
	public Elter() {
		super();
		this.setName("konkretes Elter");
	}

	@Override
	public String toString() {
		return this.getName();
	}
	public void schenken(Kind k) {
		System.out.println("Ich schenke etwas an " + k + " ...");
		k.wirdBeschenkt();
	}

	public void wirdBeschenkt() {
		System.out.println("Hurra!! Ich habe ein Geschenk bekommen ...");
	}
	public void wirdBeschenkt(Elter e) {
		System.out.println("Hurra!! Ich habe ein Geschenk von " + e + " bekommen ...");
		System.out.println("Danke !!!!!!");
	}
}
