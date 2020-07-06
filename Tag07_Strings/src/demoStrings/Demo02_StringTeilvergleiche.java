package demoStrings;

public class Demo02_StringTeilvergleiche {
	public static void main(String[] args) {
		String text = "Initializes a newly created String object " + "so that it represents the same sequence of "
				+ "characters as the argument; in other words, "
				+ "the newly created string is a copy of the argument string.";
		// boolean contains(String s)
		System.out.println("-----------------------");
		System.out.println("boolean contains(String s)");
		System.out.println("-----------------------");
		System.out.println(text.contains("newly"));

		// boolean startsWith(String s)
		System.out.println("-----------------------");
		System.out.println("boolean startsWith(String s)");
		System.out.println("-----------------------");
		System.out.println(text.startsWith("Ini"));

		// boolean endsWith(String s)
		System.out.println("-----------------------");
		System.out.println("boolean endsWith(String s)");
		System.out.println("-----------------------");
		System.out.println(text.endsWith("ring."));
		
		// int indexOf(char c) & int indexOf(String s)
		System.out.println("-----------------------");
		System.out.println("int indexOf(char c)");
		System.out.println("-----------------------");
		System.out.println(text.indexOf('t'));
		System.out.println("-----------------------");
		System.out.println("int indexOf(String s)");
		System.out.println("-----------------------");
		System.out.println(text.indexOf("newly"));
		
		System.out.println("-----------------------");
		System.out.println("int indexOf(char c, int fromIndex)");
		System.out.println("-----------------------");
		System.out.println(text.indexOf('t', 5));
		
		// int lastIndexOf(char c) & int lastIndexOf(String s)
		System.out.println("-----------------------");
		System.out.println("int lastIndexOf(char c)");
		System.out.println("-----------------------");
		System.out.println(text.lastIndexOf('t'));
		System.out.println("-----------------------");
		System.out.println("int lastIndexOf(String s)");
		System.out.println("-----------------------");
		System.out.println(text.lastIndexOf("ar"));
		
		
		
	}
}
