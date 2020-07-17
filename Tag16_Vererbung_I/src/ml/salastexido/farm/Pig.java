package ml.salastexido.farm;

public class Pig extends Animal{
	public int age;
	
	/**
	 * @param weight
	 * @param age
	 */
	public Pig(int id, String name, int weight, double price, int age) {
		super(id,name,weight,price);
		this.age = age;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pig [age=" + age + ", getId()=" + getId() + ", getName()=" + getName() + ", getWeight()=" + getWeight()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
	
	
	
}
