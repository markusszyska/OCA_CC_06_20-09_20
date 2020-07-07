package ml.assmann;

public class LittleWitch {
	public static void main(String[] args) {
		//Variablen
		int  clock = 6;
		String ausgabe = "";
	
		//Ausgabeschleife
		for(clock = 6;clock<13;clock++) {
			ausgabe = "Morgens früh um " + clock;
			switch(clock) {
				case 6: ausgabe += "\nkommt die kleine Hex."; break;
				case 7: ausgabe += "\nschabt sie gelbe Rüben."; break;
				case 8: ausgabe += "\nwird Kaffee gemacht."; break;
				case 9: ausgabe += "\ngeht sie in die Scheun'."; break;
				case 10: ausgabe += "\nhackt sie Holz und Spän'."; break;
				case 11: ausgabe = "Feuer an um " + clock + ","; break;
				case 12: ausgabe = "kocht dann bis um " + clock + ":\nFröschebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch!"; break;
			}
			System.out.println(ausgabe);
		}
	}
}
