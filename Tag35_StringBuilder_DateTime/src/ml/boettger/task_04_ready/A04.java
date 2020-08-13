/*
###### A4.

Erzeugen Sie eine `ArrayList` mit folgenden Werten: 

10, 20, 30, 40, 50, 60, 70, 80. 

Geben Sie jedes zweite Element der Liste aus.
*/

package ml.boettger.task_04_ready;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A04 {
	public static void main(String[] args) {
		Integer[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println();
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("\t" + numbers);
		System.out.println();
		System.out.println("\tPrint every second element");
		System.out.println();
		for (int i = 1; i < numbers.size(); i+=2) {
			System.out.println("\t" + numbers.get(i));
		}		
	}	
}
