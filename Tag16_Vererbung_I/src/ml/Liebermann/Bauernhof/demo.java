package ml.Liebermann.Bauernhof;

import ml.Liebermann.Lebewesen.*;

public class demo {

	public static void main(String[] args) {
		Bauer guenther = new Bauer("Guenther", 90, 190, 45);
		// Schwein Willi = new Schwein("Willi", 100, 80, 5);
		// guenther.einpferchen(Willi);
		for (int i = 0; i < 10; i++) {
			guenther.einpferchen(new Schwein("Willi" + i, 90 + i, 55 + i, i));
			guenther.einpferchen(new Kuh("Lila" + i, 90 + i, 55 + i, i));
		}
		//arrAusgaben(guenther.getMeinStall().getKueheImStall());
		arrAusgeben(guenther.getMeinStall().getSchweineImStall());
		guenther.sellSchwein("Lila1");
		guenther.sellKuh("Lila1");
		System.out.println(guenther.getKontostand());
	}

	public static void arrAusgaben(Kuh[] refKuh) {
		for (Kuh k : refKuh) {
			System.out.println(k.getName());
		}
	}

	public static void arrAusgeben(Schwein[] refSchwein) {
		for (Schwein s : refSchwein) {
			System.out.println(s.getName());
		}
	}
}
