package ml.assmann.blatt01.aufgabe03;

public class Buch {
	
	// Attribute
	private String titel;
	private String autor;
	private String verlag;
	private int anzahlSeiten;
	
	
	// Getter/Setter
	public String getTitel() {
		return this.titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getVerlag() {
		return this.verlag;
	}
	
	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}
	
	public int getAnzahlSeiten() {
		return this.anzahlSeiten;
	}
	
	public void setAnzahlSeiten(int anzahlSeiten) {
		this.anzahlSeiten = anzahlSeiten;
	}
	
	
	//Konstruktoren
	public Buch() {
		this("", "", "", 0);
	}
	
	public Buch(String titel, String autor, String verlag, int anzahlSeiten) {
		this.setTitel(titel);
		this.setAutor(autor);
		this.setVerlag(verlag);
		this.setAnzahlSeiten(anzahlSeiten);
	}
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "\n==== Buch ====";
		ausgabe += "\nTitel: " + this.getTitel();
		ausgabe += "\nAutor: " + this.getAutor();
		ausgabe += "\nVerlag: " + this.getVerlag();
		ausgabe += "\nAnzahl der Seiten: " + this.getAnzahlSeiten();
		return ausgabe;
	}
}
