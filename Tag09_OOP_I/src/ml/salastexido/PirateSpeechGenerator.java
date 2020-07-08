package ml.salastexido;

import java.util.Scanner;

public class PirateSpeechGenerator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text ="";
		while(!(text=scanner.nextLine()).equals("Ende")) {
			String output=text.replace("a", "arr")
					.replace("e", "err")
					.replace("i", "irr")
					.replace("o", "orr")
					.replace("u", "urr")
					.replace("arrurr", "aauurghs")
					.replace("errurr", "eeuurghs");
			System.out.println(output);
		}
		scanner.close();
		System.exit(0);
	}
}
