package zeitner.destruktortest;

public class Nutztier extends MyObject implements IkannFressen{
	
	public static int anzahl = 0;
	
	String name; 
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Nutztier() {
		this("Standardnutztier");
//		System.out.println("Standardkonstruktor Nutztier durchlaufen ...");
	}

	public Nutztier(String name) {
		this.setName(name);
		Nutztier.anzahl = Nutztier.anzahl + 1;
//		System.out.println("Maximalkonstruktor Nutztier durchlaufen ...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Das Nutztier wurde aus dem Speicher entfernt ...");
		Nutztier.anzahl = Nutztier.anzahl - 1; 
	}


	@Override
	public void fressen(IEssbar essbar) {
		essbar.wirdGegessen();

		
		
	}

	

}
