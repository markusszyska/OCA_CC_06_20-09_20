package ml;

import java.util.Scanner;

public class PirateSpeechGenerator2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputText = "";
		System.out.println("Dieses Programm generiert Pirate Speech");

		System.out.println("Der Pirate Speech Generator wird wiederholt bis Sie \"Ende\" eingeben");

		do {
			System.out.println("Bitte geben Sie einen Text ein");
			inputText = sc.nextLine();
			String newText = "";

			if (!inputText.equals("Ende")) {
				for (int i = 0; i < inputText.length(); i++) {

					switch (inputText.charAt(i)) {
					case 'a':
						if ((i + 1) < inputText.length() && inputText.charAt(i + 1) == 'u') {
							newText += "aauurrgh";
							i++;
						} else {
							newText += "arr";
						}
						break;
					case 'e':
						if ((i + 1) < inputText.length() && inputText.charAt(i + 1) == 'u') {
							newText += "eeuurrgh";
							i++;
						} else {
							newText += "err";
						}
						break;
					case 'i':
						newText += "irr";
						break;
					case 'o':
						newText += "orr";
						break;
					case 'u':
						newText += "urr";
						break;

					default:
						newText += inputText.charAt(i);
						break;
					}
					System.out.println(newText);

				}
				System.out.println("\nIhr Text in Pirate Speech:");
				System.out.println(newText + "\n");
			}

			

		} while (!inputText.equals("Ende"));
	}
}
