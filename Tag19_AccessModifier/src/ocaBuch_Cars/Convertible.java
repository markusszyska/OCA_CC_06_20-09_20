package ocaBuch_Cars;

public class Convertible extends Sportscar{

	void doThings() {
		Sportscar sc = new Sportscar();
		sc.goFast();// R - Invoking a method using a reference of the class
	}
	void doMore() {
		goFast(); // I - Invoking a inherited method		
	}
	
}
