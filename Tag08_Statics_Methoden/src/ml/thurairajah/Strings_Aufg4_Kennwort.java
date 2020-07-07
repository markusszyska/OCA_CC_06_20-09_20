package ml.thurairajah;
import java.util.Scanner;

public class Strings_Aufg4_Kennwort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String abfrage = "Kennwort eingeben (mind. 10 Zeichen): ";
		
		boolean upperC = false;
		boolean lowerC = false;
		System.out.print(abfrage);
		String derText = sc.nextLine();
		char ch;
		ch = derText.charAt(0);
		
		while (!(Character.isUpperCase(ch))) {
			System.out.println("test while");
			System.out.println(abfrage);
		//}
		
		
		 if((derText.length() <= 10)){
			 
			 int missing = 10-(int)derText.length();
			System.out.println("Kennwort muss mind. 10 Zeichen haben. \n Bitte erneut eingeben.");
			System.out.println("Es fehlen noch "+missing+" Zeichen.");
			derText = sc.nextLine();
//			while (!derText.contains(derText.toUpperCase())) {
			//	System.out.println("Kennwort muss Grossbuchstaben enthalten. \n Bitte erneut eingeben.");
		//		derText = sc.nextLine();
	//		}
		 
		}
		}
			System.out.println("Alles OK. Kennwort erstellt.");
		
		
	}
}
