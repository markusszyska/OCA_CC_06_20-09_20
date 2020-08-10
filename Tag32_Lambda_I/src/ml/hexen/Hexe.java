package ml.hexen;

public class Hexe {

	public enum uhrzeit {
		sechs("kommt die kleine Hex."), sieben("schabt sie gelbe Rüben."), acht("wird Kaffee gemacht."),
		neun("geht sie in die Scheun."), zehn("hackt sie Holz und Spän'."), elf("Feuert an um 11,"),
		zwoelf("kocht dann bis um 12: Fröschebein und Krebs und Fisch, \nHurtig Kinder kommt zu Tisch!\r\n");

		private String spruch;

		uhrzeit(String spruch) {
			this.spruch = spruch;
		}

		public String getSpruch() {
			return spruch;
		}
	}

	public static void main(String[] args) {

		String zeit[] = { "sechs", "sieben", "acht", "neun", "zehn", "elf", "zwoelf" };

		for (int clock = 6; clock <= 12; clock++) {
			int index = clock - 6;

			if (clock < 11) {
				System.out.println("Morgens früh um " + uhrzeit.valueOf(zeit[index]));
				System.out.println(uhrzeit.valueOf(zeit[index]).getSpruch());
			}

			else {
				System.out.println(uhrzeit.valueOf(zeit[index]).getSpruch());
			}
		}
	}
}
