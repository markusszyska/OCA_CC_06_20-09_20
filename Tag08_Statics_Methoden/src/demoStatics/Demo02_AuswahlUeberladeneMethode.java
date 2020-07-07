package demoStatics;

public class Demo02_AuswahlUeberladeneMethode {
	public static void main(String[] args) {
		/*
		 * Es wird die Methode ausgewaehlt bei der 
		 * der Datentyp am genauesten passt.
		 * z.B. Im Falle von byte wird die int Methode genommen
		 */		
		byte b = 5;
		doStuff(b);
		
	}
	
	public static void doStuff(long zahl) {
		System.out.println("long Methode");
	}	
	public static void doStuff(double zahl) {
		System.out.println("double Methode");
	}
	public static void doStuff(int zahl) {
		System.out.println("int Methode");
	}
	
}
