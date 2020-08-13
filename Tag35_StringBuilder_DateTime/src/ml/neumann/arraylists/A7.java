package ml.neumann.arraylists;

import java.util.ArrayList;
import java.util.Collections;

class A7 {
	public static void main(String[] args) {
		ArrayList <Integer> list= new ArrayList<>();
		//füllen der Liste mit zufallszahlen 
		for (int i=0; i<20; i++) {
			list.add((int)(Math.random() *50 + 1 ));
	 
	}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.indexOf(12));
	 

}
}
