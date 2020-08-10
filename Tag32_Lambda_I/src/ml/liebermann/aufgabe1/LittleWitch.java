package ml.liebermann.aufgabe1;

public class LittleWitch {

	public static void main(String[] args) {
		String filler = "Morgens früh um ";

		for (Uhr uhr : Uhr.values())
			switch (uhr) {

			case SECHS:
				System.out.println(filler + Uhr.SECHS);
				System.out.println("kommt die kleine Hex.");
				break;

			case SIEBEN:
				System.out.println(filler + Uhr.SIEBEN);
				System.out.println("schabt sie gelbe RÜben.");
				break;

			case ACHT:
				System.out.println(filler + Uhr.ACHT);
				System.out.println("wird Kaffee gemacht.");
				break;

			case NEUN:
				System.out.println(filler + Uhr.NEUN);
				System.out.println("geht sie in die Scheun '.");
				break;

			case ZEHN:
				System.out.println(filler + Uhr.ZEHN);
				System.out.println("hackt sie Holz und Spän '.");
				break;

			case ELF:
				System.out.println("feuert an um " + Uhr.ELF);

				break;

			case ZWÖLF:
				System.out.println("kocht dann bis um " + Uhr.ZWÖLF);
				System.out.println("Fröschebein und Krebs und Fisch.");
				System.out.println("Hurtig Kinder kommt zu Tisch!");
				break;
			}
	}

}
