package ml.salastexido;

public class Temperature {
	
	public static String CheckWetter(int temperature, boolean precipitation) {
		String result="";
		
		if(temperature>=0 && precipitation)
			result= "Sauwetter";
		else if((temperature>0 && temperature<=19) && !precipitation) {
			result= "Gehen wir spazieren?";
		}
		else if(temperature>=20 && !precipitation) {
			result= "Gehen wir schwimmen?";
		}
		else if(temperature<0 && precipitation) {
			result= "Komm, geh'n wir Schlittenfahren";
		}
		else if(temperature <0 && !precipitation) {
			result= "Lass uns am Lagerfeurer Glüwhein trinken";
		}
		return result;
	}
	
	public static void main(String[] args) {
		int temperature = Integer.parseInt(args[0]);
		boolean precipitation = Boolean.parseBoolean(args[1]);
		System.out.println(CheckWetter(-20, true));
	
	}
	

}
