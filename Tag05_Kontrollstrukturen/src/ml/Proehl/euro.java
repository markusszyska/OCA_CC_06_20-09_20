package ml.Proehl;
import java.util.Scanner;
public class  euro 
	{
		public static void main(String[] args) 	
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Bitte Centbetrag eingeben");
			int zahl = sc.nextInt();
			System.out.println("Sie haben: " + zahl/100 + " Euro und " + zahl%100 + " Cent");
		
		}
	}