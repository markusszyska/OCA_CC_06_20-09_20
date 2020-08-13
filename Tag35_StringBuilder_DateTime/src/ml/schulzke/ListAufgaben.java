package ml.schulzke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ListAufgaben {
	public static void main(String[] args) {
		Aufgabe1();
		Aufgabe2();
		Aufgabe3();
		Aufgabe4();
		Aufgabe5();
		Aufgabe6();
		Aufgabe7();
		Aufgabe7();
		Aufgabe7();
		Aufgabe7();
		Aufgabe8();
		Aufgabe9();
		Aufgabe10();
		Aufgabe11();
	}
	
	public static void Aufgabe1() {
		System.out.println("\n ---------- Aufgabe1 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=0;i<20;i++) {
			liste.add(RndInt(1,100));
		}
		
		for(int i=0;i<20;i++) {
			System.out.println("Eintrag"+i+": "+liste.get(i));
		}
	}
	
	public static void Aufgabe2() {
		System.out.println("\n ---------- Aufgabe2 ----------\n");
		ArrayList<String> liste = new ArrayList<String>(Arrays.asList("mo", "di", "mi", "do", "fr"));
		
		for (String string : liste) {
			System.out.println(string);
		}
		
	}
	
	public static void Aufgabe3() {
		System.out.println("\n ---------- Aufgabe3 ----------\n");
		ArrayList<String> liste = new ArrayList<String>(Arrays.asList("mo", "di", "mi", "do", "fr"));
		
		int i = 0;
		while(i<liste.size()) {
			System.out.println(liste.get(i));
			i++;
		}
		
	}
	
	public static void Aufgabe4() {
		System.out.println("\n ---------- Aufgabe4 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=1;i<9;i++) {
			liste.add(i*10);
		}
		
		for(int i=0;i<8;i=i+2) {
			System.out.println("Eintrag"+i+": "+liste.get(i));
		}
	}
	
	public static void Aufgabe5() {
		System.out.println("\n ---------- Aufgabe5 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=1;i<9;i++) {
			liste.add(i*10);
		}
		
		for(int i=liste.size()-1;i>=0;i--) {
			System.out.println("Eintrag"+i+": "+liste.get(i));
		}
	}
	
	public static void Aufgabe6() {
		System.out.println("\n ---------- Aufgabe6 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=0;i<20;i++) {
			liste.add(RndInt(0,100));
		}
		
		Collections.sort(liste);
		
		for(int i=0;i<20;i++) {
			System.out.println("Eintrag"+i+": "+liste.get(i));
		}
	}
	
	public static void Aufgabe7() {
		System.out.println("\n ---------- Aufgabe7 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			liste.add(RndInt(0,50));
		}
		
		if(liste.indexOf(12)!=-1) {
			System.out.println("12 gefunden an Stelle: "+liste.indexOf(12));
		}else {
			System.out.println("Keine 12 gefunden bei dieser Ziehung!");
		}
		
	}
	
	public static void Aufgabe8() {
		System.out.println("\n ---------- Aufgabe8 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			liste.add(RndInt(0,50));
		}
		
		for(int i=0;i<liste.size();i++) {
			if(liste.get(i) % 2 != 0) {
				liste.remove(i);
				i--;
			}
		}
		
		for(int i=0;i<liste.size();i++) {
			System.out.println("Eintrag"+i+": "+liste.get(i));
		}
	}
	
	public static void Aufgabe9() {
		System.out.println("\n ---------- Aufgabe9 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			liste.add(RndInt(0,50));
		}
		
		liste.removeIf(n -> (n % 2 != 0)); 
		
		for(int i=0;i<liste.size();i++) {
			System.out.println("Eintrag"+i+": "+liste.get(i));
		}
	}
	
	public static void Aufgabe10() {
		System.out.println("\n ---------- Aufgabe10 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			liste.add(RndInt(0,50));
		}
		
		for(int i=0;i<liste.size();i++) {
			if(liste.get(i) % 2 != 0) {
				liste.set(i, 0);
			}
		}
		
		for(int i=0;i<liste.size();i++) {
			System.out.println("Eintrag"+i+": "+liste.get(i));
		}
	}       
	
	public static void Aufgabe11() {
		System.out.println("\n ---------- Aufgabe11 ----------\n");
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			liste.add(RndInt(0,50));
		}
		
		int[] number = liste.stream().mapToInt(i -> i).toArray();
		
		for(int i=0;i<number.length;i++) {
			System.out.println("Eintrag"+i+": "+number[i]);
		}
	} 
  
	
	
	
	public static int RndInt(int min, int max) {
		Random random = new Random();

		return random.nextInt(max + 1 - min) + min;
		
	};
}
