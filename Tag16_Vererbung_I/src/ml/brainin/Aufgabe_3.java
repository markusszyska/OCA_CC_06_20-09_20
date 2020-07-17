package ml.brainin;
import java.util.*;
public class Aufgabe_3 {
	static int arrayLenght = 6;
	static int[] lottoZahlen = new int[arrayLenght];
	static Random random = new Random();
	public static void main(String[] args) {
		System.out.println("Wie viele Ziehungen durchgefuehrt werden sollen ? ");
		fuellungZahlenArray(lottoZahlen);
		sort(lottoZahlen);
		boolean down = false;
		int zyklus = 1;
		int maxIndentischer = 0;
		while(!down) {
			int[] zahlen = new int[arrayLenght]; 
			fuellungZahlenArray(zahlen);
			sort(zahlen);
			print(zahlen);
			int identischer = gleichen(zahlen); 
			down = identischer == arrayLenght - 1;
			System.out.println("Identischer : "+ identischer+" zyklus : "+zyklus);
			System.out.println("----------------------------------");
			zyklus++;
			maxIndentischer = Math.max(maxIndentischer, identischer);
			if (zyklus > 100000000) {
				down = true;
			}
		}
		System.out.println("Lottozahlen : ");
		print(lottoZahlen);
		System.out.println("----------------------------------");
		System.out.println("maxIndentischer "+maxIndentischer+" Bye.");
	}
	
	static void print(int[] zahlen) {
		for  (int i = 0; i < zahlen.length ; i++) {
			System.out.print(zahlen[i]+" ");
		}
		System.out.println();
	}
	static int gleichen(int[] zahlen) {
		int count = 0;
		for (int i = 0; i < zahlen.length; i++) {
			for (int j = 0; j < lottoZahlen.length; j++) {
				if (lottoZahlen[j] == zahlen[i]) count++;
			}
		}
		return count;
	}
	static void fuellungZahlenArray(int[] zahlen) {
		int count = 0;
		while(count < zahlen.length) {
			int zahl = getZahl(zahlen);
			if (zahl != -1) {
				zahlen[count] = zahl;
				count++;
			}
		}
	}
	static int getZahl(int[] zahlen) {
		int zahl = random.nextInt(50);
		for  (int i = 0; i < zahlen.length ; i++) {
			if (zahlen[i] == zahl) {
				return -1;
			}
		}
		return zahl;
	}
	static void sort(int[] zahlen) {
        for (int i = 0; i < zahlen.length-1; i++) {
            for (int j = 0; j < zahlen.length-i-1; j++) {
                if (zahlen[j] > zahlen[j+1]) { 
                    int temp = zahlen[j]; 
                    zahlen[j] = zahlen[j+1]; 
                    zahlen[j+1] = temp; 
                } 
            }
        }

	}
}
