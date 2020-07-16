package demoArray;

public class DemoMain {
	public static void main(String[] args) {
		/*
		 * Wird das Programm ohne Argumente gestartet
		 * hat args eine Laenge von 0
		 * args ist niemals null
		 */
		System.out.println(args.length);
		for (String s : args) {
			System.out.println(s);
		}
		
		System.out.println(args[3].length());
	}
}
