package ml.Liebermann;

public class BooleanValues {

	public static void main(String[] args) {
	
		boolean b1 = false;
		boolean b2 = false;
		
		for (int i = 0; i < 4; i++) {
			if(i == 1)
				b2 = true;
			if(i == 2) {
				b1 = !b1;
				b2 = !b2;
			}
			if(i == 3) {
				b2 = !b2;
			}
				System.out.println(b1 + " && " + b2 + " liefert " + (b1 && b2));
				System.out.println(b1 + " || " + b2 + " liefert " + (b1 || b2));
				System.out.println(b1 + " ^ " + b2 + " liefert " + (b1 ^ b2));
		}
		
		

	}

}
