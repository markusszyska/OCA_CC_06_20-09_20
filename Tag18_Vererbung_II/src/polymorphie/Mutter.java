package polymorphie;

public class Mutter {
	
	public String name = "Muttername";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void goStatic() {
		System.out.println("Mutter static");
	}
	
	public void go() {
		System.out.println("Mutter go()");
	}
	
}
