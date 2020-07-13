package ml.thurairajah;

public class Bauernhof {

	public static void main(String[] args) {
		
		Schwein refSchwein = new Schwein(); // Schwein-Beziehung fehlt hier erstmal!
		refSchwein.setName("Piggy"); //"setName" bezieht sich auf >Schwein.java >>setName<< <. Wenn es das in Schwein.jav nicht gibt, dann hier Fehler angezeigt
		Schwein refSchwein2 = new Schwein();
		refSchwein2.setName("Salamy"); // Name wird im Schwein-Name-Setter uebergeben.
		System.out.println("Test: "+refSchwein.getName()); // refSchwein kann hier trotzdem noch nicht ausgeben werden! Nur mit getName wird Piggy ausgegeben!
		
		Kuh refKuh = new Kuh();
		refKuh.setName("Melka");
//		Stall refStall4 = new Stall();
//		refStall4.setKuhImStall ...zu Stall.java gehen ..
		
		Stall refStall = new Stall();
		refStall.setSchweinImStall(refSchwein);
		Stall refStall2 = new Stall();
		refStall2.setSchweinImStall(refSchwein);
		
		System.out.println(refSchwein2.getName()); // Name wird aus Getter von Schwein-Name hergeholt.
		System.out.println(refStall.getSchweinImStall().getName());
		
		Stall refStall3 = new Stall();
		System.out.println(refStall3.getSchweinImStall());
		
		Kartoffel k = new Kartoffel(); //Kartoffel-Klasse
		Moehre m = new Moehre(); 	//Moehren-Klasse
		
		Eimer refEimer = new Eimer();
		refEimer.wirdGemolken();
		
		refSchwein.fressen(10); // fressen-Methode aus Schwein.java, int-parameter
		refSchwein.fressen(k.getKnollenGroesse()); //aus Getter von Kartoffel.java
		refSchwein.fressen(k);
		refSchwein.fressen(new Kartoffel());
		
		refKuh.melken2(3);
		refKuh.melken2(new Eimer());
		
	}
	
	public static void go(Schwein s, Kartoffel k) {
		s.fressen(0); //in Schwein.java, Z61:fressen(int bissen)
		k.wirdGegessen(); //in Kartoffel.java, Z26: wirdGegessen()
	}
	public static void melk(Kuh k, Eimer e) {
		k.melken2(0);  
		e.wirdGemolken(5);
	}
	

}
