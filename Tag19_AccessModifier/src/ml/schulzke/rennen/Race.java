package ml.schulzke.rennen;

public class Race {

	public static void main(String[] args) {
		
		int seconds = 3600;
		double lengthNUE = 20.832;
		
		Vehicle bicycle = new Bicycle(20);
		Vehicle car = new Car(150);
		Vehicle ambulance = new Ambulance(80);
		Vehicle racingCar = new RacingCar(200);
		Vehicle enterprise = new Enterprise(134640000);
		
		bicycle.setPos(seconds+14400);
		car.setPos(seconds);
		ambulance.setPos(seconds);
		racingCar.setPos(seconds);
		enterprise.setPos(seconds);
		
		System.out.println("---------Stundenrennen---------");
		
		System.out.println(bicycle.toString());
		System.out.println(car.toString());
		System.out.println(ambulance.toString());
		System.out.println(racingCar.toString());
		System.out.println(enterprise.toString());
		
		System.out.println("---------Nordschleife(20.8km)---------");
		
		System.out.println(bicycle.rndTime(lengthNUE));
		System.out.println(car.rndTime(lengthNUE));
		System.out.println(ambulance.rndTime(lengthNUE));
		System.out.println(racingCar.rndTime(lengthNUE));
		System.out.println(enterprise.rndTime(lengthNUE));
		
	}

}