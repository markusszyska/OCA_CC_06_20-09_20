package ml.Liebermann;

public class Switch {
	public static void main(String[] args) {
		int clock;
		String hex = "Morgens früh um ";
		String ausgabe;
		for (clock = 6; clock < 13; clock++) {
			ausgabe = hex + clock + "\n"; 
			switch(clock) {
			case 6:
				ausgabe += "kommt die kleine Hex.";
				break;
			case 7:
				ausgabe += "schabt sie gelbe Rüben.";
				break;
			case 8:
				ausgabe += "wird Kaffee gemacht.";
				break;
			case 9:
				ausgabe += "geht sie in die Scheun.";
				break;
			case 10:
				ausgabe += "hackt sie Holz und Spän.";
				break;
			case 11: 
				ausgabe = "Feuert an um " + clock;
				break;
			case 12:
				ausgabe = "kocht dann bis um " + clock + ":\n" + "Fröschebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch!";
				break;
			default: 
				ausgabe += "badumtz";
				break;
			
			}
			System.out.println(ausgabe);
		}
	}
}
