package ml.assmann.hexe;

public class LittleWitchEnum {
	public static void main(String[] args) {

		String ausgabe = "";

		// switch-case with enum
		for(Clock c : Clock.values()) {
			ausgabe = "Morgens früh um " + c;
			switch(c) {
				case SECHS: ausgabe += "\nkommt die kleine Hex."; break;
				case SIEBEN: ausgabe += "\nschabt sie gelbe Rüben."; break;
				case ACHT: ausgabe += "\nwird Kaffee gemacht."; break;
				case NEUN: ausgabe += "\ngeht sie in die Scheun'."; break;
				case ZEHN: ausgabe += "\nhackt sie Holz und Spän'."; break;
				case ELF: ausgabe = "Feuer an um " + c + ","; break;
				case ZWOELF: ausgabe = "kocht dann bis um " + c + ":\nFröschebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch!"; break;
			}
			System.out.println(ausgabe);
		}
	}
}
