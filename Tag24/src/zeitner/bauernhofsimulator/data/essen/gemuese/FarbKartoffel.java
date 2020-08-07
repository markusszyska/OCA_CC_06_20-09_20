package zeitner.bauernhofsimulator.data.essen.gemuese;

public class FarbKartoffel extends Kartoffel{

	//Attribute (Eigenschaften)
	//immer PRIVATE !!!!
	String schalenfarbe;
	
	//getter + setter
	//im Zweifelsfall Private !!!
	private String getSchalenfarbe() {
		return this.schalenfarbe;
	}
	private void setSchalenfarbe(String schalenfarbe) {
		this.schalenfarbe = schalenfarbe;
	}
	//Konstruktoren
	//normalerweise PUBLIC
	//setzt alle Attribute auf gültige Ausgangswerte (initialisiert Diese)
	public FarbKartoffel(String sorte, int knollenzah, String schalenfarbe){
		super(sorte,knollenzah);
		this.setSchalenfarbe(schalenfarbe);
	}
	public FarbKartoffel(){
		this("Beata",200,"gelb");
	}
	
	//Standardmethoden
	//mind. toString()
	//ggf. clone() und equals()
	@Override
	public String toString() {
		return super.toString() + " und hat die Schalenfarbe : " + this.getSchalenfarbe();
	}
//	@Override
//	public boolean equals(Object obj) {
//		boolean gleich = false;
//		if (this.getKnollenzahl()==((FarbKartoffel)obj).getKnollenzahl()) {
//			if(this.getSorte().equals(((FarbKartoffel)obj).getSorte())) {
//				gleich = true;
//			}
//		}
//		return gleich;
//	}
//	@Override
//	protected FarbKartoffel clone() {
//		return new FarbKartoffel(this.getSorte(),this.getKnollenzahl(), this.getSchalenfarbe());
//	}
	//Funktionalität
	//zumeist PUBLIC bis auf HILFSMETHODEN, diese dann private
	@Override
	public void wachsen(){
		this.setKnollenzahl(this.getKnollenzahl()+ this.getKnollenzahl());
	}
//	public void wirdgefressen(int menge){
//		this.setKnollenzahl(this.getKnollenzahl()-menge);
//	}
	public void abschaelen(){
		System.out.println("Ich bin abgeschält ...");
	}
}
