package ml.brainin;

import java.util.Scanner;

public class PiratesSpeechGenerator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] chars = new String[]{"au","eu"};
		String[] piratesChars = new String[]{"aauurghs","eeuurghs"};
		System.out.println("Bitte geben Sie ein Text ein : ");
		String text = sc.nextLine();
		for (int i = 0; i< chars.length; i++) {
			text = text.replace(chars[i], piratesChars[i]);
		}
		System.out.println("Der neuen Text ist :\n "+text);
		sc.close();
		System.out.println("------------------------");
	}
}
