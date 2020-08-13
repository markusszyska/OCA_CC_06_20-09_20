/*
###### A5.
Erzeugen Sie eine `ArrayList` mit folgenden Werten: 

10, 20, 30, 40, 50, 60, 70, 80. 

Geben Sie die Elemete der Liste rueckwaerts aus.
*/

package ml.boettger.task_05_ready;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A05 {
	public static void main(String[] args) {
		Integer[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println();
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("\t" + numbers);
		System.out.println();
		System.out.println("\tPrint elements backwards");
		System.out.println();
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println("\t" + numbers.get(i));
		}		
	}
}
