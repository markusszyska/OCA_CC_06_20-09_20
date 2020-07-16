package ml.thurairajah;

import java.util.Scanner;

public class LottoTip_Aufg4 
{

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int count = 1;
		int zahl = 0;
		int versuche = 5;
		
		System.out.println("\n\tLottospiel\n");
		
		for (int i = 0; i < 6; i++) 
		{
			System.out.println(count + ". Zahl eingeben: ");
			
			int user = sc.nextInt();
			if (user > 0 && user < 50) 
			{
				count++;
//				int user = sc.nextInt();
				lotto[i] = user;
			
				System.out.println("Noch "+ versuche + " Versuch(e).");
				versuche--;
				zahl++;
				//System.out.println(count + ". Zahl eingeben: ");
			}
			else 
			{
				System.out.println("Zahlen zw. 1 und 49 eingeben"
						+ "\nBitte nochmal.");
				user = sc.nextInt();
				lotto[i] = user;
				System.out.println("Noch "+ versuche + " Versuch(e).\n");
				count++;
				versuche--;
				zahl++;
			}
//			System.out.println(lotto[i]);		
		}
		int temp;
		boolean sorted = false;
		while(!sorted) 
		{
			sorted = true;
		
			for (int i = 0; i < lotto.length-1; i++) 
			{
				if (lotto[i] > lotto[i+1]) 
				{
					temp = lotto[i];
					lotto[i] = lotto[i+1];
					lotto[i+1] = temp;
					sorted = false;
				}
			}
		}
		System.out.println("\nIhre Eingaben: ");
		for (int arr : lotto) 
		{	
			System.out.print( "[" + arr + "] ");
		}
 
	}
}
