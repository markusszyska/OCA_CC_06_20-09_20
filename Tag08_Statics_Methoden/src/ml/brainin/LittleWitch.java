package ml.brainin;

import java.util.Scanner;

public class LittleWitch {
	public static void main(String[] args) {
		int clock = 6;
		while (clock <=11) {
			if (clock<11)
				System.out.println("Morgens früh um "+clock);
			switch (clock) {
			case 6:
				System.out.println("kommt die kleine Hex.");
				break;
			case 7:
				System.out.println("schabt sie gelbe Rüben.");
				break;
			case 8:
				System.out.println("wird Kaffee gemacht.");
				break;
			case 9:
				System.out.println("geht sie in die Scheun'.");
				break;
			case 10:
				System.out.println("hackt sie Holz und Spän'.");
				break;
			default:
				System.out.println("Feuert an um 11,\r\n" + 
						"kocht dann bis um 12:\r\n" + 
						"Fröschebein und Krebs und Fisch.\r\n" + 
						"Hurtig Kinder kommt zu Tisch!\r\n");
				break;
			}
			clock++;
		}
	}
}
