package ml.salastexido.bauernhof;

public class Schluessel {
	private String name;
	private int state; //0,-1,1
	
	public boolean istLinksSeit() {
		return this.state==-1 ? true:false;
	}
	
	public boolean istRechtSeit() {
		return this.state==1 ? true:false;
	}
	
	public void wirdLinksDrehen() {
		this.state = -1;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void wirdRechtDrehen() {
		this.state = 1;	
	}
	
	public void zuruecksetzen() {
		this.state = 0;
	}
	
	public Schluessel(String name){
		this(name,0);
	}
	
	Schluessel(String name, int state){
		this.name = name;
		this.state = state;
	}
	
	
}
