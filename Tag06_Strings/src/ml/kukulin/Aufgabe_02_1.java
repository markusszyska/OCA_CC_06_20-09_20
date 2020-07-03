package ml.kukulin;

import java.util.Scanner;

public class Aufgabe_02_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Stuckzahl  eingeben");
		int st = sc.nextInt();
		System.out.println("Bitte Einzelpreis  eingeben");
		float pr = sc.nextFloat();	
		
		float rabatt = 0 ;
		
		if(st > 10)
			rabatt = 5;
		else if (st > 50)
			rabatt = 10;
		
	float	sum = st * ( pr - (pr * (rabatt/100)));
		
		System.out.println("Stuck " + st + " Rabatt " + rabatt + " % " + "Gesamtpreis  " + sum);
	
	
	
	
		sc.close();	

}
}