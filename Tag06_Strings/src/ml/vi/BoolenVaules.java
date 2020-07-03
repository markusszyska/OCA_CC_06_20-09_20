package ml.vi;

public class BoolenVaules {

	public static void main(String[] args) {

		boolean a, b, boolVariable;
		
		System.out.println("Logische Operatoren:");
		System.out.println("====================");
		
		for(int i = 0; i < 2; i++) {
			
			a = (i < 1)? false : true;
			
			for(int j = 0; j < 2; j++) {
				
				b = (j < 1)? false : true;			

				boolVariable = a && b;
				System.out.print(a + " && " + b + " liefert ");	
				System.out.println(boolVariable);
				
				boolVariable = a || b;
				System.out.print(a + " || " + b + " liefert ");	
				System.out.println(boolVariable);
				
				boolVariable = a ^ b;
				System.out.print(a + "  ^ " + b + " liefert ");	
				System.out.println(boolVariable);
				System.out.println();
				
			}			
			
		}

	}

}
