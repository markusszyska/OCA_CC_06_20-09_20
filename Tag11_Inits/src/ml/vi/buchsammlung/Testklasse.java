package ml.vi.buchsammlung;

public class Testklasse {

	public static void main(String[] args) {

		Buch b1 = new Buch("Das Buch", "Der Autor", "Der Verlag", 150);
		Buch b2 = new Buch("Das Zweite", "Zaha", "ZA Verlag", 160);
		Buch b3 = new Buch("Das Dritte", "Dolo", "DO Verlag", 230);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}
	
}
