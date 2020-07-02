package ml.vi;

public class Square {

	public static void main(String[] args) {

		int number = 2;
		int square = 0;
		int counter = 0;
		
		//Addiere number-Mal number zu square
		while(counter < number) {			
			square += number;
			counter++;			
		}
		
		System.out.println("Das Quadrat von " + number + " ist:");
		System.out.print("- Berechnet durch " + number + "-maliges Addieren von ");
		System.out.println(+ number + " : "+ square);
	

		counter = 0;
		square = 0;
		int odd_number = 1;
		
		//Addiere number-Mal eine ungerade Zahl zu square
		//Erhöhre die ungerade Zahl um 2 nach einer Addition
		while (counter < number) {
			square += odd_number;
			odd_number += 2;
			counter++;
		}

		System.out.println("- Berechnet als Summe der ersten " + number + " ganzen Zahlen: " + square);
		
		square = number * number;

		System.out.print("- Berechnet mit Multiplikation: " + square);
		

	}

}
