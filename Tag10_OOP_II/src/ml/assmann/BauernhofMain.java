package ml.assmann;

public class BauernhofMain {

	public static void main(String[] args) {
		Kuh kuh1 = new Kuh("Berta", "weiss", "schwarz", 11, 700);
		Kuh kuh2 = new Kuh("Rosa", "braun", "weiss", 7, 780);
		Kuh kuh3 = new Kuh("Milka", "weiss", "lila", 4, 850);
		
		kuh1.laufen(150);
		kuh1.fressen(350);
		kuh1.melken();
		kuh1.melken();
		kuh1.melken();
		
		System.out.println("===============");
		
		kuh2.laufen(900);
		kuh2.fressen(1000);
		kuh2.melken();
		kuh2.melken();
		kuh2.melken();
		
		System.out.println("===============");
		
		kuh3.laufen(200);
		kuh3.fressen(350);
		kuh3.melken();
		kuh3.melken();
		kuh3.melken();		
	}
}
