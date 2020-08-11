package ocaBuch;

public class Dog {

	String name;
	int weight;
	int age;

	// constructor assigns a name, weight and age
	Dog(String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	String getName() {
		return name;
	}

	int getWeight() {
		return weight;
	}

	int getAge() {
		return age;
	}

	public String toString() {
		return name + " - " + age + " - " + weight; 
	}
}
