package ml.vi;

//Aufgabe 3
//Schreiben Sie ein Programm, das einen Text einliest und anschlieﬂend die ASCII-Codes des Textes ausgibt.

public class Aufg3 {

	public static void main(String[] args) {

		String text = "Schreiben Sie ein Programm, das einen Text einliest und anschlieﬂend die ASCII-Codes des Textes ausgibt.";

		for (int i = 0; i < text.length(); i++)
			System.out.print((int) text.charAt(i) + " ");
	}

}
