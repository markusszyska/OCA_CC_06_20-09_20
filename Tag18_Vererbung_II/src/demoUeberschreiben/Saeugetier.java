package demoUeberschreiben;

public class Saeugetier {
	public int doStuff() {
		return 0;
	}
	public Saeugetier covarianz() {
		return new Saeugetier();
	}
	public Pflanze covarianz2() {
		return null;
	}
	public Pflanze covarianz3() {
		return null;
	}
	
	public Saeugetier go() {
//		return new Schwein();
//		return new Kuh();
		return new Kalb();
	}
	
}

class Schwein extends Saeugetier{
	//The return type is incompatible with Saeugetier.doStuff()
	//Beim Ueberschreiben darf der Rueckgabetyp nicht geaendert werden
//	public long doStuff() {
//		return 1;
//	}
	/*
	 * Beim Ueberladen darf der Rueckgabetyp geaendert werden.
	 * Hier wird die geerbte Methode der Elternklasse ueberladen.
	 */
	public long doStuff(int zahl) {
		return 0;
	}
	/*
	 * Beim Ueberschreiben darf der Rueckgabetyp in einen spezielleren Typ
	 * der ueberschriebenen Methode geaendert werden.
	 * covarianter Rueckgabetyp
	 */
	public Kuh covarianz() {
		return null;
	}
	public Moehre covarianz2() {
		return null;
	}
	/*
	 * Aber nicht allgemeiner
	 */
//	public Object covarianz3() {
//		return null;
//	}
	
}

class Kuh extends Saeugetier{
	
}
class Kalb extends Kuh{
	
}

