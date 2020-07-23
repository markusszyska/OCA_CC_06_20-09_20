package bauernhof;

public class BauernhofMain {
	public static void main(String[] args) {
		Schwein s = new Schwein();
		
		Gemuese g1 = new Kartoffel();
		Gemuese g2 = new Moehre();
		Kartoffel k1 = new Kartoffel();
		go(k1);
		
		Muenze m1 = new Muenze();
		IFressbar f1 = new Muenze();
		IFressbar f2 = new Moehre();
		IFressbar i3 = new Kartoffel();
		
		s.fressen(m1);
		s.fressen(g1);
		s.fressen(g2);
		
	}
	static void go(Gemuese g) {
		
	}
}
