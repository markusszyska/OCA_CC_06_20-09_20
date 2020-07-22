package demoAccessMods_II;

public class ElternKlasse {

	private void doStuff() {
		System.out.println("doStuff in Elternklasse");
	}
	
	public void go() {
		this.doStuff();
	}
}
