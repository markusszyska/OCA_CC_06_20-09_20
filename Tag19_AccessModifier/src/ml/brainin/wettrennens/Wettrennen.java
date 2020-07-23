package ml.brainin.wettrennens;

import java.util.ArrayList;
import java.util.Collections;

public class Wettrennen {
	public static void main(String[] args) {
		ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
		
		Fahrrad fahrrad = new Fahrrad();
		fahrrad.bewegen(4);
		fahrzeuge.add(fahrrad);
		Auto auto = new Auto();
		auto.bewegen(1);
		fahrzeuge.add(auto);
		Rennwagen rennwagen = new Rennwagen();
		rennwagen.bewegen(1);
		fahrzeuge.add(rennwagen);
		Krankenwagen krankenwagen = new Krankenwagen();
		krankenwagen.bewegen(1);
		fahrzeuge.add(krankenwagen);
		
		Fahrzeug gewinner = null;
		Collections.sort(fahrzeuge);
		System.out.println("------------------------------------");
		for (Fahrzeug fahrzeug : fahrzeuge) {
			if (gewinner == null) {
				gewinner = fahrzeug;
			}else {
				gewinner = gewinner.getDistanz() < fahrzeug.getDistanz()? fahrzeug: gewinner;
			}
			System.out.println(fahrzeug);
			System.out.println("------------------------------------");
		}
		System.out.println("------------------------------------");
		System.out.println("Gewinner: "+gewinner);
		gewinner.toString();
				
	}
}