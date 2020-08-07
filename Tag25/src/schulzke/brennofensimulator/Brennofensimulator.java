package schulzke.brennofensimulator;

import schulzke.brennofensimulator.brennstoff.Holz;
import schulzke.brennofensimulator.brennstoff.Holzkohle;
import schulzke.brennofensimulator.brennstoff.Magnesium;
import schulzke.brennofensimulator.brennstoff.Steinkohle;

public class Brennofensimulator {

	public static void main(String[] args) {
		try {
			Ofen ofen = new Ofen();
			System.out.println(ofen);

			Holz holz = new Holz();
			Holzkohle holzkohle = new Holzkohle();
			Steinkohle steinkohle = new Steinkohle();
			Magnesium magnesium = new Magnesium();

			ofen.verbrennen(holz);
			ofen.verbrennen(holz);
			ofen.verbrennen(holzkohle);
			ofen.verbrennen(steinkohle);
			ofen.verbrennen(steinkohle);
			ofen.verbrennen(steinkohle);
			ofen.verbrennen(steinkohle);
			ofen.verbrennen(magnesium);
			ofen.verbrennen(magnesium);
			ofen.verbrennen(magnesium);
			ofen.verbrennen(magnesium);
			ofen.verbrennen(steinkohle);
			ofen.verbrennen(steinkohle);
			ofen.verbrennen(steinkohle);
			ofen.verbrennen(magnesium);
			ofen.verbrennen(magnesium);
		} catch (TemperaturException e) {
//			System.out.println("Evakuierung durchgeführt .... Niemand wurde verletzt !!");
//			ofen.explodieren();
			System.out.println("... TemperaturFehlerbericht generieren ...");
			e.printStackTrace();
			System.out.println("Temperaturwert bei Fehler : " + e.getTemperatur() + "°C");
			System.out.println("... Fehlerbericht an Support gesendet ...");
			System.out.println("Beende Programm ...");
			System.exit(0);
		} catch (Exception e) {
//			System.out.println("Evakuierung durchgeführt .... Niemand wurde verletzt !!");
//			ofen.explodieren();
			System.out.println("... ExceptionFehlerbericht generieren ...");
			e.printStackTrace();
//			System.out.println("Temperaturwert bei Fehler : " + e.getTemperatur() + "°C");
			System.out.println("... Fehlerbericht an Support gesendet ...");
			System.out.println("Beende Programm ...");
			System.exit(0);
		}
		System.out.println("Unerreichbarer Programmcode ...");
	}

}
