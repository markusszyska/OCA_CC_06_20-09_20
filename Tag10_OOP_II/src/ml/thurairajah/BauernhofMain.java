package ml.thurairajah;

public class BauernhofMain {

	public static void main(String[] args) {
//		Schwein s1 = new Schwein();
//		Schwein s2 = new Schwein();
		
		Kuh k1 = new Kuh();
		Kuh k2 = new Kuh();
		
//		s1.name = "Piggeldy";
//		s1.gewicht = 100;
//		s1.alter = 5;
//		System.out.println(s1.name);
//		
//		s2.name = "Frederik";
//		s2.gewicht = 300;
//		s2.alter = 10;
//		System.out.println(s2.name);
//		
//		s1.grunzen();
//		s2.grunzen();
		
		k1.name = "Berta";
		k1.hauptfarbe = "braun";
		k1.fleckenfarbe = "scharz";
		k1.milchmenge = 200;
		k1.gewicht = 500;
		
		System.out.println(k1.name);
		System.out.println("Milchmenge: "+k1.milchmenge);
		k1.melken();
		System.out.println(k1.milchmenge);
	
		k2.name = "Frieda";
		k2.hauptfarbe = "lila";
		k2.fleckenfarbe = "weiss";
		k2.milchmenge = 300;
		k2.gewicht = 600;
		
		System.out.println(k2.name);
		k2.laufen();
		System.out.println(k2.gewicht);
		k2.fressen();
		System.out.println(k2.gewicht);
	
	}

}
