package demoInterface.persistenz;

import demoInterface.data.Teilnehmer;

public class Dateipersistenz implements IPersistenz{

	@Override
	public void neu(Teilnehmer t) {
		System.out.println("Neue Datei angelegt");
	}
	@Override
	public void laden(int tNummer) {
		System.out.println("Teilnehmer aus Datei geladen");		
	}
	@Override
	public void aktualisiert(Teilnehmer t) {
		System.out.println("Teilnehmerdatei aktualisiert");		
	}
	@Override
	public void loeschen(int tNummer) {
		System.out.println("Teilnehmerdatei geloescht");		
	}
	
}
