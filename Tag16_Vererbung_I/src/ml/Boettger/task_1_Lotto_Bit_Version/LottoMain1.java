/*
-----------------------------------Aufgabe 1----------------------------------

Lottozahlen eine Ziehung
Erstellen Sie einen Lottozahlengenerator, der 6 zufaellige Zahlen
zwischen 1 und 49 in ein Array schreibt. Beachten Sie dabei,
dass bei einer Lottoziehung keine Zahl doppelt vorkommt.
Lassen Sie danach die Zahlen ausgeben.

Die Pruefung nach doppelten Zahlen erfolgt in dieser Version durch 
einen 64-bit long, wo an den Positionen 2 bis 50 (fuer die Zahelen 1-49)
ein Bit gesetzt wird (aehnlich der Boolean Version mit einem Feld aus
49 Booleans)

 */

package ml.Boettger.task_1_Lotto_Bit_Version;

import java.util.Scanner;

public class LottoMain1 {
	
	//########################################################################
	//
	//	Here you can switch on/off the testmode
	//
	final public static boolean TESTMODE = false;	// testmode true/false
	//
	//########################################################################
	
	final public static int MAX_DRAWED = 49;	 		// max. no. drawed
	
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
	private static void print_lottery_numbers(long lottery_numbers)
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
		
		if (LottoMain1.isTESTMODE())
		{	
			System.out.println("\tin print_lottery_numbers " +
				Long.toBinaryString(lottery_numbers));
			LottoMain1.pause();
		}		
		
		System.out.print("\t");
		long l = 0b10;							// start with 0b10		
		for (int i = 1; i <= 49; i++)
		{	
			if ((lottery_numbers & l) == l)		// bit found
			{	
				System.out.print(i + " ");	    // print the bit position	
			}
			l = l << 1;
		}
		System.out.println();			
	}	
	
	//#########################################################################
	private static boolean new_number_drawed (long lottery_numbers,	int number)
	//#########################################################################
	{
		long l = 0b1;					// set bit, start with 0b10 for 2
		l = (l << number);
				
		if (LottoMain1.isTESTMODE())
		{	
			System.out.println("\tin new_number_drawed " + number + " " +
				Long.toBinaryString(l));
			LottoMain1.pause();
		}		
		if ((lottery_numbers & l) == l) 
		{
			return false;				// number already drawed
		}
		else
		{
			if (LottoMain1.isTESTMODE())
			{
				print_lottery_numbers(lottery_numbers | l);
				LottoMain1.pause();
			}
			return true;				// new number drawed
		}	
	}
	
	//#########################################################################
	public static void main(String[] args) 
	//#########################################################################
	{
		long l_lottery_numbers = 0l;	// for bit version, long = 64 bits
		int number = 0;
		int try_number = 1;
		
		System.out.println();		
		for (int i = 0; i < 6; i++)			
		{
			do
			{
				if (number > 0)
				{
					l_lottery_numbers |= (1L << number);
					if (LottoMain1.isTESTMODE())
					{	
						System.out.println("\tin main " + number + " " +
							Long.toBinaryString(l_lottery_numbers));
						LottoMain1.pause();
					}	
				}
				number = LottoMain1.lottery_draw();
				if (LottoMain1.isTESTMODE())
				{
					System.out.println(
						"\tTry number " + try_number++ + " with " + number);	
					LottoMain1.pause();
				}
			}
			//while (!LottoMain1.new_number_drawed(lottery_numbers, number));
			while (!LottoMain1.new_number_drawed(l_lottery_numbers, number));
		}		
		LottoMain1.print_lottery_numbers(l_lottery_numbers | (1L << number));
		LottoMain1.sc.close();
	}
}
