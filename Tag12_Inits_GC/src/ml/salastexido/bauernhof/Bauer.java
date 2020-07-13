package ml.salastexido.bauernhof;

public class Bauer {
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public Bauer(String name, int gewicht, int groesse, int alter) {
		this.name = name;
		this.gewicht = gewicht;
		this.groesse = groesse;
		this.alter = alter;
	}
	
	public void melken(Kuh k, Eimer eimer) {
		int kuhMilchMenge = k.wirdGemolken();
		System.out.println("[KuhMilchMenge] " + kuhMilchMenge);
		if(kuhMilchMenge==0) {
			System.out.println("Die Kuh hat keine Milch mehr... ");
		}else {
			if(eimer.getFuellmenge()<eimer.getMaxfuellmenge()) {
				int eimerFuellmenge = eimer.getFuellmenge();
				eimer.setFuellmenge(++eimerFuellmenge);
				System.out.println("[Eimer hat ] " +eimer.getFuellmenge() + " liters" );
			}else {
				System.out.println("die Eimer ist voll");
			}
		}	
	}
	
	public void OeffneStall(Stall s) {
		s.OeffneStall();
	}

	public void ZuStall(Stall s) {
		s.ZuStall();
	}
}


