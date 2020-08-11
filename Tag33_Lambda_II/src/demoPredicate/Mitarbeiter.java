package demoPredicate;

enum Geschlecht{
	M,W,D
}

public class Mitarbeiter {

	private int id;
	private int alter;
	private Geschlecht geschlecht;
	private String vorname;
	private String nachname;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public Mitarbeiter(int id, int alter, Geschlecht geschlecht, String vorname, String nachname) {
		this.setId(id);
		this.setAlter(alter);
		this.setGeschlecht(geschlecht);
		this.setVorname(vorname);
		this.setNachname(nachname);
	}
	
	public String toString() {
		return "Mitarbeiter: " + "\nId: " + this.getId() + "\nAlter: " + this.getAlter() + "\nGeschlecht: "
				+ this.getGeschlecht().name() + "\nVorname: " + this.getVorname() + "\nNachname: " + this.getNachname()
				+ "\n";
	}
}
