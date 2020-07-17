package ml.Liebermann.Items;

public class Schluessel {
	private String schluesselCode;
	
	public Schluessel() {
	this.setSchluesselCode(String.valueOf(this.hashCode()));
	}

	public String getSchluesselCode() {
		return schluesselCode;
	}

	public void setSchluesselCode(String schluesselCode) {
		this.schluesselCode = schluesselCode;
	}
	
	
}
