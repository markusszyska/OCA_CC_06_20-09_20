package ml.schlewing.mlaxelschlewingLotto4;

/* Klasse Generator generiert die Lottozahlen, quasi die "Ziehung" */
public class Generator {
	

	/* leerer Konstruktor, weil nichts �bergeben werden muss */
	public Generator() {
				}
	
	/* Methode ziehen, hier entsteht der zukuenftige Millionaer */
	public int ziehen() {
			int z = (int)(Math.random()*49 + 1);
			return z;	/* Rueckgabewert ist die Zufallszahl */
			}
}

