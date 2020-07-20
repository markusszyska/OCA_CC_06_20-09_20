package ml.assmann.bauernhof.objekte;

import ml.assmann.bauernhof.fauna.*;

public class Stall {

	/*
	 * Attribute
	 */
	Kuh[] kuehe;
	Schwein[] schweine;

	/*
	 * Setter/Getter
	 */
	public Kuh[] getKuehe() {
		return this.kuehe;
	}

	private void setKuehe(Kuh[] kuehe) {
		this.kuehe = kuehe;
	}

	public Schwein[] getSchweine() {
		return this.schweine;
	}

	private void setSchweine(Schwein[] schweine) {
		this.schweine = schweine;
	}

	/*
	 * Konstruktoren
	 */

	// Parameterlos
	public Stall() {
		kuehe = new Kuh[10];
		schweine = new Schwein[10];
	}

	/*
	 * Methoden
	 */

	// Gibt Schwein an Position index zurueck
	public Schwein getSchweinAt(int index) {
		if (index < 0 || index > this.getSchweine().length - 1) {
			System.out.println("Falsche Schweineposition");
			return null;
		}
		return this.getSchweine()[index];
	}

	// Setzt Schwein schwein an Position index im Stall
	private void setSchweinAt(int index, Schwein schwein) {
		if (index < 0 || index > this.getSchweine().length - 1) {
			System.out.println("Falsche Schweineposition");
			return;
		}
		this.getSchweine()[index] = schwein;
	}

	// Gibt Kuh an Position index zurueck
	public Kuh getKuhAt(int index) {
		if (index < 0 || index > this.getKuehe().length - 1) {
			System.out.println("Falsche Kuhposition");
			return null;
		}
		return this.getKuehe()[index];
	}

	// Setzt Kuh schwein an Position index im Stall
	private void setKuhAt(int index, Kuh kuh) {
		if (index < 0 || index > this.getKuehe().length - 1) {
			System.out.println("Falsche Kuhposition");
			return;
		}
		this.getKuehe()[index] = kuh;
	}

	// Finde erste leere Position fuer ein Schwein
	private int getFreieSchweinPos() {
		for (int index = 0; index < this.getSchweine().length; index++) {
			if (this.getSchweinAt(index) == null) {
				return index;
			}
		}
		return -1;
	}

	// Finde erste leere Position fuer eine Kuh
	private int getFreieKuhPos() {
		for (int index = 0; index < this.getKuehe().length; index++) {
			if (this.getKuhAt(index) == null) {
				return index;
			}
		}
		return -1;
	}

	// Stellt Schwein in den Stall
	public boolean add(Schwein schwein) {
		int pos = this.getFreieSchweinPos();
		if (pos == -1) {
			System.out.println("Schwein \"" + schwein.getName() + "\" passt nicht, Stall ist voll!");
			return false;
		}
		this.setSchweinAt(pos, schwein);
		System.out.println("Schwein \"" + schwein.getName() + "\" wurde in den Stall gestellt.");
		return true;
	}

	// Stellt Kuh in den Stall
	public boolean add(Kuh kuh) {
		int pos = this.getFreieKuhPos();
		if (pos == -1) {
			System.out.println("Kuh \"" + kuh.getName() + "\" passt nicht, Stall ist voll!");
			return false;
		}
		this.setKuhAt(pos, kuh);
		System.out.println("Kuh \"" + kuh.getName() + "\" wurde in den Stall gestellt.");
		return true;
	}

	// Finde Schwein via Namen
	private int getSchweinPosByName(String name) {
		for(int index = 0;index<this.getSchweine().length;index++ ) {
			if(this.getSchweine()[index] == null) continue;
			if(this.getSchweine()[index].getName().equals(name)) return index;
		}
		return -1;
	}
	
	// Finde Kuh via Namen
	private int getKuhPosByName(String name) {
		for(int index = 0;index<this.getKuehe().length;index++ ) {
			if(this.getKuehe()[index] == null) continue;
			if(this.getKuehe()[index].getName().equals(name)) return index;
		}
		return -1;
	}
	
	// Verkauft ein Schwein
	public int verkaufeSchwein(String name) {
		int schweinIndex = this.getSchweinPosByName(name);
		if(schweinIndex == -1) return 0;
		int erloes = this.getSchweinAt(schweinIndex).getVerkaufspreis();
		this.setSchweinAt(schweinIndex, null);
		return erloes;
	}

	// Verkauft eine Kuh
	public int verkaufeKuh(String name) {
		int kuhIndex = this.getKuhPosByName(name);
		if(kuhIndex == -1) return 0;
		int erloes = this.getKuhAt(kuhIndex).getVerkaufspreis();
		this.setKuhAt(kuhIndex, null);
		return erloes;
	}

}
