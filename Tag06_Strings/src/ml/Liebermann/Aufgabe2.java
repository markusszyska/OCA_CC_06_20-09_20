package ml.Liebermann;

import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
	
		double preis = 0;
		int stk = 0;
		double erg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Preis in € eingeben");
		preis = sc.nextDouble();
		System.out.println("Bitte Stückzahl eingeben");
		stk = sc.nextInt();
		
		if(stk >= 10) {
			if(stk >= 50){
				erg = (stk * preis) - ((stk * preis) * 0.10);
				
			}else {
				erg = (stk * preis) - ((stk * preis) * 0.05);
			}
		}
		else
		{
			erg = stk * preis;
		}
		
		System.out.println("Der Preis beträgt " + erg + "€");
		
		
	}
}
