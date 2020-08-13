/*
###### A1.
Erzeugen Sie eine `ArrayList` mit 20 zufaelligen Integer aus dem 
Bereich [1 ... 100]. Geben Sie die Elemente der Liste durchnummeriert
untereinander aus.

READY
*/

package ml.boettger.task_01_ready;

import java.util.ArrayList;

public class A01 {
	public static int pseudo_random_number_from_1_to_100()
	{
		return(int)(Math.random() * 100 + 1);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ar_i_list = new ArrayList<>();
		
		for (int i = 1; i <= 20; i++)
		{
			ar_i_list.add(A01.pseudo_random_number_from_1_to_100());
		}
		
		System.out.println();
		System.out.println(
			"\tArrayList with 20 numbers in the range from 1 to 100");
		System.out.println();
		for (int i = 1; i <= 20; i++)
		{
			System.out.println("\t" + i + ". : " + ar_i_list.get(i - 1));		
		}
		System.out.println();
	}
}
