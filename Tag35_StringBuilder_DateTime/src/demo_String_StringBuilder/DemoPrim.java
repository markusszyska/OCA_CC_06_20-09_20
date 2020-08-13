package demo_String_StringBuilder;

public class DemoPrim {
	public static void main(String[] args) {
		String x = "Taxi";
		System.out.println(x.concat(" cab"));
		System.out.println(x);
		
		x = x.concat(" cab"); //Nur mit Neuzuweisung erhalten wir Taxi cab
		System.out.println(x);
		/*
		 * Zwei StringBuilder Objekte werden erstellt
		 */
		StringBuilder one = new StringBuilder("Hallo");
		StringBuilder two = new StringBuilder("Hallo");
		/*
		 * three zeigt danach auf das selbe Objekt wie one
		 */
		StringBuilder three = one.append("a");
		System.out.println(one == two); //false
		System.out.println(one == three);//true
		
		System.out.println(one);
		System.out.println(three);
		
		one.append(" , Java");
		three.append(" ist eine Insel");
		
		System.out.println(one);
		System.out.println(three);
		
	}
}
