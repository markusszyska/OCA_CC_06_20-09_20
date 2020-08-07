package neumann.bauernhof.tiere.nutztiere;

import neumann.bauernhof.pflanzen.IEssbar;
import neumann.bauernhof.tiere.IkannFressen;

public class Nutztiere implements IkannFressen{
	
	String name; 
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public Nutztiere() {
		
	}

	public Nutztiere(String name) {
		this.setName(name);
	}


	@Override
	public void fressen(IEssbar essbar) {
		essbar.wirdGegessen();
	}

	

}
