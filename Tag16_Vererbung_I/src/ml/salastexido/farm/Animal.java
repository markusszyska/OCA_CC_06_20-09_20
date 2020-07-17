package ml.salastexido.farm;

public abstract class Animal {
	private int id;
	private String name;
	private int weight;
	private double price;
	
	
	
	/**
	 * @param id
	 * @param name
	 * @param weight
	 * @param price
	 */
	public Animal(int id, String name, int weight, double price) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
