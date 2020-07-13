package ml.kukulin.bauernhofsimulator;

public class BauernhofsimulatorMain {
public static void main(String[] args) {
	
	
	Kuh m = new Kuh("Maria",15);
	Bauer b = new Bauer();
	b.melken(m);
	Stall s = new Stall();
	b.setSchluessel(true);
	
	s.offnenTuer(b);
	s.closeTuer(b);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
