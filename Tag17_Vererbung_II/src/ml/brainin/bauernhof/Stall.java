package ml.brainin.bauernhof;

import java.util.ArrayList;

public class Stall {
	
	private int maxAnzahl = 10;
	private ArrayList<Kuh> kuehe = new ArrayList<>();
	private ArrayList<Schwein> schweine = new ArrayList<>();
	private long id = System.currentTimeMillis();
	private String name;
	
	public Stall() {
		this("Standartname der Stall");
	}
	public Stall(String name) {
		this.name = name;
	}

	public void addKuh(Kuh kuh) {
		if (kuehe.size() +1 > maxAnzahl) {
			System.out.println("Der stall ist voll");
		}else {
			kuehe.add(kuh);
		}
	}
	public void addSchwein(Schwein schwein) {
		if (kuehe.size() +1 > maxAnzahl) {
			System.out.println("Der stall ist voll");
		}else {
			schweine.add(schwein);
		}
	}
	public Schwein verkaufenSchwein(Schwein schwein) {
		for( int i = schweine.size()-1; i >= 0 ; i--) {
			Schwein schwein1 = schweine.get(i);
			if (schwein1.equals(schwein)) {
				schweine.remove(i);
				return schwein1;
			}
		}
		return null;
	}
	public Kuh verkaufenKuh(Kuh kuh) {
		for( int i = kuehe.size()-1; i >= 0 ; i--) {
			Kuh kuh1 = kuehe.get(i);
			if (kuh1.equals(kuh)) {
				kuehe.remove(i);
				return kuh1;
			}
		}
		return null;
	}
	public double getKueheKontostand() {
		double sum = 0;
		for (Kuh kuh : kuehe) {
			sum += kuh.getVerkaufsPreis();
		}
		return sum;
	}
	public double getSchweineKontostand() {
		double sum = 0;
		for (Schwein schwein : schweine) {
			sum += schwein.getVerkaufsPreis();
		}
		return sum;
	}
	
	public double getGesamtesKontostand() {
		return getKueheKontostand() + getGesamtesKontostand();
	}
	public ArrayList<Kuh> getKuehe() {
		return kuehe;
	}

	public void setKuehe(ArrayList<Kuh> kuehe) {
		this.kuehe = kuehe;
	}

	public ArrayList<Schwein> getSchweine() {
		return schweine;
	}

	public void setSchweine(ArrayList<Schwein> schweine) {
		this.schweine = schweine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
