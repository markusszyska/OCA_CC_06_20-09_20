package ml.Liebermann.Items;

public class Tuer {

	private boolean isOffen = false;
	private Schluessel tuerSchluessel;

	public Tuer() {
		tuerSchluessel = new Schluessel();
	}

	public Schluessel getTuerSchluessel() {
		return tuerSchluessel;
	}

	public void setTuerSchluessel(Schluessel tuerSchluessel) {
		this.tuerSchluessel = tuerSchluessel;
	}

	public boolean isOffen() {
		return isOffen;
	}

	public void setOffen(boolean isOffen) {
		this.isOffen = isOffen;
	}

	public void aufschliessen(Schluessel s1) {
		if (s1.getSchluesselCode() == tuerSchluessel.getSchluesselCode()) {
			System.out.println("Richtiger Schluessel die Tuer ist nun offen");
			this.setOffen(true);
		} else {
			System.out.println("Falscher Schluessel");
		}
	}
	public void zuschliessen(Schluessel s1) {
		if (s1.getSchluesselCode() == tuerSchluessel.getSchluesselCode()) {
			System.out.println("Richtiger Schluessel die Tuer ist nun wieder verschlossen");
			this.setOffen(false);
		} else {
			System.out.println("Falscher Schluessel");
		}
	}
}
