package ml.axelschlewing_buch;

public class buch {

	/* Definition der Instanzvariablen */
	private String titel;
	private String autor;
	private String verlag;
	private int seiten;

	/* Konstruktor f�r Klasse buch */
	public buch(String titel, String autor, String verlag, int seiten) {
		this.setTitel(titel);
		this.titel = titel;
		this.autor = autor;
		this.verlag = verlag;
		this.seiten = seiten;
	}

	/* Getter/Setter */
	public String getTitel() {
		return this.titel;
	}

	public void setTitel(String neuerTitel) {
		this.titel = neuerTitel;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String neuerAutor) {
		this.autor = neuerAutor;
	}

	public String getVerlag() {
		return this.verlag;
	}

	public void setVerlag(String neuerVerlag) {
		this.verlag = neuerVerlag;
	}

	public int getSeiten() {
		return this.seiten;
	}

	public void setSeiten(int neuerSeiten) {
		if(neuerSeiten < 0) {
			System.out.println("Seitenzahl darf nicht kleiner 0");
			this.seiten = 0;
			return;
		}
		this.seiten = neuerSeiten;
	}

	/* toString Methode um Buchbestand anzuzeigen */
	public String toString() {
		String ausgabe = "";
		ausgabe += "BUCH:              ";
		ausgabe += this.getTitel() + " , ";
		ausgabe += this.getAutor() + " , ";
		ausgabe += this.getVerlag() + " , ";
		ausgabe += this.getSeiten() + " ";
		return ausgabe;
	}

}
