package ml.kukulin;

public class A_1 {
	
	
	public static void main(String[] args) {
		

		int[] lotto = new int[7];
		int zahl = (int) (Math.random() * 49 + 1);

		
		for (int i = 1; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 49 + 1);

		
			for (int j = 1; j < i; j++) {
				if (lotto[i] == lotto[j])
					j--;
			}
		}

		

		
		for (int q = 1; q < lotto.length; q++) {
			System.out.print(lotto[q] + ", ");
			
		}

		

		}
	}
