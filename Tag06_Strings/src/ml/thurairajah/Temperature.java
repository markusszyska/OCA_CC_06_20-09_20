package ml.thurairajah;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Aussentemperatur eingeben:");
		int temp = sc.nextInt();
		  
		//boolean precipitation = Boolean.parseBoolean(args[1]);
		//boolean precipitation;
		System.out.println("Niederschlag? >true< oder >false< eingeben.");
		boolean precipitation = sc.nextBoolean();
		
		if (temp >= 0 && precipitation == true) {
			System.out.println("Sauwetter");
		}else if (temp > 0 && temp <= 19 && precipitation == false) {
			System.out.println("Gehen wir spazieren?");
		}else if (temp >= 20 && precipitation == false) {
			System.out.println("Gehen wir schwimmen?");
		}else if (temp < 0 && precipitation == true) {
			System.out.println("Komm, geh'n wir Schlittenfahren!");
		}else if (temp < 0 && precipitation == false) {
			System.out.println("Lass uns am Lagerfeuer Gluewein trinken.");
		}
		
	}

}
