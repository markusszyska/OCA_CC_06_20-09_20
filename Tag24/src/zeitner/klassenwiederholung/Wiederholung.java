package zeitner.klassenwiederholung;

public class Wiederholung {

	public static void main(String[] args) {
		Elter e = new Elter();
		Kind k = new Kind();

		System.out.println(e);
		System.out.println(k);
		
		e.schenken(k);
		
	}

}
