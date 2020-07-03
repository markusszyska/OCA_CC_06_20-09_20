package ml.brainin;

public class BoolenVaules {
	public static void main(String[] args) {
		boolean bool1 = false;
		boolean bool2 = false;
		for (int i = 0; i< 2; i++) {
			do {
				System.out.println(bool1 + " && " +bool2+" liefert "+(bool1 && bool2));
				System.out.println(bool1 + " || " +bool2+" liefert "+(bool1 || bool2));
				System.out.println(bool1 + " ^  " +bool2+" liefert "+(bool1 ^ bool2));
				bool2  = !bool2;
			}while (bool2);
			bool1 = !bool1;
		}
	}
}
