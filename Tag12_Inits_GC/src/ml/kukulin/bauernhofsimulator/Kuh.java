package ml.kukulin.bauernhofsimulator;



public class Kuh {
	
	
	private String name;
	private int milhmenge;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMilhmenge() {
		return milhmenge;
	}
	public void setMilhmenge(int milhmenge) {
		this.milhmenge = milhmenge;
	}
	
	public Kuh() {
	Kuh	kuh = new Kuh("", 0);
		
	}
	
	
	public Kuh(String name,int milchmenge ) {
		
		this.setName(name);
		this.setMilhmenge(milchmenge);
		
	}
	public void wirdGemolken() {
		Eimer eimer = new Eimer(this.milhmenge);
		System.out.println(name + ": " + eimer.getFuellmenge());
		
	}
	
}
	
	
	
	


