package ml.brainin;

import java.util.Scanner;

public class String_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Bitte geben Sie ein Kennwort ein : ");
			String text = sc.next();
			if (text.equals("Ende")) break;
			if (text.length() < 10) {
				System.out.println("Das Kennwort muss mindestens 10 Zeichen beinhaltet ");
				continue;
			}
			if (!isAllRight(text)) {
				System.out.println("Das Kennwort muss mindestens mindestens einen Großbuchstaben und eine Ziffer beinhaltet ");
			}else {
				System.out.println("Das Kennwort ist Gut ");
			}
		}
		sc.close();
		System.out.println("close .... done");
	}
	private static boolean isAllRight(String text) {
		boolean hasUpperCharacter = false;
		boolean hasDigit = false;
		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++){
			if (Character.isUpperCase(chars[i])) {
				hasUpperCharacter = true;
			}else if (Character.isDigit(chars[i])) {
				hasDigit = true;
			}
		}
		return hasUpperCharacter && hasDigit;
	}
}
