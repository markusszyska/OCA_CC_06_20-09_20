package ml.salastexido.bauernhof;

public class Tuer {

	private boolean isOffnet;
	private String typMaterials;	
	private Schluessel schluessel;
	
	public boolean isOffnet() {
		return this.schluessel.istLinksSeit();
	}
	
	public Tuer(String typeOfMaterial,Schluessel schluessel){
		this(typeOfMaterial,true,schluessel);
	}
	
	
	public Tuer(String typMaterials, boolean b,Schluessel schluessel) {
		this.typMaterials = typMaterials;
		this.isOffnet = b;
		this.schluessel = schluessel;
	}

	public void Offnet() {
		System.out.println("Die Tuer wird Offnet...");
		this.schluessel.wirdLinksDrehen();
	}
	
	public void Zu() {
		System.out.println("Die Tuer wird zumachen...");
		this.schluessel.wirdLinksDrehen();
	}


	public String getTypMaterials() {
		return typMaterials;
	}


	public void setTypMaterials(String typMaterials) {
		this.typMaterials = typMaterials;
	}


	public void setOpen(boolean isOpen) {
		this.isOffnet = isOpen;
	}
	
	
	
}
