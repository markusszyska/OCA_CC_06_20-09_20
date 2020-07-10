package ml.salastexido;




public class MotorVehicle {

	private int size;
	private int weight;
	private String carBrand;
	private Person finalClient;
	private Address startAddress;
	private Address endAddress;
	 

	
	

	public MotorVehicle(int size, int weight, String carBrand, Person finalClient, Address startAddress,
			Address endAddress) {
		this.size = size;
		this.weight = weight;
		this.carBrand = carBrand ;
		this.finalClient = finalClient;
		this.startAddress = startAddress;
		this.endAddress = endAddress;
	}



	public MotorVehicle(int size, int weight, Person person, Address a1, Address a2) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.weight = weight;
		this.carBrand="";
		this.finalClient = person;
		this.startAddress = a1;
		this.endAddress  = a2;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public String getCarBrand() {
		return carBrand;
	}



	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}



	public Person getFinalClient() {
		return finalClient;
	}



	public void setFinalClient(Person finalClient) {
		this.finalClient = finalClient;
	}



	public Address getStartAddress() {
		return startAddress;
	}



	public void setStartAddress(Address startAddress) {
		this.startAddress = startAddress;
	}



	public Address getEndAddress() {
		return endAddress;
	}



	public void setEndAddress(Address endAddress) {
		this.endAddress = endAddress;
	}



	public void printMotorVehicle() {
		System.out.println("Höhe x Breite x Tiefe= " + this.size + " cm");
		System.out.println("Gewicht= " + this.getWeight() + " kg");
		if(!this.getCarBrand().isEmpty()) System.out.println("Automarke= " + this.getCarBrand());
		System.out.println("Absenderadresse= " + this.getStartAddress().printAddress() );
		System.out.println("Zieladresse= " + this.getEndAddress().printAddress());
		System.out.println("\n");
		
	}
}
