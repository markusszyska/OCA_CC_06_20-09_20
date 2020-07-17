package ml.kukulin;

public class A_2 {
	
	
	public static void main(String[] args) {
		

		int[][] lotto = new int[52][6];
		
		//int zahl = (int) (Math.random() * 49 + 1);

		
		for (int i = 0; i < 52; i++) {
			for(int j = 0; j < 6; j++) {
				
			lotto[i][j] = (int) (Math.random() * 49 + 1);

		
			//for (int a = 0; a < j; a++) {???????????????
				//if (lotto[i][j] == lotto[i][a]) {
					//a--;}
			//}
		}
		}
		

		for (int i = 0; i < 52; i++) {
			System.out.print("Die Zahlen fuer Woche  " + (i+1) + " sind : ");
		for (int q = 0; q < 6; q++) {
			System.out.print(lotto[i][q] + " \t");
			
			}
		System.out.println();
		}

		}
	}
