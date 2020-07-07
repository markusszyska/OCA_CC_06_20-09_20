package ml.vi;

public class LittleWitch {

	public static void main(String[] args) {

		int clock;

		for (clock = 6; clock < 13; clock++) {

			if (clock < 11)
				System.out.println("Morgens früh um " + clock);

			switch (clock) {
			case 6:
				System.out.println("kommt die kleine Hex.");
				break;
			case 7:
				System.out.println("schabt sie gelbe Rüben.");
				break;
			case 8:
				System.out.println("wird Kaffe gemacht.");
				break;
			case 9:
				System.out.println("geht sie in die Scheun'.");
				break;
			case 10:
				System.out.println("hackt sie Holz und Spän'.");
				break;
			case 11:
				System.out.println("Feuert an um 11,");
				break;
			case 12:
				System.out.println("kocht dann bis um 12:");
				System.out.println("Fröschebein und Krebs und Fisch.");
				System.out.println("Hurtig Kinder kommt zu Tisch!");
				break;

			default:
				System.out.println("default");
				break;
			}

		}

	}

}
