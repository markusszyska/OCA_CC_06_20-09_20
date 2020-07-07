package demoStatics;

public class Demo06_Rekursion {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("Innerhalb der Schleife");
		}
		System.out.println("Nach der Schleife");
		System.out.println("---------------Rekursion----------------");
		rekursion(0);
		System.out.println("Nach der Rekursion");
	}
	
	public static void rekursion(int zahl) {
		System.out.println("Rekursion Nr: " + zahl);
		int tmp = zahl;
		if(zahl <= 10) {
			rekursion(++zahl);
		}
		System.out.println("Nach der Rekursion: " + tmp);
	}
	
	
}
