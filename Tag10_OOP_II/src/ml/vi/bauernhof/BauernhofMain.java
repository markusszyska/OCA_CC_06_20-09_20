package ml.vi.bauernhof;

public class BauernhofMain {

	public static void main(String[] args) {

		Kuh k1 = new Kuh();
		Kuh k2 = new Kuh("moo", "schwarz", "weiﬂ", 100.7, 1050);

		System.out.println(k1.name);
		System.out.println(k2.name);
		System.out.println(k2.hautfarbe);
		System.out.println(k2.fleckenfarbe);
		System.out.println(k2.milchmenge);
		System.out.println(k2.gewicht);

		k2.melken();
		System.out.println(k2.milchmenge);
		k2.laufen();
		System.out.println(k2.gewicht);
		k2.fressen();
		System.out.println(k2.gewicht);
	}

}
