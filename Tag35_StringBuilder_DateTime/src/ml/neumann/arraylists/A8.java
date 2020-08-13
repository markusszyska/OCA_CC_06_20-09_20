package ml.neumann.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class A8 {
	public static void main(String[] args) {
		ArrayList <Integer> list= new ArrayList<>();
		//füllen der Liste mit zufallszahlen 
		for (int i=0; i<20; i++) {
			list.add((int)(Math.random() *50 + 1 ));
	 
	}
		System.out.println(list);
	 System.out.println("..................................");
		
			list.removeAll(Arrays.asList(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49));
		System.out.println(list);
		}
		
	}


