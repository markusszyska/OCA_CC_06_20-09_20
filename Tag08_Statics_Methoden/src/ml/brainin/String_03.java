package ml.brainin;

import java.util.Scanner;

public class String_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Bitte geben Sie ein Kennwort ein : ");
			String text = sc.next();
			if (text.equals("Ende")) break;
			System.out.println("ASCII-Text sind : ");
			for (int i = 0; i < text.length(); i++) {
				System.out.print((int)text.charAt(i)+" ");
			}
			System.out.println("\n");
		}
		sc.close();
		System.out.println("close .... done");
	}
}
