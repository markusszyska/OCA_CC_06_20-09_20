package ml.neumann;

public class App {
	public static void main(String[] args) {
		int[] lotto = {25, 1, 7, 42, 36, 5};
		BubbleSort.sort(lotto);
		for(int zahl: lotto) {
			System.out.println(zahl);
		}
	}
}
class BubbleSort {	
	public static void sort(int[] lottozahlen) {
        for (int i = 0; i < lottozahlen.length; i++) {
			for (int j = 0; j < lottozahlen.length -1; j++) {
				if(lottozahlen[j] > lottozahlen[j+1]) {
					int tmp = lottozahlen[j];
					lottozahlen[j] = lottozahlen[j+1];
					lottozahlen[j+1] = tmp;
				}
			}
		}		
    }
	
	
}