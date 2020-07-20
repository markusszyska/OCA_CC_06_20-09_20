package demoVererbung;

public class App {
	public static void main(String[] args) {
		Child c = new Child();
		c.laufen();
		c.name = "Name";
	}
}

class Parent {
	public String name;

	public void laufen() {
	}

	public Parent() {

	}
}

class Child extends Parent {
	public Child() {
		this("");
//		super();
	}
	public Child(String name) {
		super();
	}
}