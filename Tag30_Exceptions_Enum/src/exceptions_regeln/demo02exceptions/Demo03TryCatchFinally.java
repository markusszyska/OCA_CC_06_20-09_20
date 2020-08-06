package exceptions_regeln.demo02exceptions;

public class Demo03TryCatchFinally {
	public static void main(String[] args) {

		// Minimum
		try {

		} catch (Exception e) {

		} finally {

		}

		int[]zahlen = {1,2,3};
		int summe = 0;
		
		try {
			for (int i = 0; i <= zahlen.length; i++) {
				summe += zahlen[i];
				System.out.println("try");
			}
//			System.exit(0);
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Catch");
//			System.exit(0);
		}finally {
			System.out.println("Finally");
		
		}
		System.out.println("Summe: " + summe);
		System.out.println("Programm beendet");
		
	}
}
