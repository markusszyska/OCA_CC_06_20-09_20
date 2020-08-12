package listen;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
	public static void main(String[] args) {
		/*
		 * Seit Java 8
		 * removeIf() nimmt ein Predicate entgegen und entfernt
		 * alle Elemente, bei denen die methode test() zu 
		 * true ausgewertet wird
		 */
		List<Person> listPers = new ArrayList<>();
		listPers.add(new Person("Peter", 20));
		listPers.add(new Person("Klaus", 30));
		listPers.add(new Person("Markus", 40));
		listPers.add(new Person("Christa", 25));
		listPers.add(new Person("Hans", 20));
		
		System.out.println(listPers);
		listPers.removeIf(p -> p.getName().equals("Markus"));
		System.out.println("------------------");
		System.out.println(listPers);
		
	}
}
