package demoArrayList;

import java.util.ArrayList;

public class DemoArrayListGeneric {

	public static void main(String[] args) {
//		non_generic();
		generic();
	}

	private static void generic() {
		//bis Java 6
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Java 7 fuehrt den Diamond Operator ein
		ArrayList<Integer> list2 = new ArrayList<>();
		
		//The method add(Integer) in the type ArrayList<Integer> 
		//is not applicable for the arguments (String)
//		list.add("Hallo Welt");
		
		list.add(new Integer(5));
		list.add(new Integer(5));
		list.add(new Integer(5));
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum+= list.get(i);
		}
		
		
	}

	public static void non_generic() {
		/*
		 * Die folgende ArrayList ist eine sogenannte Raw-Type List.
		 * Es wird nicht angegeben, welcher Datentyp abgelegt werden soll.
		 * Daher wird Object benutzt. Das ist sehr bequem beim befuellen der Liste.
		 */
		ArrayList arl = new ArrayList();
		arl.add(1);
		arl.add("2");
		arl.add(new DemoArrayListGeneric());
		arl.add(new Object());
		
		/*
		 * Dadurch dass die Liste Raw-Type ist, muessen die Elemente gecastet werden
		 * Dies kann unter Umstaenden zu einer ClassCast Exception fuehren.
		 * Es gibt keine Moeglichkeit das zu verhindern, ausser keine
		 * Raw-Type Listen zu benutzen.
		 */
		int sum = 0;
		for (int i = 0; i < arl.size(); i++) {
			sum += (int)arl.get(i);
		}
		
		
		
	}

}
