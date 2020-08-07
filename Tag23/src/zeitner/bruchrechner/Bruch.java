package zeitner.bruchrechner;

public class Bruch {

	private int zaehler;
	private int nenner;

	// getter Setter
	private int getZaehler() {
		return this.zaehler;
	}

	private void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	private int getNenner() {
		return this.nenner;
	}

	private void setNenner(int nenner) {
		if (nenner != 0) {
			this.nenner = nenner;
		} else {
			System.out.println("Fehler! - Nenner 0 ... setze den Nenner auf 1 ...");
			this.nenner = 1;
		}

	}

// Konstruktoren 
	public Bruch() {
		this(1, 1);
	}

	public Bruch(int zaehler, int nenner) {
		super();
		if (nenner < 0) {
			this.setZaehler(-zaehler);
			this.setNenner(-nenner);
		} else {
			this.setZaehler(zaehler);
			this.setNenner(nenner);
		}

	}

	// Methoden
	// toString Methode
	public String toString() {
		return this.getZaehler() + "/" + this.getNenner();
	}

	// Berechnungen
	public Bruch multiplizieren(Bruch bruch) {
//		Bruch ergebnis = new Bruch();
//		ergebnis.setZaehler(this.getZaehler() * bruch.getZaehler()); 
//		ergebnis.setNenner(this.getNenner() * bruch.getNenner());
//		return ergebnis;
		return new Bruch(this.getZaehler() * bruch.getZaehler(), this.getNenner() * bruch.getNenner());
	}

	public Bruch kehrwert() {
		return new Bruch(this.getNenner(), this.getZaehler());
	}

	public Bruch dividieren(Bruch bruch) {
		// return new Bruch(this.getZaehler() * bruch.getNenner(),this.getNenner() *
		// bruch.getZaehler());
		// return this.multiplizieren(new Bruch(bruch.getNenner(),bruch.getZaehler()));
		return this.multiplizieren(bruch.kehrwert());
	}

	public Bruch addieren(Bruch bruch) {
		Bruch ergebnis = new Bruch();
		ergebnis.setZaehler((this.getZaehler() * bruch.getNenner()) + (bruch.getZaehler() * this.getNenner()));
		ergebnis.setNenner(this.getNenner() * bruch.getNenner());
		return ergebnis;

	}

	public Bruch negieren() {
		// return new Bruch(-this.getZaehler(), this.getNenner());
		return this.multiplizieren(new Bruch(-1, 1));
	}

	public Bruch subtrahieren(Bruch bruch) {
		return this.addieren(bruch.negieren());
	}

	public Bruch kuerzen(int teiler) {
		if ((this.getZaehler() % teiler == 0) && (this.getNenner() % teiler == 0)) {
			this.setZaehler(this.getZaehler() / teiler);
			this.setNenner(this.getNenner() / teiler);
		}
		return this;
	}

	public Bruch maxKuerzen() {
		return this.kuerzen(this.ggT());
	}

	private int ggT() {
		int ggT;
		if (this.getZaehler() < this.getNenner()) {
			ggT = this.getZaehler();
		} else {
			ggT = this.getNenner();
		}
		while ((this.getZaehler() % ggT != 0) || (this.getNenner() % ggT != 0)) {
			ggT = ggT - 1;
		}
		return ggT;
	}

	private int ggT2() {
		int ggT = this.getZaehler();
		int teiler = this.getNenner();
		while (teiler != 0) {
			int temp = ggT;
			ggT = teiler;
			teiler = temp % ggT;
		}
		return ggT;
	}

	private int ggT3(int a,int b){
		//(b==0)? a:ggT3(b, a%b);
//		if (b==0) {
//			return a;
//		} else {
//			return ggT3(b, a%b);
//		}
		return (b==0)? a:ggT3(b, a%b);
	}
	
	
}
