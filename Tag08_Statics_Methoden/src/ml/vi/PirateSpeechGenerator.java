package ml.vi;

import java.util.Scanner;

public class PirateSpeechGenerator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.next();

		do {
			input = input.replace("a", "arr");
			input = input.replace("e", "err");
			input = input.replace("i", "irr");
			input = input.replace("o", "orr");
			input = input.replace("u", "urr");
			System.out.println(input);
			input = scanner.next();
		} while (!input.equals("Ende"));

		System.out.println("Ende");

		scanner.close();

	}

}
