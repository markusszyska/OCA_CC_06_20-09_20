package ml.neumann.bauernhof.gebaeude;

public class Eimer {
	private int fuellmenge; 
	
	
	public int getFuellmenge() {
		return fuellmenge; 
	}
	
	public void setFuellmenge(int fuellmenge) {
		this.fuellmenge = fuellmenge; 
	}
	
	public Eimer()
	{this.setFuellmenge(100);}	
	
	public Eimer(int fuellmenge)
	{this.setFuellmenge(fuellmenge);}
	
	


}
