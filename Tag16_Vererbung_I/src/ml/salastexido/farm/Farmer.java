package ml.salastexido.farm;

public class Farmer {
	private int id;
	private Farm farm;
	private String name;
	private double amountCash;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Farm getFarm() {
		return farm;
	}
	public void setFarm(Farm farm) {
		this.farm = farm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Farmer(int id, Farm farm, String name) {
		super();
		this.id = id;
		this.amountCash = 0;
		this.farm = farm;
		this.name = name;
	}
	public double getAmountCash() {
		return amountCash;
	}
	public void setAmountCash(double amountCash) {
		this.amountCash = amountCash;
	}
	
	
}
