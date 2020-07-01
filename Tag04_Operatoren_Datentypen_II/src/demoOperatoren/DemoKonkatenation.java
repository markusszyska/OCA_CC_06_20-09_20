package demoOperatoren;

public class DemoKonkatenation {

	public static void main(String[] args) {
		//Ueberladener Plus Operator
		/*
		 * Wenn in einem Ausdruck ein String enthalten ist,
		 * werden alle Operanden hinter dem String als String behandelt.
		 */
		System.out.println("Hallo" + " " + "Welt");
		System.out.println("4 + 5 ergibt " + 4 + 5);
		
		System.out.println("4 + 5 ergibt " + (4 + 5));
		System.out.println(4 + 5 + " ab hier werden Strings aneinandergehangen " + 4 + 5);
		
		String s1 = " Hallo";
		String s2 = " ";
		String s3 = "Welt ";
		String s4 = s1 + s2 + s3;
		System.out.println(4 + 5 + s4 + 4 + 5);
		
		
	}
}
