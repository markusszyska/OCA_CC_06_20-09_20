package demoInterface.persistenz;

import demoInterface.data.Teilnehmer;

public interface IPersistenz {
	void neu(Teilnehmer t);
	void laden(int tNummer);
	void aktualisiert(Teilnehmer t);
	void loeschen(int tNummer);

}
