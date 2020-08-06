package exceptions_regeln.demo02exceptions;

public class Demo04TryMultiCatchFinally {
	public static void main(String[] args) {
		String zeichenkette = "Hallo Welt";
		int[]zahlen = {1,2,3,4};
		int summe=0;
		
		try {
			for (int i = 0; i < 15; i++) {
				zeichenkette.charAt(i);
				summe += zahlen[i];
			}
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Array zu klein");
		}catch(StringIndexOutOfBoundsException sioobe) {
			System.out.println("String zu kurz");
		}finally {
			System.out.println("finally");
		}
		
		
	}
}
