package ml.salastexido;

public class LittleWitch {

	static String chorus="Morgen fürh um ";
	
	public static String concatString(int clock, String b) {
		chorus+=clock;
		return chorus.concat(b);
	}
	
	public static void main(String[] args) {
		int clock = 8;
		switch(clock) {
		case 6:
			System.out.println(concatString(clock, " kommt die kleine Hex.\n"));
			break;			
		case 7:
			System.out.println(concatString(clock, " schabt sie gelbe Ruben"));
			break;
		case 8:
			System.out.println(concatString(clock, " wird kaffe gemacht"));
			break;
		case 9:
			System.out.println(concatString(clock, " geht sie in die Scheun"));
			break;
		case 10:
			System.out.println(concatString(clock, " hack sie Holz und Spän\n"));
			break;
		case 11:
			System.out.println("Feuert an um "+clock);
			break;
		case 12:
			System.out.println("kocht dann bis um "+clock);
			System.out.println("Fröschebein und Krebs und Fisch.");
			System.out.println("Hurtig Kinder kommt zu Tish!!");
			break;	
		default:
			System.out.println("Bitte, geben Sie güntiger Wert...");
			break;
		}
		
		
	}
}
