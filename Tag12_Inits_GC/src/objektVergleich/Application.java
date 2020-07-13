package objektVergleich;

public class Application {
	public static void main(String[] args) {
		String s1 = new String("Hallo");
		String s2 = new String("Hallo");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		Person p1 = new Person();
		p1.name = "Markus";
		Person p2 = new Person();
		p2.name = "Markus";
		
		System.out.println(p1 == p2);
		System.out.println("17" + p1.equals(p2));
	
		System.out.println(p1.name.equals(p2.name));
		
	}
}
