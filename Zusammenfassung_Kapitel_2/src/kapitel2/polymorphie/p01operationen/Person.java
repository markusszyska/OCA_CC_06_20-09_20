package kapitel2.polymorphie.p01operationen;

public class Person {
	private String name, vorname;
	private int alter;

	public Person(String name, String vorname, int alter) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
	}
	
	public void print() {
		System.out.println("Person [name=" + name + ", vorname=" + vorname + ", alter="
				+ alter + "]");
	}
	
}
