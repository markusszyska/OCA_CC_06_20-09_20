package ml.salastexido;

public class SumEven {
	
	public static void main(String[] args) {
		int boundary = 100;
		int i=1;
		int sum = 0;
		do {
			if(i%2==0) sum+=i;
			i++;
		}while(i<=boundary);
		
		System.out.println("Die Summe der geranden Zahlen von 1 bist " + boundary+ " ist " +sum);
	}
}
