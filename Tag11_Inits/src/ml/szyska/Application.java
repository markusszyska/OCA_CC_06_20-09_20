package ml.szyska;

public class Application {

	public static void main(String[] args) {

		Address autohersteller = new Address("", "Autohersteller", "Autoplatz", "1", 11111, "Autostadt");
		Address pm = new Address("Peter", "Musterautohaus", "Marktplatz",   "2", 80888, "München");
		Address em = new Address("Eva",   "Musterautohaus", "Milchstraße", "14", 90234, "Galazien");
		Address lm = new Address("Luca",  "Musterautohaus", "Spielstraße", "15", 76543, "Bretterbach");

		MotorVehicle vec1 = new MotorVehicle(300, 150, 150, 1300, "Jeep", "", autohersteller, em, true);
		MotorVehicle vec2 = new MotorVehicle(350, 130, 130, 1100, "SPORTSCAR", "", autohersteller, lm, true);
		MotorVehicle vec3 = new MotorVehicle(453, 178, 150, 1400, "", "", autohersteller, pm, true);
			
		vec2.printMotorVehicle();
	}

}
