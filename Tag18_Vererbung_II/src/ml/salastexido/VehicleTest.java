package ml.salastexido;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Program...");
		Vehicle[] vehicles = new Vehicle[6];
		
		System.out.println();
		System.out.println("3 Autos");
		
		//Autos
 		vehicles[0]= new Auto();
		vehicles[1]= new Auto();
		vehicles[2]= new Auto();
		
		System.out.println();
		System.out.println("3 MotoCycle");
		
		//MotoCycles
		vehicles[3] = new MotoCycle();
		vehicles[4] = new MotoCycle();
		vehicles[5] = new MotoCycle();
				
		for(Vehicle vehicle:vehicles) {
			vehicle.print();
		}
		System.out.println("End Program...");
		
	}

}
