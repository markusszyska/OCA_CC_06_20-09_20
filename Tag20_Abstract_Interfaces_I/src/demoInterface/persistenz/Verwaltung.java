package demoInterface.persistenz;

import demoInterface.data.Teilnehmer;

public class Verwaltung {

//	public void legeTeilnehmerAn(Dateipersistenz dp) {
//		Teilnehmer t = new Teilnehmer();
//		dp.neu(t);
//	}
//	public void legeTeilnehmerAn(Datenbankpersistenz dp) {
//		Teilnehmer t = new Teilnehmer();
//		dp.neu(t);
//	}
	public void legeTeilnehmerAn(IPersistenz dp) {
		Teilnehmer t = new Teilnehmer();
		dp.neu(t);
	}
	
	
}
