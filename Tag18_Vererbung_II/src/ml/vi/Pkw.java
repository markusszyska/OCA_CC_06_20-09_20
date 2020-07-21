package ml.vi;

class Pkw extends Fahrzeug {
	private String fahrzeugtyp = "Pkw";
	private String modellBezeichnung;

	public Pkw() {
		System.out.print("Geben Sie die Modellbezeichnung ein: ");
		modellBezeichnung = scanner.next();
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Fahrzeugtyp : " + fahrzeugtyp);
		System.out.println("Modellbezeichnung : " + modellBezeichnung);
	}
}