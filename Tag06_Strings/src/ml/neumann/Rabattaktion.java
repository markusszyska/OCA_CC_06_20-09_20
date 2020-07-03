package ml.neumann;

import java.util.Scanner;

public class Rabattaktion {
public static void main(String[] args) 
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Bitte geben Sie die Stückzahl ein");
	int stueck = sc.nextInt();
	Scanner pr = new Scanner(System.in);
	System.out.println("Bitte geben Sie den Preis ein");
	int preis = pr.nextInt();

 int gp = preis * stueck;
 //System.out.println("Preis ohne Rabatt:" + gp);
 
 if ((stueck >= 10) && (stueck <50)){
 System.out.println("Preis mit 5% Rabatt:" + (gp - (gp*0.05)));
 
 }
 else if(stueck >= 50 ){
 System.out.println("Preis mit 10% Rabatt:" + (gp - (gp*0.1)));
 }
  
 else { System.out.println("kein Rabatt");
// }
	 
	

}}}

