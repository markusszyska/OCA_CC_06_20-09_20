package polymorphie;

public class Tochter extends Mutter {
	public String name = "Tochtername";
	/*
	 * The method goStatic() of type Tochter must override or implement a supertype
	 * method
	 */	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
	public static void goStatic() {
		System.out.println("Tochter static");
	}

	@Override
	public void go() {
		System.out.println("Tochter go()");
	}
	
	public void go2() {
		super.go();
	}
}
