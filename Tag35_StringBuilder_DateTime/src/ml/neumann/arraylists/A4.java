package ml.neumann.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class A4 {
	public static void main(String[] args) {
		ArrayList<Integer> a4 = new ArrayList<>();
		Integer[]temp= {10,20,30,40,50,60,70,80	};
		
		a4.addAll(Arrays.asList(temp));
		
for (int i=1; i<a4.size();i+=2) {
	System.out.println(a4.get(i));

}
}
}