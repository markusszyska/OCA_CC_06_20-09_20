package ml.schlewing.mlaxelschlewing_Lotto_1;


/* Klasse Generator */

public class Generator {

	/* leerer Konstruktor, weil nichts �bergeben wird */
	
	public Generator() {
			}
	
	
	/* Methode ziehen, hier entsteht der zuk�nftige Millionaer */
	
	public int ziehen() {
		int z = (int)(Math.random()*49+1);
		return z;	/* Rueckgabewert ist Zufallszahl */
		}
}
