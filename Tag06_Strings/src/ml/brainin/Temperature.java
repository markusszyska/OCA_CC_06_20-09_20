package ml.brainin;

public class Temperature {
	public static void main(String[] args) {
		int temperature = Integer.parseInt(args[0]);
		boolean precipitation = Boolean.parseBoolean(args[1]);

		if (precipitation) {
			if (temperature > 0) {
				System.out.print("Sauwetter");
			}else {
				System.out.print("Komm, geh'n wir Schlittenfahren!");
			}
		}else {
			if (temperature >= 20) {
				System.out.print("Gehen wir schwimmen?");
			}else if (temperature >0) {
				System.out.print("Gehen wir spazieren?");
			}
		}
		
		if (precipitation && temperature > 0) {
			System.out.print("Sauwetter");
		}else if (precipitation && temperature <= 0) {
			System.out.print("Komm, geh'n wir Schlittenfahren!");
		}else if (!precipitation && temperature >= 20) {
			System.out.print("Gehen wir schwimmen?");
		}else if (!precipitation && temperature > 0) {
			System.out.print("Gehen wir spazieren?");
		}
	}

	
	
	
}
