package ml.assmann.blatt02;

public class Application {
	public static void main(String[] args) {
		Address add1 = new Address("Autohersteller", "", "Autoplatz", 1, 11111, "Autostadt");
		Address add2 = new Address("Peter", "Musterautohaus", "Marktplatz", 2, 80888, "Muenchen");
		Address add3 = new Address("Eva", "Musterautohaus", "Milchstrasse", 14, 90234, "Galazien");
		Address add4 = new Address("Lucy", "Musterautohaus", "Spielstrasse", 15, 76543, "Bretterbach");
		
//		add1.printAddress();
//		add2.printAddress();
//		add3.printAddress();
//		add4.printAddress();
		
		MotorVehicle move1 = new MotorVehicle(300, 150, 150, 1300, "JEEP", add1, add3);
		MotorVehicle move2 = new MotorVehicle(350, 130, 130, 1100, "SPORTSCAR", add1, add4);
		MotorVehicle move3 = new MotorVehicle(453, 178, 150, 1400, "", add1, add2);
		
		move1.printMotorVehicle();
		move2.printMotorVehicle();
		move3.printMotorVehicle();
		
		
	}
}
