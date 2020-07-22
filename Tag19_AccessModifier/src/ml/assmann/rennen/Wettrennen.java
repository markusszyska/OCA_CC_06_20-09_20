package ml.assmann.rennen;

public class Wettrennen {
	public static void main(String[] args) {
		Fahrrad f = new Fahrrad();
		Auto a = new Auto();
		Rennwagen r = new Rennwagen();
		Krankenwagen k = new Krankenwagen();
		
		// Geschwindigkeiten setzen
		f.setGeschwindigkeit(20);
		a.setGeschwindigkeit(150);
		r.setGeschwindigkeit(200);
		k.setGeschwindigkeit(80);
		
		// Vorsprung
		f.bewege(240);
		
		// Alle fahren nun
		f.bewege(60);
		a.bewege(60);
		r.bewege(60);
		k.bewege(60);
		
		// Ausgabe
		System.out.println("Fahrrad: "+ f.getPosition() + " km");
		System.out.println("Auto: "+ a.getPosition() + " km");
		System.out.println("Rennwagen: "+ r.getPosition() + " km");
		System.out.println("Krankenwagen: "+ k.getPosition() + " km");
	}
}
