package demoInterface;

import demoInterface.persistenz.Dateipersistenz;
import demoInterface.persistenz.Datenbankpersistenz;
import demoInterface.persistenz.Verwaltung;

public class VerwaltungMain {
	public static void main(String[] args) {
		Verwaltung v = new Verwaltung();
		Dateipersistenz dp = new Dateipersistenz();
		Datenbankpersistenz dbp = new Datenbankpersistenz();
		
		
		v.legeTeilnehmerAn(dp);
		v.legeTeilnehmerAn(dbp);
		
		
	}
}
