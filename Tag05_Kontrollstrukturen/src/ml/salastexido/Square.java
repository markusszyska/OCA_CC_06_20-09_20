package ml.salastexido;

import java.util.Scanner;

public class Square {
	
	//Berechne das Quadrat von number duch number-maliges Addieren von number
	public static int quadratNumberMaliges(int n) {
		int counter = 1;
		int square=0;
		while(counter<=n) {
			square +=n;
			counter++;
		}
		return square;
	}
	
	//Berechne das Quadrat von n identish ist mit der Summe der ersten n positiven ungeraden 
	//Zahlen
	public static int quadratNumberUngeradenZahlen(int n) {
		int counter = 1;
		int square=0;
		while(counter<=n*2) {
			if(counter % 2 != 0) {
				square+=counter;
			}
			counter++;
		}
		return square;
		
	}
	
	
	public static int quadratNumberMultiplikation(int n) {
		return n*n;
	}
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int n =  scanner.nextInt();
		System.out.println("Das Quadrat von " + n + " ist:\n");
		System.out.println("- Berechnet durch " + n + "-maliges Addieren von " + n + ": " + quadratNumberMaliges(n));
		System.out.println("- Berechnet als Summe der ersten " + n + " ganzen Zahlen: " + quadratNumberUngeradenZahlen(n));
		System.out.println("- Berechnet mit Multiplikation: " + quadratNumberMultiplikation(n));
		scanner.close();
		
		
		
	}
	
	
	

}
