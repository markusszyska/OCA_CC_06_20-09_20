
/*
Lassen Sie vom Nutzer einen Lottotip abgeben, er soll 6 Zahlen eingeben.

Fuehren Sie solange Ziehungen durch, bis die Zahlen vom Nutzer gezogen wurden
und lassen Sie die Anzahl der Versuche ausgeben.

Sortieren Sie das Array einer Ziehung zur Pruefung mit einem BubbleSort
 */

package ml.Boettger.task_4_Lotto;

import java.util.Scanner;

public class LottoMain4 {
	
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
	    LottoMain4.sc.nextInt();	    
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
		return(int)(Math.random() * LottoMain4.getMAX_DRAWED() + 1);
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
		
		if (LottoMain4.isTESTMODE())
		{
			print_lottery_numbers(lottery_numbers, false);
			LottoMain4.pause();
		}
		
		return true;					// new number drawed
	}
	
	//#########################################################################
	private static int[] bubble_sort(int[] intArr) 
	//#########################################################################
	{
		int k;
	    for (int i = 0; i < intArr.length - 1; i++)
	    {
	    	if (intArr[i] < intArr[i + 1]) 
	    	{
	    		continue;
	        }
	        k = intArr[i];
	        intArr[i] = intArr[i + 1];
	        intArr[i + 1] = k;
	        bubble_sort(intArr);
	    }
	    return intArr;
	}
		
	//#########################################################################
	public static void input_lottery_numbers(int[] lottery_numbers)
	//#########################################################################
	{
		int i = 0;
	
		System.out.println();
		System.out.println(
		  "\tPlease enter 6 different lottery numbers in the range 1 to 49:");
		System.out.println();
		
		for (i = 0; i < 6; i++) 
		{
			System.out.printf(
				"\tPlease enter the %2d. lottery number: ", i + 1);
	        lottery_numbers[i] = LottoMain4.sc.nextInt();
	    }
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
				number = LottoMain4.lottery_draw();
				if (LottoMain4.isTESTMODE())
				{
					System.out.println(
						"\tTry number " + try_number++ + " with " + number);	
					LottoMain4.pause();
				}	
			} 
			while (!LottoMain4.new_number_drawed(lottery_numbers, number));			
		}		
	}
	
	//#########################################################################
	private static boolean six_correct_ones(int[] arr1, int[] arr2)
	//#########################################################################
	{
		for (int i = 0; i < arr1.length; i++)
		{
			if (arr1[i] != arr2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	//#########################################################################
	public static void reset_lottery_numbers(int[] arr)
	//#########################################################################
	{
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = 0;
		}
	}
		
	//#########################################################################
	public static void main(String[] args) 
	//#########################################################################
	{
		int[] desired_lottery_numbers = {0, 0, 0, 0, 0, 0};		// 6 numbers
		int[] drawn_lottery_numbers = {0, 0, 0, 0, 0, 0};		// 6 numbers		
		long number_of_draws = 0L;
		
		System.out.println();		
		
		// get the desired lottery numbers froom user input
		LottoMain4.input_lottery_numbers(desired_lottery_numbers);
		
		// sort them by bubble sort
		LottoMain4.bubble_sort(desired_lottery_numbers);
		
		// print them
		LottoMain4.print_lottery_numbers(desired_lottery_numbers, false);
				
		do
		{	
			LottoMain4.reset_lottery_numbers(drawn_lottery_numbers);
			LottoMain4.draw_the_lottery_numbers(drawn_lottery_numbers);
			number_of_draws++;
			LottoMain4.bubble_sort(drawn_lottery_numbers);
			
			if (number_of_draws <= 5)
			{
				if (number_of_draws == 1)
				{
					System.out.println();
					System.out.println("\tThe first 5 drawings are:");
					System.out.println();
				}
				
				LottoMain4.print_lottery_numbers(drawn_lottery_numbers, true);
				if (number_of_draws == 5)
				{
					LottoMain4.pause();
				}					
			}
						
			if ((number_of_draws % 10000) == 0)
			{	
				System.out.println(
					"\tThere had been " + number_of_draws + " attempts.");
			}
		} 
		while (!LottoMain4.six_correct_ones(
			desired_lottery_numbers, drawn_lottery_numbers));
		
		LottoMain4.print_lottery_numbers(drawn_lottery_numbers, false);
		System.out.println();
		System.out.println(
			"\tThere had been totally " + number_of_draws + " attempts.");
		LottoMain4.sc.close();
	}	
}
