package ml.neumann.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class A2 {
	public static void main(String[] args) {
		

ArrayList<String> a2 = new ArrayList<>();
String[]week = {"mo","di","mi","do","fr"};

a2.addAll(Arrays.asList(week));
for(String i: a2 ) {
	System.out.println(i);
}

}
}
