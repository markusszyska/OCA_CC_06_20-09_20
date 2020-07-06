package demoStrings;

public class Demo01_Strings {
	public static void main(String[] args) {

		//Literal
		String gruss = "Hallo Welt";
		System.out.println(gruss);
		
		//Plus Operator
		String gruss2 = "Hallo Programmierer";
		gruss2 += " , ";
		String ausgabe = gruss2 + "guten Morgen";
		System.out.println(ausgabe);
		
		//Konstruktoren
		String leer = new String();
		String leer2 = "";
		System.out.println(leer);
		System.out.println(leer2);
		System.out.println(leer.hashCode());
		System.out.println(leer2.hashCode());
		
		String kopie = new String("Original");
		String kopie2 = new String(ausgabe);
		System.out.println(kopie);
		
		char[] cArray = {'J', 'a', 'v', 'a'};
		String ausChars = new String(cArray);
		System.out.println(ausChars);
		
		String name = "Markus";
		char c = name.charAt(3);
		System.out.println(c);
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println("An Stelle: " + i + " der Variablen name steht das Zeichen : "+ name.charAt(i));
		}
		String neu = "";
		for (int i = 0; i < name.length(); i++) {
			neu += name.charAt(i);
		}
		System.out.println(neu);
		
		
	}
}
