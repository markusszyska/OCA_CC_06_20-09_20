package ml.salastexido;

public class DiscountCalculator {

	public static String calculateDiscountPreis(double einzelPreis, int stückzahl) {
		double gesamtpreis = einzelPreis * stückzahl;
		if (stückzahl > 0 && stückzahl <= 10) {
			gesamtpreis = gesamtpreis - calculatePercentFromPrice(gesamtpreis, 5);
			return "Du hast gekauft " + stückzahl + " Stücks" + "gibt es " + "5% Rebatt\n.  Gesamtpreis ist: " + gesamtpreis +" Euros";
		} else if (stückzahl >= 50)
			gesamtpreis = gesamtpreis - calculatePercentFromPrice(gesamtpreis, 10);
			return "Du hast gekauft " + stückzahl + " Stücks" + "gibt es " + "10% Rebatt\n.  Gesamtpreis ist: " + gesamtpreis +" Euros";
		
	}
	
	// 10%*150
	public static int calculatePercentFromPrice(double price, int percent) {
		// convert percent to decimal value percent/100 = decimalvaluePercent
		// multiply decimal Value*price;
		return (int) ((double) percent / 100 * price);
	}

	public static void main(String[] args) {
		int stückzahl=150;
		double einzelPreis=60;
		System.out.println(calculateDiscountPreis(einzelPreis,stückzahl ));
	}
}
