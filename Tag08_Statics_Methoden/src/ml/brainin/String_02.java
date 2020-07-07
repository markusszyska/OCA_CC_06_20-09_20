package ml.brainin;

import java.util.Scanner;

public class String_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Bitte geben Sie ein Buchstabe ein : ");
			String text = sc.next();
			if (text.equals("Ende")) break;
			System.out.println("ASCII-Wert ist :\n "+(int)text.charAt(0));
		}
		sc.close();
		System.out.println("close .... done");
	}
}
