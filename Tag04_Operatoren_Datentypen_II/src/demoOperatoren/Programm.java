package demoOperatoren;

public class Programm {
	public static void main(String[] args) {
		int zahl = 8;
		int erg = zahl++ + ++zahl;
		//		   8 (8+1) + (9+1) 10
		//			8 + 10
		System.out.println(zahl);
		System.out.println(erg);
	}
}
