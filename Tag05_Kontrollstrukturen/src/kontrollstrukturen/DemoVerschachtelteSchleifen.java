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
	}
}
