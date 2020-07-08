package ml.Liebermann;

import java.util.Scanner;

public class Pirate_Speech2 {

	public static void main(String[] args) {

		String eingabe = "";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Text zur codierung eingeben!");
			eingabe = sc.nextLine();
			System.out.println(pirateArr(eingabe));

//			System.out.println(eingabe.
//					replaceAll("a", "arr").
//					replaceAll("e", "err").
//					replaceAll("i", "irr").
//					replaceAll("o","orr").
//					replaceAll("u", "urr"));			
//			

		} while (!eingabe.equalsIgnoreCase("ende"));
	}

	public static String pirateArr(String oldString) {
		String newString = "";

		for (int i = 0; i < oldString.length(); i++) {
//			Wenn der buchstabe ein umlaut ist
			if (String.valueOf(oldString.charAt(i)).matches("[a|e|i|o|u|A|E|I|O|U]")) {
//				Test ob index + 1 out of range ist
				if (i + 1  < oldString.length()) {
//					Test ob der buchstabe nach dem umlaut ein u ist
					if (!String.valueOf(oldString.charAt(i + 1)).equalsIgnoreCase("u")) {
						newString += String.valueOf(oldString.charAt(i)) + "rr";
					} else if (String.valueOf(oldString.charAt(i + 1)).equalsIgnoreCase("u")) {
						newString += String.valueOf(oldString.charAt(i)) + String.valueOf(oldString.charAt(i)).toLowerCase() + "uurghs";
//						i erhöhen um den buchstaben u zu überspringen
						i++;
						
					}
				}
				else {
//					falls das umlaut am ende des strings steht rr anfügen
					newString += String.valueOf(oldString.charAt(i)) + "rr";
				}
			} else {
//				sonst immer anfügen
				newString += String.valueOf(oldString.charAt(i));
			}
		}
		return newString;
	}

}
