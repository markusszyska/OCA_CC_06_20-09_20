package ml.salastexido.farm;

public class Farm {
	
	private int id;
	private Barn barn; //barnReference Stall
	
	
	public Farm(int id, Barn barn) {
		super();
		this.id = id;
		this.barn = barn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Barn getBarn() {
		return barn;
	}
	public void setBarn(Barn barn) {
		this.barn = barn;
	}
	
	

}
