/*
-----------------------------------Aufgabe 1----------------------------
Lottozahlen eine Ziehung
Erstellen Sie einen Lottozahlengenerator, der 6 zufaellige Zahlen
zwischen 1 und 49 in ein Array schreibt. Beachten Sie dabei,
dass bei einer Lottoziehung keine Zahl doppelt vorkommt.
Lassen Sie danach die Zahlen ausgeben.
 */

package ml.Boettger.task_1_Lotto;

import java.util.Scanner;

public class LottoMain1 {
	
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
	    System.out.println("\tPress Any Key To Continue...");
	    LottoMain1.sc.nextLine();	    
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
		return(int)(Math.random() * LottoMain1.getMAX_DRAWED() + 1);
	}

	//########################################################################
	private static void print_lottery_numbers(int[] lottery_numbers)
	//
	//	Displays the lottery numbers
	//
	//########################################################################
	{
		System.out.println(
			"\tThe following 6 lottery numbers were drawn:");
		System.out.println(
			"\t-------------------------------------------------------------");
		System.out.print("\t");
		for (int i : lottery_numbers)
		{
			System.out.print(i + ", ");	
		}
		System.out.println();			
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
		
		if (LottoMain1.isTESTMODE())
		{
			print_lottery_numbers(lottery_numbers);
			LottoMain1.pause();
		}
		
		return true;					// new number drawed
	}
	
	//#########################################################################
	public static void main(String[] args) 
	//#########################################################################
	{
		int[] lottery_numbers = {0, 0, 0, 0, 0, 0};		// 6 numbers
		int number = 0;
		int try_number = 1;
		
		System.out.println();		
		for (int i = 0; i < 6; i++)			
		{
			do
			{	
				number = LottoMain1.lottery_draw();
				if (LottoMain1.isTESTMODE())
				{
					System.out.println(
						"\tTry number " + try_number++ + " with " + number);	
					LottoMain1.pause();
				}	
			} 
			while (!LottoMain1.new_number_drawed(lottery_numbers, number));			
		}		
		LottoMain1.print_lottery_numbers(lottery_numbers);
		LottoMain1.sc.close();
	}
}
