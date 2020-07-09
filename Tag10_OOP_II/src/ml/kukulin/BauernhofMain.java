package ml.kukulin;


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
		
		
////////////////////////////////////////////////////////////////////////////////		
		Kuh a = new Kuh("Maria","Weiss" , "Braun", 0, 0);
		Kuh b = new Kuh("Mirabella","Weiss" , "Schwarz", 0, 0);
		
//		a.laufen(5, 400);
	//	a.fressen(30, a.laufen(5, 400));
	//	a.melken(a.fressen(30, a.laufen(5, 400)));
		System.out.println( a.name + " " + (a.melken(a.fressen(30, a.laufen(5, 400)))) + " Liter pro Tag");
		
		System.out.println( b.name + " " + (b.melken(b.fressen(40, b.laufen(3, 700)))) + " Liter pro Tag");
		
		
		
	}

}
