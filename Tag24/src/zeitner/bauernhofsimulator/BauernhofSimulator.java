package zeitner.bauernhofsimulator;

import zeitner.bauernhofsimulator.data.essen.gemuese.Moehre;
import zeitner.bauernhofsimulator.data.essen.stein.Stein;
import zeitner.bauernhofsimulator.data.tiere.Ferkel;


public class BauernhofSimulator {

	public static void main(String[] args) {
	
		Moehre m = new Moehre();
		
		Stein st = new Stein();
		
		Ferkel s = new Ferkel("Piggeldy", 200, "rot");

		System.out.println(s);
		System.out.println(m);
		s.laufen(50);
		m.wachsen();
		System.out.println(s);
		System.out.println(m);
		s.fressen(st,100);
		System.out.println(s);
		System.out.println(m);
		
	
		
		
	}

}
