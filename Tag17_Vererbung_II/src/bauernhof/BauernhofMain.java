package bauernhof;

public class BauernhofMain {
	public static void main(String[] args) {
		Kuh k = new Kuh();
		System.out.println(k.getPreis());
		
		Kuh k1 = new Kuh(100);
		System.out.println(k1.getPreis());
		
		Bauer b = new Bauer();
		b.bewegen();
		b.tiereFuettern();
		System.out.println("---------------------");
		Schwein s = new Schwein();
		s.bewegen();
		s.grunzen();
		System.out.println("---------------------");
		Kuh k3 = new Kuh();
		k3.bewegen();
		k3.muhen();
		
		nimmtSaeugetier(k3);
		nimmtSaeugetier(s);
		nimmtSaeugetier(b);
		
		System.out.println("-----------instanceof-----------");
		System.out.println(s instanceof Schwein);
		System.out.println(s instanceof Nutztier);
		System.out.println(s instanceof Saeugetier);
		System.out.println(s instanceof Object);
		System.out.println("-----------instanceof-----------");
		
		Saeugetier s1 = new Saeugetier();
		Saeugetier s2 = new Nutztier();
		Saeugetier s3 = new Kuh();
		
		s1.bewegen();
		s2.bewegen();
		s3.bewegen();
		
		k.bewegen(1);
		
		Bauer b1 = new Bauer();
		System.out.println("------------gassigehen--------------");
		b1.gassiGehen(s);
		b1.gassiGehen(k);
//		b1.gassiGehen(b1);
	}
	
	public static void nimmtSaeugetier(Saeugetier s) {
		if(s instanceof Schwein) {
			System.out.println("s ist ein Objekt vom Typ Schwein");
		}else if(s instanceof Kuh) {
			System.out.println("s ist ein Objekt vom Typ Kuh");
		}else if(s instanceof Bauer) {
			System.out.println("s ist ein Objekt vom Typ Bauer");
		}
	}
	
	public static Saeugetier gibtSaeugetierZurueck() {
		return new Kuh();
	}
	
}
