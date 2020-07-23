package bauernhof;

public class Moehre extends Gemuese {
	@Override
	public void wirdGegessen() {
		System.out.println("Moehre wird gefressen");

	}
}

class Kartoffel extends Gemuese {
	@Override
	public void wirdGegessen() {
		System.out.println("Kartoffel wird gefressen");
	}
}