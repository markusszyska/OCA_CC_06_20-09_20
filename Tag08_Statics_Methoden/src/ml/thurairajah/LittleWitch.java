package ml.thurairajah;
import java.util.Scanner;

public class LittleWitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int clock = sc.nextInt();
				
		switch (clock) {
		case 6: System.out.println("Morgens frueh um "+clock+" \nkkommt die kleine Hex.");
			
			break;
		case 7:
			System.out.println("Morgens frueh um " +clock+" \nschabt sie gelbe Rueben.");
			break;
		case 8:
			System.out.println("Morgens frueh um " +clock+" \nwird Kaffee gemacht.");
			break;
		case 9:
			System.out.println("Morgens frueh um " +clock+" \ngeht sie in die Scheun");
			break;
		case 10:
			System.out.println("Morgens frueh um " +clock+" \nhackt sie Holz und Spaen");
			break;
		case 11:
			System.out.println("Feuert an um "+clock+", \nkocht dann bis um "+clock+": "
					+ "\nFroeschlein und Krebs und Fisch. \nHurtig Kinder kommt zu Tisch!");
		default:
			break;
		}
		
	}

}
