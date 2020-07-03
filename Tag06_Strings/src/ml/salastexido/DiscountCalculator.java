package ml.salastexido;

public class DiscountCalculator {

	public static String calculateDiscountPreis(double einzelPreis, int st�ckzahl) {
		double gesamtpreis = einzelPreis * st�ckzahl;
		if (st�ckzahl > 0 && st�ckzahl <= 10) {
			gesamtpreis = gesamtpreis - calculatePercentFromPrice(gesamtpreis, 5);
			return "Du hast gekauft " + st�ckzahl + " St�cks" + "gibt es " + "5% Rebatt\n.  Gesamtpreis ist: " + gesamtpreis +" Euros";
		} else if (st�ckzahl >= 50)
			gesamtpreis = gesamtpreis - calculatePercentFromPrice(gesamtpreis, 10);
			return "Du hast gekauft " + st�ckzahl + " St�cks" + "gibt es " + "10% Rebatt\n.  Gesamtpreis ist: " + gesamtpreis +" Euros";
		
	}
	
	// 10%*150
	public static int calculatePercentFromPrice(double price, int percent) {
		// convert percent to decimal value percent/100 = decimalvaluePercent
		// multiply decimal Value*price;
		return (int) ((double) percent / 100 * price);
	}

	public static void main(String[] args) {
		int st�ckzahl=150;
		double einzelPreis=60;
		System.out.println(calculateDiscountPreis(einzelPreis,st�ckzahl ));
	}
}
