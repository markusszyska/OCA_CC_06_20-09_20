/*
 ###### A6.
Erzeugen Sie eine `ArrayList` mit 20 zufälligen Integer aus dem Bereich 
[0 ... 100]. Sortieren Sie die Liste und geben Sie sie aus.
*/
package ml.boettger.task_06_ready;

import java.util.ArrayList;
import java.util.Collections;

import ml.boettger.task_01_ready.A01;

public class A06 {
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
			"\tUnsorted ArrayList with 20 numbers in the range from 1 to 100");
		System.out.println();
		for (int i = 1; i <= 20; i++)
		{
			System.out.println("\t" + i + ". : " + ar_i_list.get(i - 1));		
		}
		System.out.println();
		
		Collections.sort(ar_i_list);
		
		System.out.println(
			"\tSorted ArrayList with 20 numbers in the range from 1 to 100");
		System.out.println();
		for (int i = 1; i <= 20; i++)
		{
			System.out.println("\t" + i + ". : " + ar_i_list.get(i - 1));		
		}
		System.out.println();
	}
}	
