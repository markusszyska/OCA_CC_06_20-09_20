package ml.neumann.arraylists;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class A5 {
	public static void main(String[] args) {

	LinkedList<Integer> a5 = new LinkedList<>();
	Integer[]temp= {10,20,30,40,50,60,70,80	};
	
	a5.addAll(Arrays.asList(temp));
	Iterator <Integer> it2 =  a5.descendingIterator();
	
	while(it2.hasNext()) {
		//Integer element=it2.next()
;		System.out.println(it2.next());
	}

}}
