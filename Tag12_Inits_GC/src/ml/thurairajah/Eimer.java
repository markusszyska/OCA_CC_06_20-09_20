package ml.thurairajah;

public class Eimer {
	private int fuellmenge;
	private int maxFuellmenge;
	
	public int getFuellmenge() {
		return fuellmenge;
	}
	public void setFuellmenge(int fuellmenge) {
		this.fuellmenge = fuellmenge;
	}
	public int getMaxFuellmenge() {
		return maxFuellmenge;
	}
	public void setMaxFuellmenge(int maxFuellmenge) {
		this.maxFuellmenge = maxFuellmenge;
	}
	
//	public void melken(int eimerFuellen) {
//		this.setFuellmenge(0);
//		this.setMaxFuellmenge(10);
//	}
	public Eimer() {
		this.setFuellmenge(0);
		this.setMaxFuellmenge(10);
	}
	public Eimer(int fuellmenge, int maxFuellmenge) {
		this.setFuellmenge(fuellmenge);
		this.setMaxFuellmenge(maxFuellmenge);
	}
//	public void melken(int milchmenge) {
//		this.setFuellmenge(this.getFuellmenge()+ milchmenge);
//		
//	}
	public int wirdGemolken() {
		int tmp = this.getFuellmenge();
		int tmp2 = this.getMaxFuellmenge();
		this.setMaxFuellmenge(20);
		this.setFuellmenge(0);
		return tmp/tmp2; //2x mit slash ok?
		 
	}
	public void wirdGemolken(int milchImEimer) {
		this.setFuellmenge(this.getFuellmenge()+milchImEimer);
		System.out.println("Der Eimer ist mit gefuellet mit " + this.getFuellmenge() + " litern Milch" + milchImEimer);
	}

	//for ref. from Cow.java 
//	public void melken2(int melkMilch) { //reference to Bauernhof.java
//		this.setMilchmenge(this.getMilchmenge()+melkMilch);
//		System.out.println(this.getName()+" wird " + melkMilch + " liter Milch gemolken");
//	}
	//
}

