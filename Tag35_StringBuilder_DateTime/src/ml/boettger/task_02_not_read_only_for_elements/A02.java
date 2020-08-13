/*
###### A2.

Erzeugen Sie eine `ArrayList` mit folgenden Strings: 

"Mon", "Tue", "Wed", "Thu", "Fri". 

Geben Sie die Elemente der Liste mit der foreach-Schleife aus.

NOT READY ONLY WITH FOR ELEMENTS
*/

package ml.boettger.task_02_not_read_only_for_elements;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A02 {
	public static void main(String[] args) {
		String[] arr = {"Mon", "Tue", "Wed", "Thu", "Fri"};
		List<String> weekdays = new ArrayList<String>(Arrays.asList(arr));
		for (String w : weekdays)
		{
			System.out.println("\t" + w);
		}		
	}	
}
