package demoInterface.persistenz;

import demoInterface.data.Teilnehmer;

public class Datenbankpersistenz implements IPersistenz {

	@Override
	public void neu(Teilnehmer t) {
		System.out.println("Teilnehmer in Datenbank angelegt");		
	}
	@Override
	public void laden(int tNummer) {
		System.out.println("Teilnehmer aus Datenbank geladen");		
	}
	@Override
	public void aktualisiert(Teilnehmer t) {
		System.out.println("Teilnehmer in Datenbank aktualisiert");		
	}
	@Override
	public void loeschen(int tNummer) {
		System.out.println("Teilnehmer aus Datenbank geloescht");		
	}

}
