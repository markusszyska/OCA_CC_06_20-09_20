/*
-----------------------------------Aufgabe 3-----------------------------------

Erfragen Sie vom Nutzer eine Eingabe wie viele Ziehungen durchgefuehrt werden
sollen.

Die Ziehungen sollen dann in einem entsprechend grossen Array gespeichert
werden und ausgegeben werden:

"Die Zahlen fuer Ziehung 1 sind : 1 2 3 4 5 6 ".

*/

package ml.Boettger.task_3_Lotto;

import java.util.Scanner;

public class LottoMain3
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
	    LottoMain3.sc.nextInt();	    
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
		return(int)(Math.random() * LottoMain3.getMAX_DRAWED() + 1);
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
		
		if (LottoMain3.isTESTMODE())
		{
			print_lottery_numbers(lottery_numbers, false);
			LottoMain3.pause();
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
				number = LottoMain3.lottery_draw();
				if (LottoMain3.isTESTMODE())
				{
					System.out.println(
						"\tTry number " + try_number++ + " with " + number);	
					LottoMain3.pause();
				}	
			} 
			while (!LottoMain3.new_number_drawed(lottery_numbers, number));			
		}		
	}		

	//#########################################################################
	public static void main(String[] args)
	//#########################################################################
	{
		int number_of_lottery_draws = 0;
		
		System.out.println();
		System.out.println(
		  "\tPlease enter the number of lottery draws followed by RETURN: ");
		System.out.println();
		
        number_of_lottery_draws = LottoMain3.sc.nextInt();

		int[][] lottery_draws = new int[number_of_lottery_draws][6];  
		
		for (int i = 0; i < number_of_lottery_draws; i++)
		{
			LottoMain3.draw_the_lottery_numbers(lottery_draws[i]);	
			System.out.print("\tThe numbers for draw " + (i + 1) + " are: ");
			for (int number : lottery_draws[i])
			{
				System.out.print(number + " ");
			}
			System.out.println();	
		}
	}
}
