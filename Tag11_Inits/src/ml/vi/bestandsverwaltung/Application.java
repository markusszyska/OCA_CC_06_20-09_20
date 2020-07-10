package ml.vi.bestandsverwaltung;

public class Application {

	public static void main(String[] args) {

		Address a1 = new Address();
		a1.printAddress();

		Address a2 = new Address("Hana", "Mana", "Nanastrasse", 12, 321654, "Hamburg");
		a2.printAddress();

		MotorVehicle m1 = new MotorVehicle();
		m1.printMotorVehicle();

		MotorVehicle m2 = new MotorVehicle(3, 2.2, 1.5, 40.5, "BMW", "Halunke Robert", a1, a2, true);
		m2.printMotorVehicle();

		System.out.println("--------------------------------");

		Address aAutohersteller = new Address("Autohersteller", "", "Autoplatz", 1, 11111, "Autostadt");
		Address aEva = new Address("Eva", "Musterautohaus,", "Milchstraße", 14, 90234, "Galazien");
		Address aLuca = new Address("Luca", "Musterautohaus", "Spielstraße", 15, 76543, "Bretterbach");
		Address aPeter = new Address("Peter", "Musterautohaus", "Marktplatz", 2, 80888, "München");

		MotorVehicle mEva = new MotorVehicle(300, 150, 150, 1300, "JEEP", "Eva", aAutohersteller, aEva, true);
		MotorVehicle mLuca = new MotorVehicle(350, 130, 130, 1100, "SPORTSCAR", "Luca", aAutohersteller, aLuca, true);
		MotorVehicle mPeter = new MotorVehicle(453, 178, 150, 1400, "", "Peter", aAutohersteller, aPeter, true);

		mEva.printMotorVehicle();
		System.out.println();
		mLuca.printMotorVehicle();
		System.out.println();
		mPeter.printMotorVehicle();

	}

}
