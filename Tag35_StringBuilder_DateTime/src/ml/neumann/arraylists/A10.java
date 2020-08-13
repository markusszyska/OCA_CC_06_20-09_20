package ml.neumann.arraylists;

import java.util.ArrayList;

public class A10 {
	public static void main(String[] args) {
		
		ArrayList <Integer> list= new ArrayList<>();
		//füllen der Liste mit zufallszahlen 
		for (int i=0; i<10; i++) {
			list.add((int)(Math.random() *50 + 1 ));
	 
	}
		System.out.println(list);
	 System.out.println("..................................");
	 for (int i=0; i<10; i++ ) {
		 if (list.get(i)%2!=0) {
			 list.set(i, 0);
		 }
	 }
	 System.out.println(list);
	}

}
