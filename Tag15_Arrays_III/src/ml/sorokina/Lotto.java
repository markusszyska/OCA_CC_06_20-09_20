package ml.sorokina;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] again;

		int[] lottozahlen;

		int rand = 0;

		lottozahlen = new int[6];

		again = new boolean[49];

		for (int i = 0; i < lottozahlen.length; i++) {

			rand = (int) (Math.random() * 49 + 1);

			while (again[rand - 1] == true) {

				rand = (int) (Math.random() * 49 + 1);

			}

			again[rand - 1] = true;

			lottozahlen[i] = rand;

		}

		for (int i = 0; i <= 5; i++) {

			System.out.println("Lottozahl " + (i + 1) + " ist: " + lottozahlen[i]);

		}
	}

}
