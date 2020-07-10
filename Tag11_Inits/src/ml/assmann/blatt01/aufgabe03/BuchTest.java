package ml.assmann.blatt01.aufgabe03;

public class BuchTest {
	public static void main(String[] args) {
		Buch buch1 = new Buch("Der Herr der Ringe – Band 1: Die Gefährten", "J.R.R. Tokien", "Klett-Cotta", 491);
		Buch buch2 = new Buch("Harry Potter 1 und der Stein der Weisen ", "J. K. Rowling", "Carlsen", 334);
		Buch buch3 = new Buch("Java ist auch eine Insel", "Christian Ullenbloom", "Rheinwerk Computing", 1278);
		
		System.out.println(buch1);
		System.out.println(buch2);
		System.out.println(buch3);
		
	}
}
