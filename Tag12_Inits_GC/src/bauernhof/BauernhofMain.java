package bauernhof;

public class BauernhofMain {
	public static void main(String[] args) {
		Tuer t1 = new Tuer();
		t1.setId(1);
		
		Tuer t2 = new Tuer();
		t2.setId(2);
		
		Schluessel s1 = new Schluessel();
		s1.setId(1);
		
		Schluessel s2 = new Schluessel();
		s2.setId(2);
		
		Bauer b1 = new Bauer();
		b1.tuerSchliessen(t1, s2);
		
		b1.tuerSchliessen(t1, s1);
		b1.tuerSchliessen(t2, s2);
		
	}
}
