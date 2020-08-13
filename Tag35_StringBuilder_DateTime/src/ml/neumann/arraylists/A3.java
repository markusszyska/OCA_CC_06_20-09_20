package ml.neumann.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class A3 {
	public static void main(String[] args) {
		ArrayList<String> a3 = new ArrayList<>();
		String[]week = {"mo","di","mi","do","fr"};

		a3.addAll(Arrays.asList(week));
	System.out.println("---------------Ausgabe mit Iterator-------------");
	Iterator <String> it = a3.iterator();
	while(it.hasNext()) {
		String element=it.next()
;		System.out.println(element);
	}
	
	}
	
}
