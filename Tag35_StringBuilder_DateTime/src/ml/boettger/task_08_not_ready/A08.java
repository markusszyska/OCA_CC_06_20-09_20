/*
 ###### A8.
Erzeugen Sie eine `ArrayList` mit 10 zufaelligen Integer aus dem Bereich 
[0 ... 50]. Entfernen Sie mit `remove(int)` die ungeraden Werte.
*/

package ml.boettger.task_08_not_ready;

import java.util.ArrayList;
import java.util.Iterator;

import ml.boettger.task_07_ready.A07;

public class A08 {
	private static int pseudo_random_number_from_1_to_50()
	{
		return(int)(Math.random() * 50 + 1);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ar_i_list = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++)
		{
			ar_i_list.add(A08.pseudo_random_number_from_1_to_50());
		}
		System.out.println();
		System.out.println(
			"\tArrayList with 10 numbers in the range from 1 to 50");
		System.out.println();
		System.out.println("\t" + ar_i_list);
		System.out.println();
		for (int i = 0; i < ar_i_list.size(); i++) {
			if ((ar_i_list.get(i) % 2) == 1) {
				ar_i_list.remove(i);
			}	
		}
		System.out.println();
		System.out.println("\t" + ar_i_list);
		System.out.println();
	}
}

