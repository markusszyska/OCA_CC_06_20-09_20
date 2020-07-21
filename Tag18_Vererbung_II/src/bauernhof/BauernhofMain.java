package bauernhof;

import bauernhof.fauna.Bauer;
import bauernhof.fauna.Schwein;
import bauernhof.flora.Kartoffel;
import bauernhof.flora.Moehre;

public class BauernhofMain {
	public static void main(String[] args) {
		Schwein s = new Schwein();
		s.fressen(new Kartoffel());
		s.fressen(new Moehre());
		
		System.out.println(s.getName());
		System.out.println(s.getAlter());
		System.out.println(s.getGewicht());
		System.out.println(s.getPreis());
		System.out.println(s.isVegetarier());
		
		Bauer b = new Bauer();
		
	}
}
