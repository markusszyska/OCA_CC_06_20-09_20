package ml.salastexido;

import java.util.Random;

public class LottoNumberGenerator {

	
	private static void showArray(int[] array){
        for (int element: array) { System.out.print(" " +element); }
        System.out.println();
    }
	private static void generateLottoNumber(int n){
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(49);
        }
        showArray(array);
    }
	
	public static void main(String[] args) {
		System.out.println("----------LottoGenerator------");
		generateLottoNumber(6);
		System.out.println("----------LottoGenerator------");
		
	}
	
}
