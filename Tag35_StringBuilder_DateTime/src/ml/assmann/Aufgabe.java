package ml.assmann;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Aufgabe {
	public static void main(String[] args) {

		/*
		 * Aufgabe 1
		 */
		System.out.println("\nAufgabe 1");
		ArrayList<Integer> listA1 = new ArrayList<Integer>();
		for(int i=0;i<20;i++) {
			listA1.add((int)(Math.random()*100) + 1);
		}
		
		// Ausgabe mit for-Schleife
		System.out.println("\nAusgabe mit for-Schleife");
		for(int i = 0;i<listA1.size();i++) {
			System.out.println((i+1) + ": " + listA1.get(i));
		}
		
		// Ausgabe mit Iterator
		System.out.println("\nAusgabe mit Iterator");
		Iterator<Integer> itA1 = listA1.iterator();
		int a1 = 1;
		while(itA1.hasNext()) {
			System.out.println(a1 + ": " + itA1.next());
			a1++;
		}
		
		/*
		 * Aufgabe 2
		 */
		System.out.println("\nAufgabe 2");
		ArrayList<String> listA2 = new ArrayList<String>(Arrays.asList("mo", "di", "mi", "do", "fr"));
		for(String s : listA2) {
			System.out.println(s);
		}
		
		/*
		 * Aufgabe 3
		 */
		System.out.println("\nAufgabe 3");
		Iterator<String> itA3 = listA2.iterator();
		while(itA3.hasNext()) {
			System.out.println(itA3.next());
		}
		
		/*
		 * Aufgabe 4
		 */
		System.out.println("\nAufgabe 4");
		ArrayList<Integer> listA4 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60,70,80));
		for(int i = 0;i<listA4.size();i+=2) {
			System.out.println(listA4.get(i));
		}
		
		/*
		 * Aufgabe 5
		 */
		System.out.println("\nAufgabe 5");
		for(int i = listA4.size()-1;i>=0;i--) {
			System.out.println(listA4.get(i));
		}
		
		/*
		 * Aufgabe 6
		 */
		System.out.println("\nAufgabe 6");
		ArrayList<Integer> listA6 = new ArrayList<Integer>();
		for(int i=0;i<20;i++) {
			listA6.add((int)(Math.random()*101));
		}
		
		Collections.sort(listA6);
		System.out.println(listA6);
		
		/*
		 * Aufgabe 7
		 */
		System.out.println("\nAufgabe 7");
		ArrayList<Integer> listA7 = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			listA7.add((int)(Math.random()*51));
		}
		System.out.println(listA7);
		System.out.println("Index of 12: " + listA7.indexOf(12));
		
		/*
		 * Aufgabe 8
		 */
		System.out.println("\nAufgabe 8");
		ArrayList<Integer> listA8 = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			listA8.add((int)(Math.random()*51));
		}
		System.out.println("Vorher: " + listA8);
		for(int i=0;i<listA8.size();i++) {
			if(listA8.get(i) % 2 != 0) {
				listA8.remove(i--);
			}
		}
		System.out.println("Nachher: " + listA8);
		
		/*
		 * Aufgabe 9
		 */
		System.out.println("\nAufgabe 9");
		ArrayList<Integer> listA9 = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			listA9.add((int)(Math.random()*51));
		}
		System.out.println("Vorher: " + listA9);
		listA9.removeIf(x -> x%2 != 0);
		System.out.println("Nachher: " + listA9);
		
		/*
		 * Aufgabe 10
		 */
		System.out.println("\nAufgabe 10");
		ArrayList<Integer> listA10 = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			listA10.add((int)(Math.random()*51));
		}
		
		System.out.println("Vorher: " + listA10);
		for(int i=0;i<listA10.size();i++) {
			if(listA10.get(i)%2 != 0) {
				listA10.set(i,0);
			}
		}
		System.out.println("Nachher: " + listA10);
		
		/*
		 * Aufgabe 11
		 */
		System.out.println("\nAufgabe 11");
		Integer[] intArray = listA10.toArray(new Integer[0]);
		System.out.println("Liste: " + listA10);
		System.out.println("Array: " + Arrays.toString(intArray));
		
	}

	
}
