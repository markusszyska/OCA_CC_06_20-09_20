package ml.Liebermann.Items;

import ml.Liebermann.Nahrung.Kartoffel;
import ml.Liebermann.Nahrung.Milch;
import ml.Liebermann.Nahrung.Moehre;

public class Eimer {
	private Milch milch = new Milch(0); // In Litern
	private final int MAX_FUELLMENGE = 20;
	private Moehre[] eimerMoehre = new Moehre[10];
	private Kartoffel[] eimerKartoffel = new Kartoffel[10];

	public Moehre getEineMoehre() {
		Moehre m1 = null;
		for (int i = 0; i < eimerMoehre.length; i++) {
			if(eimerMoehre[i] != null) {
				m1 = eimerMoehre[i];
				eimerMoehre[i] = null;
				break;
			}
		}
		if(m1 == null) {
			System.out.println("Keine Moehre mehr uebrig");
		}
		return m1;
	}

	public Kartoffel getEineKartoffel() {
		Kartoffel m1 = null;
		for (int i = 0; i < eimerKartoffel.length; i++) {
			if(eimerKartoffel[i] != null) {
				m1 = eimerKartoffel[i];
				eimerKartoffel[i] = null;
				break;
			}
		}
		if(m1 == null) {
			System.out.println("Keine Kartoffel mehr uebrig");
		}
		return m1;
	}

	
	
	
	
	public Moehre[] getEimerMoehre() {
		Moehre[] m1 = new Moehre[getIntMohere()];
		int counter = 0;
		for (int i = 0; i < eimerMoehre.length; i++) {
			if(eimerMoehre[i] != null) {
				m1[counter] = eimerMoehre[i];
			}
		}
		return m1;
	}

	public Kartoffel[] getEimerKartoffel() {
		Kartoffel[] m1 = new Kartoffel[getIntMohere()];
		int counter = 0;
		for (int i = 0; i < eimerKartoffel.length; i++) {
			if(eimerKartoffel[i] != null) {
				m1[counter] = eimerKartoffel[i];
			}
		}
		return m1;
	}

	
	public int getIntKartoffel() {
		int counter = 0;
		for (int i = 0; i < eimerKartoffel.length; i++) {
			if(eimerKartoffel[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	
	
	public int getIntMohere() {
		int counter = 0;
		for (int i = 0; i < eimerKartoffel.length; i++) {
			if(eimerMoehre[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	
	public void setEineKartoffel(Kartoffel k1) {
		boolean isFull = true;
		for (int i = 0; i < eimerKartoffel.length; i++) {
			if(eimerKartoffel[i] == null) {
				eimerKartoffel[i] = k1;
				isFull = false;
			}
		}
		if(isFull)
			System.out.println("Kein Platz mehr im Eimer");
	}
	
	public void setEineMoehre(Moehre m1) {
		boolean isFull = true;
		for (int i = 0; i < eimerMoehre.length; i++) {
			if(eimerMoehre[i] == null) {
				eimerMoehre[i] = m1;
				isFull = false;
			}
		}
		if(isFull)
			System.out.println("Kein Platz mehr im Eimer");
	}

	public void setEimerMoehre(Moehre[] eimerMoehre) {
		this.eimerMoehre = eimerMoehre;
	}


	public void setEimerKartoffel(Kartoffel[] eimerKartoffel) {
		this.eimerKartoffel = eimerKartoffel;
	}

	public Milch getMilch() {
		return milch;
	}

	public void setMilch(Milch milch) {
		if (this.milch.getMilchmenge() + milch.getMilchmenge() < MAX_FUELLMENGE) {
			this.milch = milch;
		} else {
			this.milch.setMilchmenge(MAX_FUELLMENGE);
		}
	}

	public void fuellen(Milch m1) {
		this.setMilch(m1);
	}

	public int getMAX_FUELLMENGE() {
		return MAX_FUELLMENGE;
	}

}
