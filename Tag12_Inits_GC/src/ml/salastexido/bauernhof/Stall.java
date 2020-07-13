package ml.salastexido.bauernhof;

public class Stall {
	private Tuer tuer;
	
	public Stall(Tuer tuer) {
		this.tuer = tuer;
	}
	
	
	public void OeffneStall() {
		if(this.tuer.isOffnet()) {
			System.out.println("Der Stall ist Oeffned");
		}else {
			this.tuer.Offnet();
		}		
	}
	
	public void ZuStall() {
		if(!this.tuer.isOffnet()) {
			System.out.println("Der Stall ist zumachen");
		}else {
			this.tuer.Zu();
		}
	}

}
