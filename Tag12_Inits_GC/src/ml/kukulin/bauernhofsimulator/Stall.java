package ml.kukulin.bauernhofsimulator;

public class Stall {

private Kuh kuhImStall;

public Kuh getKuhImStall() {
	return kuhImStall;
}

public void setKuhImStall(Kuh kuhImStall) {
	this.kuhImStall = kuhImStall;
}

public boolean Tuer;

public void offnenTuer (Bauer b) {
	
	if (b.getSchluessel() == true) {
		
		 Tuer = true;
		 System.out.println("Tuer offen");
		}else {
	 Tuer =false;
	 System.out.println("Tuer zu");
		}}
	
//	if (Tuer == true) {
//		System.out.println("Tuer offen");}
//	else {System.out.println("Tuer zu");}
//	}
	


public void closeTuer (Bauer b) {
	if (b.getSchluessel() == true) {
		Tuer = false;
		System.out.println("Tuer zu");
	} else {
	 Tuer = true;
	 System.out.println("Tuer offen");
	}

}
}

