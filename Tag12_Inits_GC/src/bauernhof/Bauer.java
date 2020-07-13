package bauernhof;

public class Bauer {
	
	public void tuerSchliessen(Tuer t, Schluessel s) {
		System.out.println(t.getId() + " " + s.getId());
		if(t.getId() == s.getId()) {
			if(t.isOpen()) {
				System.out.println("Tuer wurde abgeschlossen");
				t.setOpen(false);
			}
			else {
				System.out.println("Tuer wurde aufgeschlossen");
				t.setOpen(true);				
			}
		}else {
			System.out.println("Tuer und Schluessel passen nicht zusammen");
		}
		
		
	}
	
	
}
