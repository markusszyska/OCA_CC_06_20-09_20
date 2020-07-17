package ml.salastexido.lotto;

import java.util.Arrays;
import java.util.Random;

import ml.salastexido.utils.DynamicArray;

public class LottoTicketGenerator {
	private final static int NUM_NUMBERS = 6;
	private final static int NUM_RANGE = 49;
	//week for a year
	private final static int NUM_WEEKS = 52;
	private final int[] numbers;
	private final int[][] numberLottoWeeks;
	private final static Random random = new Random();
	
	private LottoTicketGenerator(int[] numbers) {
		this.numbers = numbers;
		this.numberLottoWeeks = null;
	}
	
	private LottoTicketGenerator(int[][] numbers) {
		this.numbers = null;
		this.numberLottoWeeks = numbers;
	}
	
	public static LottoTicketGenerator generateLotto() {
		final int[] numbers = new int[NUM_NUMBERS];
		DynamicArray dynamicArray = new DynamicArray();
		for(int i =0; i< NUM_RANGE;i++) {
			dynamicArray.addItemEnd(i);
		}
		for(int i =0; i< NUM_NUMBERS;i++) {
			final int element = random.nextInt(NUM_RANGE-i);
			numbers[i]=dynamicArray.removeItemPos(element);
		}
		dynamicArray.Sort(numbers,NUM_NUMBERS);
		return new LottoTicketGenerator(numbers);
	}
	
	
	public static LottoTicketGenerator generateLottoByWeeks() {
		final int[][] numberLottoWeeks = new int[NUM_WEEKS][NUM_NUMBERS];
		
		for(int i =0; i< NUM_WEEKS;i++) {
			DynamicArray dynamicArray = new DynamicArray();
			for(int j =0; j< NUM_RANGE;j++) {
				dynamicArray.addItemEnd(j);
			}
			for(int k=0;k<NUM_NUMBERS;k++) {
				final int element = 1+random.nextInt(NUM_RANGE-k);
				numberLottoWeeks[i][k]=dynamicArray.removeItemPos(element);
			}
		}
		return new LottoTicketGenerator(numberLottoWeeks);
	}
	
	@Override
	  public String toString() {
	    final StringBuilder sb = new StringBuilder("LottoTicketGenerator{");
	    sb.append(" numbers=").append(Arrays.toString(numbers));
	    sb.append('}');
	    return sb.toString();
	  }
	
	public static void main(String[] args) {
//		System.out.println(LottoTicketGenerator.generateLotto());
//		System.out.println(LottoTicketGenerator.generateLotto());
//		System.out.println(LottoTicketGenerator.generateLotto());
		
		for(int i=0;i<52;i++) {
			for(int j=0;j<6;j++) {
				System.out.println("[" + i +"," + j+ "] => " + LottoTicketGenerator.generateLottoByWeeks().numberLottoWeeks[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
