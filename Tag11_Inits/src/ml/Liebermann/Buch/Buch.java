package ml.Liebermann.Buch;

import ml.Liebermann.Konto.Konto;

public class Buch {
	private String titel;
	private String autor;
	private String verlag;
	private int seiten;

	public Buch(String titel, String autor, String verlag, int seiten) {
		this.setTitel(titel);
		this.setAutor(autor);
		this.setVerlag(verlag);
		this.setSeiten(seiten);
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getVerlag() {
		return verlag;
	}

	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

	public int getSeiten() {
		return seiten;
	}

	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}
	
	public String toString() {
		return "\nTitel: \t" + this.getTitel() 
				+ "\nAutor: \t" + this.getAutor()
				+ "\nVerlag: \t" + this.getVerlag()
				+ "\nSeitenanzahl: \t" + this.getSeiten();
	}
	
	public static void main(String[] args) {
		Buch buch1 = new Buch("Programmer l Exam Guide", "Kathy Sierra","Oracle Press",  435);
		Buch buch2 = new Buch("Java ist auch eine Insel", "Christian Ullenboom", "Rheinwerk Computing", 1278);
		Buch buch3 = new Buch("Java ist auch Exam Guide ", "Christian Sierra", "Oracle Computing", 843);
		System.out.println(buch1);
		System.out.println(buch2);
		System.out.println(buch3);
	}

}
