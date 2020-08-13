/*

###### A3.

Erzeugen Sie eine `ArrayList` mit folgenden Strings: 

"Mon", "Tue", "Wed", "Thu", "Fri". 

Verwenden Sie einen `Iterator` um die Elemente der Liste mit der while-Schleife
auszugeben.

READY
*/

package ml.boettger.task_03_ready;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class A03 {
	public static void main(String[] args) {
		String[] arr = {"Mon", "Tue", "Wed", "Thu", "Fri"};
		List<String> weekdays = new ArrayList<String>(Arrays.asList(arr));
		Iterator<String> it = weekdays.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println("\t" + element);
		}		
	}
}
