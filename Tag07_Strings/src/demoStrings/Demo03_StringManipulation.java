package demoStrings;

public class Demo03_StringManipulation {
	public static void main(String[] args) {
		String text = "Initializes a newly created String object " + "so that it represents the same sequence of "
				+ "characters as the argument; in other words, "
				+ "the newly created string is a copy of the argument string.";

		// char charAt(int index)
		System.out.println("-----------------");
		System.out.println("char charAt(int index)");
		System.out.println("-----------------");
		char c = text.charAt(43);
		System.out.println(c);

		// String substring(int anfang, int ende(exklusive))
		System.out.println("-----------------");
		System.out.println("String substring(int anfang, int ende(exklusive)");
		System.out.println("-----------------");
		System.out.println(text.substring(171));
		System.out.println(text.substring(0, 3));

		// String replace(String alt, String neu)
		// String replace(char alt, char neu)
		System.out.println("-----------------");
		System.out.println("String replace(String alt, String neu)");
		System.out.println("String replace(char alt, char neu)");
		System.out.println("-----------------");
		String alt = "Allocates a new string that contains the sequence of "
				+ "characters currently contained in the string buffer argument.";
		System.out.println(alt.replace('a', '_'));
		System.out.println(alt);
		String neu = alt.replace('a', '_');
		System.out.println(neu);
		neu = alt.replace("string", "gnirts");
		System.out.println(neu);

		// String toUpperCase()
		System.out.println("-----------------");
		System.out.println("String toUpperCase()");
		System.out.println("-----------------");
		System.out.println(alt.toUpperCase());
		System.out.println(alt);
		neu = alt.toUpperCase();
		System.out.println(neu);

		// String toLowerCase()
		System.out.println("-----------------");
		System.out.println("String toLowerCase()");
		System.out.println("-----------------");
		System.out.println(alt.toLowerCase());
		System.out.println(alt);
		neu = alt.toLowerCase();
		System.out.println(neu);
		
		// String trim()
		System.out.println("-----------------");
		System.out.println("String trim()");
		System.out.println("-----------------");
		String untrimmed = "          Hallo Welt                ";
		untrimmed.trim();
		System.out.println(untrimmed);
		String trimmed = untrimmed.trim();
		System.out.println(trimmed);
	}
}
