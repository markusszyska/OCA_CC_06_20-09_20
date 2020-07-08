package ml.vi;

public class ReverseString {

	public static void main(String[] args) {

		String s0 = "Aufgabe String umdrehen";

		String s1 = "Schreiben Sie eine Methode, die einen String entgegen nimmt und die Buchstaben in umgekehrter Reihenfolge zurueckgibt.";
		String s2 = "Probieren Sie Ihre Methode aus, indem Sie sie aufrufen und ihr verschiedene Strings uebergeben.";

		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------------------------------");
		System.out.println(reverseString(s0));
		System.out.println(reverseString(s1));
		System.out.println(reverseString(s2));

	}

	public static String reverseString(String input) {

		String ret = "";

		for (int i = 0; i < input.length(); i++)
			ret += input.charAt(input.length() - i - 1);

		return ret;

	}

}
