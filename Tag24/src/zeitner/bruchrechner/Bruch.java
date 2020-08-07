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

	private void setNenner(int nenner) throws Exception {
		if (nenner != 0) {
			this.nenner = nenner;
		} else {
			throw new Exception("Nenner 0 !!");
		}

	}

// Konstruktoren 
	public Bruch() throws Exception {
		this(1, 1);
	}

	public Bruch(int zaehler, int nenner) throws Exception {
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
	public Bruch multiplizieren(Bruch bruch) throws Exception {
//		Bruch ergebnis = new Bruch();
//		ergebnis.setZaehler(this.getZaehler() * bruch.getZaehler()); 
//		ergebnis.setNenner(this.getNenner() * bruch.getNenner());
//		return ergebnis;
		return new Bruch(this.getZaehler() * bruch.getZaehler(), this.getNenner() * bruch.getNenner());
	}

	public Bruch kehrwert() throws Exception {
		return new Bruch(this.getNenner(), this.getZaehler());
	}

	public Bruch dividieren(Bruch bruch) throws Exception {
		// return new Bruch(this.getZaehler() * bruch.getNenner(),this.getNenner() *
		// bruch.getZaehler());
		// return this.multiplizieren(new Bruch(bruch.getNenner(),bruch.getZaehler()));
		return this.multiplizieren(bruch.kehrwert());
	}

	public Bruch addieren(Bruch bruch) throws Exception {
		Bruch ergebnis = new Bruch();
		ergebnis.setZaehler((this.getZaehler() * bruch.getNenner()) + (bruch.getZaehler() * this.getNenner()));
		ergebnis.setNenner(this.getNenner() * bruch.getNenner());
		return ergebnis;

	}

	public Bruch negieren() throws Exception {
		// return new Bruch(-this.getZaehler(), this.getNenner());
		return this.multiplizieren(new Bruch(-1, 1));
	}

	public Bruch subtrahieren(Bruch bruch) throws Exception {
		return this.addieren(bruch.negieren());
	}

	public Bruch kuerzen(int teiler) throws Exception {
		if ((this.getZaehler() % teiler == 0) && (this.getNenner() % teiler == 0)) {
			this.setZaehler(this.getZaehler() / teiler);
			this.setNenner(this.getNenner() / teiler);
		}
		return this;
	}

	public Bruch maxKuerzen() throws Exception {
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
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
