package ml.salastexido;

public class Product {
	
	public static void main(String[] args) {
		int boundary; // Ganze zahl, bis zu der summiert wird
		int mult; // Summer der bisher 
	
		boundary = 5;
		mult = 1;
	
		for(int i=1;i<=boundary;i++) {
			if(i==1) {
				mult = 1;
			}else {
				mult = mult *i ;
			}
		}
		System.out.println("Das Produkt der Zahlen von 1 bis " + boundary + " ist " + mult);
	}

}
