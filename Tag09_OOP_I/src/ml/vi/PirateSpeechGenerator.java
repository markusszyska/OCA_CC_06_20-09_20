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

			// au/eu wurde zu arrurr/errurr
			// nur dadurch konnten die Zeichenfolgen arrurr/errurr im jetzigen input entstanden sein
			input = input.replace("arrurr", "aauurghs");
			input = input.replace("errurr", "eeuurghs");

			System.out.println(input);
			input = scanner.next();
		} while (!input.equals("Ende"));

		System.out.println("Ende des Programms");

		scanner.close();

	}

}
