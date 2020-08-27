package kapitel2.polymorphie.p01operationen;

public class Bruch implements IPrintable{
	private int nenner;
	private int zaehler;
	
	public Bruch(int nenner, int zaehler) {
		this.nenner = nenner;
		this.zaehler = zaehler;
	}
	
	public void print(){
		System.out.printf("Der Wert des Quotienten von "
				+ "%d und %d ist %d / %d\n", zaehler, nenner, zaehler, nenner);
	}
	
}
