package ml.vi.buchsammlung;

public class Buch {

	private String titel;
	private String autor;
	private String verlag;
	private int seitenanzahl;

	public String toString() {
		return "Buch [titel=" + titel + ", autor=" + autor + ", verlag=" + verlag + ", seitenanzahl=" + seitenanzahl
				+ "]";
	}

	public Buch(String titel, String autor, String verlag, int seitenanzahl) {
		this.setTitel(titel);
		this.setAutor(autor);
		this.setVerlag(verlag);
		this.setSeitenanzahl(seitenanzahl);
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

	public int getSeitenanzahl() {
		return seitenanzahl;
	}

	public void setSeitenanzahl(int seitenanzahl) {
		this.seitenanzahl = seitenanzahl;
	}

}
