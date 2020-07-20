package bauernhof;

public class Schwein extends Nutztier{

	private String schweineRasse;

	public String getSchweineRasse() {
		return schweineRasse;
	}
	public void setSchweineRasse(String schweineRasse) {
		this.schweineRasse = schweineRasse;
	}
	
	public Schwein() {
		this.setSchweineRasse("Standardrasse");
	}
	public Schwein(String schweineRasse) {
		this.setSchweineRasse(schweineRasse);
	}
	
	public String toString() {
		String ausgabe = super.toString();
		ausgabe+= "\nSchweinerasse:" + this.getSchweineRasse();
		return ausgabe;
	}
	
	public void grunzen() {
		System.out.println("oink");
	}
	
}
