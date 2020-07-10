package bauernhof;

import bauernhof.fauna.Bauer;
import bauernhof.fauna.Schwein;
import bauernhof.flora.Kartoffel;
import bauernhof.flora.Moehre;
import bauernhof.gebaeude.Stall;

public class BauernhofMain {
	public static void main(String[] args) {
	
		Schwein refSchwein = new Schwein();
		refSchwein.setName("Piggeldy");
		Schwein refSchwein2 = new Schwein();
		refSchwein2.setName("Frederick");
			
		Stall refStall = new Stall();
		refStall.setSchweinImStall(refSchwein);		
		Stall refStall2 = new Stall();
		refStall2.setSchweinImStall(refSchwein2);
		
		System.out.println(refSchwein.getName());
		System.out.println(refStall.getSchweinImStall().getName());
				
		Schwein nullSchwein = null;
//		nullSchwein.fressen(0);
		
		Stall refStall3 = new Stall();
		System.out.println(refStall3.getSchweinImStall());
		
		Kartoffel k = new Kartoffel();
		Moehre m = new Moehre();
		
		refSchwein.fressen(10);
		refSchwein.fressen(k.getKnollenGroesse());
		refSchwein.fressen(k);
		refSchwein.fressen(new Kartoffel());
		
		Bauer b = new Bauer();
		b.fuettern(refSchwein, m);
	}
	
	public static void go(Schwein s, Kartoffel k) {
		s.fressen(0);
		k.wirdGegessen();
	}
	
	
	
}
