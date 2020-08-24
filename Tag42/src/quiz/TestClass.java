package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(Arrays.asList(new Person()));
		list.get(0).name = "Markus";
		for(final Person p : list) {
//			p = new Person();
			p.name = "";
		}
		int[][] ia = new int[2][2];
		for(int[] i : ia) {
			System.out.println(i);
		}
		for(int i: ia[0]) {
			System.out.println(i);
		}
		int value  = 0;
		if( true == 2 > 10 ) //4  
	      {
	         value = -10;
	      }
	}
}
class Person{
	public String name;
}