package bauernhof;

public class BauernhofMain {
	public static void main(String[] args) {
		Schwein refSchwein1 = new Schwein();
		System.out.println(refSchwein1);
		
		Schwein refSchwein2 = new Schwein("Frederik", 100, 10, "auf der Wiese");
		System.out.println(refSchwein2);
		
		refSchwein1.fressen(10);
		refSchwein2.fressen(20);
		System.out.println("--------------Die Schweine spielen------------");
		refSchwein1.spielen(refSchwein2);
		refSchwein2.spielen(refSchwein1);
		
		Kartoffel refKartoffel = new Kartoffel("Ackergold", 10);
		System.out.println(refSchwein2.getGewicht());
		refSchwein2.fressen(refKartoffel);
		System.out.println(refSchwein2.getGewicht());
		
		Stall s = new Stall();
		s.schwein = refSchwein2;
		
		System.out.println(refSchwein2 == s.schwein);
		s.s = s;
		System.out.println(s.s.schwein);
	}
}
