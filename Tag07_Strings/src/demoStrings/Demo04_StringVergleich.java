package demoStrings;

public class Demo04_StringVergleich {
	public static void main(String[] args) {
		String name1 = "Anna";
		String name2 = "anna";
		String name3 = name2;
		
		System.out.println("--------------");
		System.out.println("boolean equals()");
		System.out.println("--------------");
		System.out.println("name1.equals(name2)");
		System.out.println(name1.equals(name2));
		
		System.out.println("name1.equals(name3)");
		System.out.println(name1.equals(name3));
		
		System.out.println("name2.equals(name3)");
		System.out.println(name2.equals(name3));
		
		System.out.println("name1.equals(\"Anna\")");
		System.out.println(name1.equals("Anna"));
		
		System.out.println("--------------");
		System.out.println("boolean equalsIgnoreCase()");
		System.out.println("--------------");
		System.out.println("name1.equalsIgnoreCase(name2)");
		System.out.println(name1.equalsIgnoreCase(name2));
		
		
		String name4 = "Anna";
		String name5 = "Bertha";
		String name6 = "Christa";
		
		System.out.println("--------------");
		System.out.println("int compareTo()");
		System.out.println("--------------");
		System.out.println("name4.compareTo(name5)");
		System.out.println(name4.compareTo(name5));
		System.out.println("name5.compareTo(name4)");
		System.out.println(name5.compareTo(name4));
		System.out.println("name4.compareTo(name4)");
		System.out.println(name4.compareTo(name4));
		System.out.println("name4.compareTo(name6)");
		System.out.println(name4.compareTo(name6));
		
		String name7 = "Annabella";
		System.out.println("name4.compareTo(name7)");
		System.out.println(name4.compareTo(name7));
		
		String name8 = "Annadella";
		System.out.println("name7.compareTo(name8)");
		System.out.println(name7.compareTo(name8));
		
		System.out.println("name1.compareToIgnoreCase(name2)");
		System.out.println(name1.compareToIgnoreCase(name2));
	}
}
