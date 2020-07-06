package demoStrings;

public class Demo01bStringVergleiche {

	public static void main(String[] args) {

		/*
		 * Werden Strings mit der Literalschreibweise erstellt, kommen sie in den String
		 * Constant Pool. Wird ein weiterer String mit dem selben Literal erstellt, wird
		 * im String Constant Pool geschaut, ob der String schon enthalten ist.
		 * 
		 * Wenn ja, dann zeigen beide Variablen auf den selben String im Constant Pool.
		 * Darum ergibt der Vergleich mit == true
		 */
		String s1 = "Hallo";
		String s2 = "Hallo";
		String s3 = new String("Hallo");
		String s4 = new String("Hallo");

		if (s1 == s2) {
			System.out.println("s1 == s2 stimmt");
		} else {
			System.out.println("s1 == s2 stimmt nicht");
		}

		if (s1 == s4) {
			System.out.println("s1 == s4 stimmt");
		} else {
			System.out.println("s1 == s4 stimmt nicht");
		}

		if (s2 == s3) {
			System.out.println("s2 == s3 stimmt");
		} else {
			System.out.println("s2 == s3 stimmt nicht");
		}

		if (s4 == s3) {
			System.out.println("s4 == s3 stimmt");
		} else {
			System.out.println("s4 == s3 stimmt nicht");
		}
	}

}
