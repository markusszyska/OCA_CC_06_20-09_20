package listen;

public class Person implements Comparable<Person>{
	private String name;
	private int alter;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public Person(String name, int alter) {
		this.setName(name);
		this.setAlter(alter);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", alter=" + alter + "]";
	}
	
	@Override
	public int compareTo(Person o) {
		//Nach Name sortiert
//		return this.getName().compareTo(o.getName());
		//Nach Alter sortiert
		return this.getAlter() - o.getAlter();		
	}
	
	
	
}
