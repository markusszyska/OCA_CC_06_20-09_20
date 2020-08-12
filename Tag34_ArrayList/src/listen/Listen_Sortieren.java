package listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listen_Sortieren {
	/*
	 * Lambda als Attribut, damit er wiederverwendbar ist
	 */
	final static Comparator<Person> sortName = (p1, p2) -> p2.getName().compareTo(p1.getName());
	
	public static void main(String[] args) {
		//-------------Arrays.sort()--------------
		Integer[] arr = {12, -7, 22, -5, 3};
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = Arrays.asList(12, -7, 22, -5, 3);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("-------------------------------");
		List<Person> listPers = new ArrayList<>();
		listPers.add(new Person("Peter", 20));
		listPers.add(new Person("Klaus", 30));
		listPers.add(new Person("Markus", 40));
		listPers.add(new Person("Christa", 25));
		listPers.add(new Person("Hans", 20));
		
		System.out.println("---------------Durch Comparable----------------");
		System.out.println(listPers);
		Collections.sort(listPers);
		System.out.println(listPers);
		System.out.println("---------------Durch Comparator----------------");
		//Durch Comparator sortiert
		PersonenComparator pc = new PersonenComparator();
		Collections.sort(listPers, pc);
		//Mit Lambda sortiert
		Collections.sort(listPers, (p1, p2) -> p2.getName().compareTo(p1.getName()));
		System.out.println(listPers);
		
		Collections.sort(listPers, sortName);
		//Comparator als Methodenreferenz
		Collections.sort(listPers, Listen_Sortieren::sortNameMethod);
		
		
		
		
	}
	public static int sortNameMethod(Person p1, Person p2) {
		return p2.getName().compareTo(p1.getName());
	}
}
