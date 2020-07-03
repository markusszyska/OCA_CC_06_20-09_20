package kontrollstrukturen;

public class DemoVerschachtelteSchleifen {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("i wird in der inneren Schleife genutzt: " + i);
				System.out.println("j: " + j);
			}
//			System.out.println("j: " + j);
		}

		
		/*
		 * break: bricht die Schleife, in der es steht komplett ab.
		 * Code nach dem break wird nicht mehr ausgefuehrt.
		 * continue: bricht die momentane Iteration ab und setzt die
		 * Schleife mit der naechste Iteration fort.
		 * Code der nach dem Continue steht, wird nicht mehr ausgefuehrt.
		 */		
		System.out.println("*******\n*******\n*******");
		for (int i = 0; i < 5; i++) {
			System.out.println("Durchlauf aussen: " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("Durchlauf innen: " + j);
				if (j == 2) {
					System.out.println("break innen");
					break;
				}
			}
			if (i == 2) {
				System.out.println("break aussen");
				break;
			}
			System.out.println("nach der der Verzweigung mit continue");
		}
		System.out.println("*******\n*******\n*******");
		for (int i = 0; i < 5; i++) {
			System.out.println("Durchlauf aussen: " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("Durchlauf innen: " + j);
				if (j == 2) {
					System.out.println("continue innen");
					continue;
				}
				System.out.println("nach der der Verzweigung mit continue");
			}
//			if(i == 2) {
//				System.out.println("break aussen");
//				break;
//			}
		}
		System.out.println("*******\n*******\n*******");
		outer: for (int i = 0; i < 5; i++) {
			System.out.println("Durchlauf aussen: " + i);
			inner: for (int j = 0; j < 5; j++) {
				System.out.println("Durchlauf innen: " + j);
				if (j == 2) {
					System.out.println("break outer");
					break outer;
				}
				System.out.println("nach der der Verzweigung mit break");
			}
		}

		outer: for (int i = 0; i < 5; i++) {
			System.out.println("Durchlauf aussen: " + i);
			inner: for (int j = 0; j < 5; j++) {
				System.out.println("Durchlauf innen: " + j);
				if (j == 2) {
					System.out.println("break outer");
					break outer;
				}
				System.out.println("nach der der Verzweigung mit break");
			}
		}		
	}
}
