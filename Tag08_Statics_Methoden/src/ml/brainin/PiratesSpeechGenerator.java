package ml.brainin;

import java.util.Scanner;

public class PiratesSpeechGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] chars = new String[]{"a","e","i","o","u"};
		String[] piratesChars = new String[]{"arr","err","irr","orr","urr"};
		while (true) {
			System.out.println("Bitte geben Sie ein Text ein : ");
			String text = sc.next();
			if (text.equals("Ende")) break;
			for (int i = 0; i< chars.length; i++) {
				text = text.replace(chars[i], piratesChars[i]);
			}
			System.out.println("Der neuen Text ist :\n "+text);
		}
		sc.close();
		System.out.println("close .... done");
	}
}
