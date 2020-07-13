package ml.Liebermann.Bauernhof;

import ml.Liebermann.Gebaeude.Stall;
import ml.Liebermann.Items.Eimer;
import ml.Liebermann.Items.Schluessel;
import ml.Liebermann.Lebewesen.Bauer;
import ml.Liebermann.Lebewesen.Kuh;
import ml.Liebermann.Lebewesen.Schwein;
import ml.Liebermann.Nahrung.Milch;
import ml.Liebermann.Nahrung.Moehre;

public class Bauernhof {

	public static void main(String[] args) {
		// Am morgen wacht der Bauer auf und fuettert seine Tiere Willi das Schwein, und
		// Lila die Kuh welche sich in einem abgeschlossenen Stall befinden
		Bauer guenther = new Bauer("Guenther", 80, 180, 30);
		Schwein willi = new Schwein("Willi", 40, 50, 5);
		Kuh lila = new Kuh("Lila", 60, 80, 8);
		//Stall aufbau
		Stall groesserStall = new Stall();
		groesserStall.setSchweinImStall(willi);
		groesserStall.setKuhImStall(lila);
		// Bevor er jedoch rausgehen kann nimmt er sich sein schluesselbund mit
		//Schluesselbund
		Schluessel k1 = new Schluessel();
		Schluessel k2 = new Schluessel();
		Schluessel k3 = groesserStall.getTuer().getTuerSchluessel();
		// Natürlich nicht das futter vergessen
		Moehre m1 = new Moehre(20);
		Moehre m2 = new Moehre(20);
		Moehre m3 = new Moehre(20);
		// Beim Stall angekommen muss er erst einmal den richtigen schluessel finden.
		//Guenther nimmt also den 1. Schluessel in die Hand
		guenther.setSchluessel(k1);
		//Versuch nummer 1
		groesserStall.getTuer().aufschliessen(guenther.getSchluessel());
		// Guenther nimmt den 2. Schluessel
		guenther.setSchluessel(k2);
		//Versuch nummer 2
		groesserStall.getTuer().aufschliessen(guenther.getSchluessel());
		// Und zu guter letzt nimmt er den uebrigen Schluessel.
		guenther.setSchluessel(k3);
		//Versuch nummer 1
		groesserStall.getTuer().aufschliessen(guenther.getSchluessel());
		
		//Nun da die Tuer geöffnet ist verfüttert er die Moehren
		//Eine für Willi
		willi.fressen(m1);
		//Eine für Lila
		lila.fressen(m2);
		//und weil der Bauer hunger hat auch noch eine fuer ihn :D
		guenther.isst(m3);
		// als nächstes holt der Bauer einen eimer um ein wenig milch für sein muesli zu melken
		Eimer e1 = new Eimer();
		// dann melkt er Lila
		lila.Melken(e1);
		//lila sieht erschöpft aus
		System.out.println(lila.getMilch().getMilchmenge());
		//der eimer ist auch schon voll
		System.out.println(e1.getMilch().getMilchmenge());
		//anschliessend verschließt der Bauer die tuer zum stall wieder 
		groesserStall.getTuer().zuschliessen(guenther.getSchluessel());
		
	}
}