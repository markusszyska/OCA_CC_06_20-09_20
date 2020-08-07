package zeitner.bruchrechner;

import java.util.Scanner;

public class Bruchrechner {
	public static void main(String[] args){
		try {
			Scanner tastatur = new Scanner(System.in);
			System.out.println("Bitte geben einen Zaehler ein");
			int zaehler1 = tastatur.nextInt();
	
			System.out.println("Bitte geben Sie einen Nenner ein");
			int nenner1 = tastatur.nextInt();
	
			System.out.println("Bitte geben einen Zaehler ein");
			int zaehler2 = tastatur.nextInt();
			
			int nenner2;
			do {
				System.out.println("Bitte geben Sie einen Nenner ein");
				nenner2 = tastatur.nextInt();
			} while (nenner2 == 0);
			
			tastatur.close();
		
		
	
			Bruch bruch1 = new Bruch(zaehler1, nenner1);
			Bruch bruch2 = new Bruch(zaehler2, nenner2);
			
	
			//Testausgabe
	
			System.out.println(bruch1 + " * " + bruch2 + " = " + bruch1.multiplizieren(bruch2).maxKuerzen());
			System.out.println(bruch1 + " : " + bruch2 + " = " + bruch1.dividieren(bruch2).maxKuerzen());
			System.out.println(bruch1 + " + " + bruch2 + " = " + bruch1.addieren(bruch2).maxKuerzen());
			System.out.println(bruch1 + " - " + bruch2 + " = " + bruch1.subtrahieren(bruch2).maxKuerzen());
		} catch(Exception e) {
			System.out.println("irgendein Fehler ... ");
			e.printStackTrace();
		}
	}
}
