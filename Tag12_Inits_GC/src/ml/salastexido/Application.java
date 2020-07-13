package ml.salastexido;

public class Application {

	
	public static void main(String[] args) {
		//Define Autohersteller
		Address autoHerstellerAddress =  new Address("Autohersteller", "", "Autoplatz", "1", 11111, "Autostadt");
		Address peterMusterautoHaus =  new Address("Peter MusterautoHaus", "", "Markplatz", "2", 80888, "M�nchen");
		Address lucaMusterautoHaus =  new Address("Luca MusterautoHaus", "", "Spielstra�e", "1", 76543, "Bretterbach");
		Address evaMusterautoHaus =  new Address("Luca MusterautoHaus", "", "Milchstra�e", "14", 90234, "Galazien");
		
		MotorVehicle motorVehicle1 = new MotorVehicle(300*150*150,1300,"JEEP",new Person("Raul","Alejandro"),autoHerstellerAddress,evaMusterautoHaus);
		MotorVehicle motorVehicle2 = new MotorVehicle(350*130*130,1100,"SPORTCAR",new Person("Lola","Lola"),autoHerstellerAddress,lucaMusterautoHaus);
		MotorVehicle motorVehicle3 = new MotorVehicle(453*178*150,1400,new Person("Raul","Alejandro"),autoHerstellerAddress,evaMusterautoHaus);
		
		motorVehicle1.printMotorVehicle();
		motorVehicle2.printMotorVehicle();
		motorVehicle3.printMotorVehicle();
		
	}
}
