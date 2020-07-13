package objektVergleich;

public class Person {
	public String name;
	
	public boolean equals(Person p) {
		boolean eq = false;
		eq = this.name.equals(p.name);
		return eq;
	}
}
