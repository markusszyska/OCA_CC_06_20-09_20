package ocaBuch_Cars;

public class Driver {

	void doDriverStuff() {
		Sportscar sc = new Sportscar();
		sc.goFast(); // R - Invoking a method using a reference of the class
		
		Convertible con = new Convertible();
		con.goFast(); // R - Invoking a method using a reference of the class
		
	}
}
