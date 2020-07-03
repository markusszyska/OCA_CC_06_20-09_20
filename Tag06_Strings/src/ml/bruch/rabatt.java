package ml.bruch;

import java.util.Scanner;

public class rabatt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Stückzahl eingeben");

		int stuckzahl = sc.nextInt();
		
		System.out.println(stuckzahl);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Bitte Preis eingeben");

		float  preis = sc1.nextInt();
		
		System.out.println(preis);
		
		float rabat;
		float sumpreis = stuckzahl*preis;
		float gesamtpreis;
		if(stuckzahl >= 0 && stuckzahl <= 10 ) {
			
			rabat=preis/100*5;
			gesamtpreis = sumpreis- rabat; 
			System.out.println("Sie bekommen " + rabat +" rabat. Die Gesamtpreis ist " + gesamtpreis);
	}
	
		
		if(stuckzahl >= 11 && stuckzahl <= 51 ) {
			
			rabat=preis/100*10;
			gesamtpreis = sumpreis- rabat;
			System.out.println("Sie bekommen " + rabat +" rabat. Die Gesamtpreis ist " + gesamtpreis);
	}
	}

}
