package ml.Liebermann.Application;

public class Application {
	public static void main(String[] args) {

		Adress a1 = new Adress("Kai", "Mai", "Kaimaistr", "123", 123456, "Kaimailand");
		
		Adress ah1 = new Adress("Peter", "Musterautohaus", "Milchstraﬂe", "2",90234, "Galazien" );
		Adress ah2 = new Adress("Eva", "Musterautohaus", "Marktstraﬂe", "2",90232, "Galaewn" );
		Adress ah3 = new Adress("Uwe", "Musterautohaus", "Straﬂe", "2",36432, "Galle" );

		
		MotorVehicle m1 = new MotorVehicle(300, 150, 150, 1300, "JEEP", "k.A", a1, ah1);
		MotorVehicle m2 = new MotorVehicle(350, 130, 130, 1100, "SPORTSCAR", "k.A", a1, ah3);
		MotorVehicle m3 = new MotorVehicle(453, 178, 150, 1400,"k.A", "k.A", a1, ah2);
		
		m1.printMotorVehicle();
		m2.printMotorVehicle();
		m3.printMotorVehicle();
		
	}

}
