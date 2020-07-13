package ml.assmann.bauernhof.objekte;

public class Tuer {
	
	/*
	 * Attribute
	 */
	private final Schluessel schluessel = new Schluessel();
	private boolean offen = false;
	
	/*
	 * Setter/Getter
	 */
	public Schluessel getSchluessel() {
		return this.schluessel;
	}
	
	public boolean istOffen() {
		return offen;
	}
	
	// - private da die Tuer NUR mit dem Schluessel geoeffnet und geschlossen werden kann
	private void setOffen(boolean offen) {
		this.offen = offen;
	}
	
	/*
	 * Methoden
	 */
			
	/* passtSchluessel(Schluessel schl) - gibt true zurueck wenn die Referenz
	 * zum eignen Schluessel gleich ist mit der uebergebenen Referenz
	 */
	public boolean passtSchluessel(Schluessel schl) {
		return this.getSchluessel() == schl;
	}
	/* 
	 * aufschliessen(Schluessel schl) - nimmt einen Schluessel entgegen und prüft
	 * ob dieser "passt" und schliesst dann auf oder auch nicht. Ueberpruefung
	 * erfolgt anhand der Referenz, d.h. nur ein Objekt existiert, dass
	 * die Tuer oeffnet. Gibt true zurueck wenn der Schluessel passt.
	 */
	public void aufschliessen(Schluessel schl) {
		if(this.passtSchluessel(schl)) this.setOffen(true);		
	}
	
	/* 
	 * abschliessen(Schluessel schl) - nimmt einen Schluessel entgegen und prüft
	 * ob dieser "passt" und schliesst dann ab oder auch nicht. Ueberpruefung
	 * erfolgt anhand der Referenz, d.h. nur ein Objekt existiert, dass
	 * die Tuer schliesst. Gibt true zurueck wenn der Schluessel passt.
	 */
	public void abschliessen(Schluessel schl) {
		if(this.passtSchluessel(schl)) this.setOffen(false); 		
	}
}
