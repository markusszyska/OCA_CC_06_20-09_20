/*
###### A7.
Erzeugen Sie eine `ArrayList` mit 10 zufaelligen Integer aus dem Bereich 
[0 ... 50]. Suchen Sie mit `indexOf` nach dem Wert 12.
*/

package ml.boettger.task_07_ready;

import java.util.ArrayList;

public class A07 {
	private static int pseudo_random_number_from_1_to_50()
	{
		return(int)(Math.random() * 50 + 1);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ar_i_list = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++)
		{
			ar_i_list.add(A07.pseudo_random_number_from_1_to_50());
		}
		System.out.println();
		System.out.println(
			"\tArrayList with 10 numbers in the range from 1 to 50");
		System.out.println();
		System.out.println("\t" + ar_i_list);
		System.out.println();
		System.out.println("\t" + (ar_i_list.indexOf(12) == -1 ?
			"12 not found" : "Index of 12 is " + ar_i_list.indexOf(12)));			
	}
}
