/*
-----------------------------------Aufgabe 2-----------------------------------

Erweitern Sie den Lottozahlengenerator, dass fuer ein Jahr woechentlich
eine Ziehung gemacht wird. Verwenden Sie dafuer ein zweidimensionales Array.

int[52][6]

Lassen Sie die Zahlen ausgeben. Bsp.

"Die Zahlen fuer Woche 1 sind : 1 2 3 4 5 6 ".

*/

package ml.Boettger.task_2_Lotto;

import java.util.Scanner;

public class LottoMain2
{
	//########################################################################
	//
	//	Here you can switch on/off the testmode
	//
	final public static boolean TESTMODE = false;	// testmode true/false
	//
	//########################################################################
	
	final public static int MAX_DRAWED = 49;		// max. no. drawed
	
	public static Scanner sc = new Scanner(System.in); 
	// for pausing console output, see function pause

	//########################################################################
	public static void pause()
	//########################################################################
	{
		System.out.println();
	    System.out.println("\tEnter a digit to continue...");
	    LottoMain2.sc.nextInt();	    
	}
	
	//########################################################################
	public static boolean isTESTMODE() 
	//########################################################################
	{
		return TESTMODE;
	}

	//########################################################################
	private static int getMAX_DRAWED() 
	//########################################################################
	{
		return MAX_DRAWED;
	}
	
	//########################################################################
	private static int lottery_draw()
	//
	//	A lottery number is drawn between 1 and 49
	//
	//########################################################################
	{
		return(int)(Math.random() * LottoMain2.getMAX_DRAWED() + 1);
	}

	//########################################################################
	private static void print_lottery_numbers(int[] lottery_numbers, 
			boolean short_mode)
	//
	//	Displays the lottery numbers
	//
	//########################################################################
	{
		if (short_mode)
		{
			System.out.print("\t");
			for (int i : lottery_numbers)
			{
				System.out.print(i + " ");	
			}
			System.out.println();			
		}
		else
		{	
			System.out.println();
			System.out.println(
				"\tThe following 6 lottery numbers were chosen:");
			System.out.println(
				"\t---------------------------------------------------------");
			System.out.print("\t");
			for (int i : lottery_numbers)
			{
				System.out.print(i + " ");	
			}
			System.out.println();			
		}	
	}
	
	//#########################################################################
	private static boolean new_number_drawed(int[] lottery_numbers, int number)
	//
	//	Inserts a new lottery number in the array of lottery numbers and
	//	returns true.
	//
	//	If the number is already existing false will be returned
	//
	//#########################################################################
	{
		int i = 0;
				
		while (lottery_numbers[i] > 0)
		{
			if (lottery_numbers[i] == number)			
			{
				return false;			// number already drawed
			}
			i++;
		}
		lottery_numbers[i] = number;
		
		if (LottoMain2.isTESTMODE())
		{
			print_lottery_numbers(lottery_numbers, false);
			LottoMain2.pause();
		}
		
		return true;					// new number drawed
	}
	
	//#########################################################################
	private static void draw_the_lottery_numbers(int[] lottery_numbers)
	//#########################################################################
	{
		int number = 0;
		int try_number = 1;
			
		for (int i = 0; i < 6; i++)			
		{
			do
			{	
				number = LottoMain2.lottery_draw();
				if (LottoMain2.isTESTMODE())
				{
					System.out.println(
						"\tTry number " + try_number++ + " with " + number);	
					LottoMain2.pause();
				}	
			} 
			while (!LottoMain2.new_number_drawed(lottery_numbers, number));			
		}		
	}		

	//#########################################################################
	public static void main(String[] args)
	//#########################################################################
	{
		int[][] weekly_lottery_numbers_per_year = new int[52][6];  
		
		System.out.println();
		for (int i = 0; i < 52; i++)
		{
			LottoMain2.draw_the_lottery_numbers(
				weekly_lottery_numbers_per_year[i]);	
			System.out.print("\tThe numbers for week " + (i + 1) + " are: ");
			for (int number : weekly_lottery_numbers_per_year[i])
			{
				System.out.print(number + " ");
			}
			System.out.println();	
		}
	}
}
