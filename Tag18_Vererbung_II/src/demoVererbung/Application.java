package demoVererbung;

public class Application {	
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
	
//		c = p;
		parent = child;
		child.setName("");
		child.name = "";

		Object o = new Child();
		Parent p1 = new Child();
		Child c2 = new Child();

		go(new Child());
		go(new Child2());
		go(new Parent());
		
	}

	public static void go(Parent p) {
		System.out.println(p.getClass().getSimpleName());
		p.goParent();
	}

	public static Parent go2() {
//		return new Child();
//		return new Child2();
		return new Parent();
	}
}

class Parent {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void goParent() {
		System.out.println("goParent() Parent");
	}
}

class Child extends Parent {
	public void goParent() {
		System.out.println("goParent() Child");
	}
}

class Child2 extends Parent {

}