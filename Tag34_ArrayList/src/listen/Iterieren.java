package listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Iterieren {
	public static void main(String[] args) {
		List<Integer> listNum = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		LinkedList<Person> listPers = new LinkedList<Person>();
		listPers.add(new Person("Peter", 20));
		listPers.add(new Person("Klaus", 30));
		listPers.add(new Person("Markus", 40));
		listPers.add(new Person("Christa", 25));
		listPers.add(new Person("Hans", 20));
		
		
		
		System.out.println("----------For-Schleife------");
		for (int i = 0; i < listNum.size(); i++) {
			Integer element = listNum.get(i);
			System.out.println(element);
		}
		
		System.out.println("----------Erweiterte For-Schleife------");
		for(Integer element : listNum) {
			System.out.println(element);
		}
		
		System.out.println("----------Mit Iterator------");
		Iterator<Integer> it = listNum.iterator();
		while(it.hasNext()) {
			Integer element = it.next();
			if(element.equals(20)) {
				it.remove();
			}
			System.out.println(element);
		}
		System.out.println(listNum);
		
		System.out.println("----------descendingIterator------");
		Iterator<Person> it2 = listPers.descendingIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//----------------NICHT OCA RELEVANT!!!---------------------
		System.out.println("--------------Consumer-----------------");
		it2 = listPers.iterator();
		
		/*
		 * Consumer ist ein Functional Interface aus der Java Bibliothek
		 * so wie Predicate. Seine Methode accept() nimmt einen Paramater
		 * entgegen, aber liefert nichts zurück
		 */
		Consumer<Person> cons = new Consumer<Person>() {
			@Override
			public void accept(Person t) {
								
			}			
		};
		
		cons = p ->{
			System.out.println(p.getName());
			if(p.getName().equals("Markus")) {
				System.out.println("---------Name geaendert---------");
				p.setName("geaenderter Name");
				System.out.println(p.getName());
			}
		};
		/*
		 * forEachRemaining nimmt einen Consumer entgegen
		 * und fuehrt auf jedem Element die accept() Methode aus
		 */
		it2.forEachRemaining(cons);
		
		listPers.iterator().forEachRemaining(p-> {
			System.out.println(p.getName());
			if(p.getName().equals("Christa")) {
				System.out.println("--------- Christas Name geaendert---------");
				p.setName("Christas geaenderter Name");
				System.out.println(p.getName());
			}
		});
		
		Arrays.asList(new Person("Person 1", 10), new Person("Person 2", 20))
		.iterator().forEachRemaining(System.out::println);
		
		Arrays.asList(new Person("Person 1", 10), new Person("Person 2", 20))
		.iterator().forEachRemaining(p->{
			System.out.println("Ich bin ein Lambda und mache was mit jeder verbleibenen Person");
		});
		
		Supplier<Person> supPers = () -> new Person("Supplier Person", 10);
		Person p = supPers.get();
		
	}
}
