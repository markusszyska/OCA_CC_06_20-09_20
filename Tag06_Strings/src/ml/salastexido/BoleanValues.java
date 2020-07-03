package ml.salastexido;

public class BoleanValues {
	
	
	
	public static void main(String[] args) {
		
		boolean[] all = { false, true };
	    System.out.println("Logit Operators:");
	    System.out.println("=================");
		for (boolean a : all) {
	        for (boolean b: all) {
	            System.out.println(a + " && " + b + " liefert " + (a && b));
	            System.out.println(a + " || " + b + " liefert " + (a || b));
	            System.out.println(a + " ^ " + b + " liefert " + (a ^ b));
	            System.out.println("\n");
	            
	        }
	       
	    }
	}
}
