package demoEnum.coffeeShop;

public enum CupSize {
	
	SMALL(125, "Pappe"),
	MEDIUM(250, "Plastik"),
	LARGE(330, "Glas");
	
	//Attribute in enums koennen alle Sichtbarkeiten haben
	private int size;
	private String material;
	int defAttr = 100;
	protected int protAttr = 200;
	public int pubAttr = 300; 
	
	//Illegal modifier for the enum constructor; only private is permitted.
	/*
	 * Der Konstruktor in einem enum ist immer implizit private
	 * hinschreiben ist optional
	 * 
	 * Wenn ein enum keinen Konstruktor hat, erzeugt der Compiler einen Konstruktor
	 * mit der Signatur
	 * CupSize(String s, int i){}
	 * 
	 * Aus dem Konstruktor CupSize(int size, String material) macht der Compiler
	 * CupSize(String s, int i, int size, String material)
	 */
	private CupSize(int size, String material){
		this.size = size;
		this.material = material;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	/*
	 * Man kann Setter verwenden
	 * aber die Werte in einem Enum sollen unveraendert bleiben.
	 * Darum entweder keinen Setter bereitstellen oder durch private kapseln
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "CupSize: " + this.name() + "\nSize: " + this.getSize()
		+ "\nMaterial: " + this.getMaterial();
	}  
	
}
