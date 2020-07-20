package bauernhof;

public class Kuh extends Nutztier{
	private int milchmenge;

	public int getMilchmenge() {
		return milchmenge;
	}

	public void setMilchmenge(int milchmenge) {
		this.milchmenge = milchmenge;
	}
	
	public Kuh() {
		super(10);
//		this.milchmenge=100;
		this.setMilchmenge(500);
	}
	public Kuh(int milchmenge) {
//		super();
		this.setMilchmenge(milchmenge);
	}	
	
	public String toString() {
		String ausgabe = super.toString();
		ausgabe+= "\nMilchmenge:" + this.getMilchmenge();
		return ausgabe;
	}
	public void muhen() {
		System.out.println("Muuuuhhhh");
	}
	
	@Override
	public void bewegen() {
		System.out.println("bewegen in Kuh");
	}
	@Override
	public void bewegen(int schritte) {
		System.out.println("bewegen(int schritte)");
	}
	
	public void bewegen(int...is) {
		
	}
}
