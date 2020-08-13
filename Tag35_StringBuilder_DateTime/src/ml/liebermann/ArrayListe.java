package ml.liebermann;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ArrayListe {

	public static void main(String[] args) {
		System.out.println("----------------------------A1--------------------------------------");
//		###### A1.
//		Erzeugen Sie eine `ArrayList` mit 20 zufälligen Integer aus dem Bereich [1 ... 100]. 
//		Geben Sie die Elemente der Liste durchnummeriert untereinander aus.
		ArrayList<Integer> A1 = getArrayList(20, 100);
		A1.sort((i, y) -> i.compareTo(y));
		System.out.println(A1);

		System.out.println("----------------------------A2--------------------------------------");
		ArrayList<String> A2 = new ArrayList<>(Arrays.asList("mo", "di", "mi", "do", "fr"));
		A2.forEach( i -> System.out.println(i));
		A2.forEach(System.out::println);
		
		System.out.println("----------------------------A3--------------------------------------");
		ArrayList<String> A3 = new ArrayList<>(Arrays.asList(A2.toArray(new String[0]).clone()));
		Iterator<String> i3 = A3.iterator();

		while (i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		
		System.out.println("----------------------------A4--------------------------------------");
		ArrayList<Integer> A4 = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80));
		A4.iterator().forEachRemaining((i)-> {
			if(i %20 == 0) {
			System.out.println(i);
			}});
		
		
		System.out.println("----------------------------A5--------------------------------------");
		LinkedList<Integer> A5 = new LinkedList<>(Arrays.asList(A4.toArray(new Integer[0]).clone()));
		A5.descendingIterator().forEachRemaining((i)-> System.out.println(i));
		
		
		System.out.println("----------------------------A6--------------------------------------");
		ArrayList<Integer> A6 = getArrayList(20, 100);
		A6.sort((i, y) -> i.compareTo(y));
		System.out.println(A6);
		
		
		System.out.println("----------------------------A7--------------------------------------");
		ArrayList<Integer> A7 = getArrayList(10, 50);
		System.out.println(A7.indexOf(12));
		
		
		System.out.println("----------------------------A8--------------------------------------");
		ArrayList<Integer> A8 = getArrayList(10, 50);
		Iterator<Integer> i8 = A8.iterator();
		while(i8.hasNext()) {
			Integer next =  i8.next();
			if (next % 2 != 0) {
				i8.remove();
			}
		}
		
//		while(A8.iterator().hasNext()) {
//			int next = A8.iterator().next();
//			if (next % 2 != 0) {
//				A8.remove(A8.indexOf(next));
//			}
//		}
		
		
		
		System.out.println("A8 : " + A8);
		
		System.out.println("----------------------------A9--------------------------------------");
		ArrayList<Integer> A9 = getArrayList(10, 50);
		A9.removeIf((i)-> i%2 != 0);
		System.out.println(A9);
		
		System.out.println("----------------------------A10--------------------------------------");
		ArrayList<Integer> A10 = getArrayList(10, 50);
		Predicate<Integer> p = i -> i %2 != 0;
		for (int j = 0; j < A10.size(); j++) {
			if(p.test(A10.get(j))) {
				A10.set(j, 0);
			}
		}
		System.out.println(A10);
		
		System.out.println("----------------------------A11--------------------------------------");
		ArrayList<Integer> A11 = getArrayList(10, 50);
		Integer[] A11Array = A11.toArray(new Integer[0]);
		System.out.println(A11);
		
		
	}

	public static ArrayList<Integer> getArrayList(int size, int range) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < size;) {
			int rnd = getRandom(range);
			if (!result.contains(rnd)) {
				result.add(rnd);
				i++;
			}
		}

		return result;
	}

	public static int getRandom(int Range) {
		return (int) (Math.random() * Range + 1);
	}
}
