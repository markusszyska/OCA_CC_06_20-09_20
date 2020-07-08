package bauernhof;

public class BauernhofMain {

	public static void main(String[] args) {
		Schwein s1 = new Schwein();
		Schwein s2 = new Schwein();
		
		s1.name = "Piggeldy";
		s1.gewicht = 100;
		s1.alter = 5;
		System.out.println(s1.name);
		
		s2.name = "Frederik";
		s2.gewicht = 300;
		s2.alter = 10;
		System.out.println(s2.name);
		
		s1.grunzen();
		s2.grunzen();
		
	}

}
