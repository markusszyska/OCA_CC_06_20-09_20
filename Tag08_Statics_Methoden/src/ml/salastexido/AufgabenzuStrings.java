package ml.salastexido;

public class AufgabenzuStrings {

	
	
	
	public static void main(String[] args) {
		String vorname = "Raul Alejandro ";
		String nachname = "Salas Texido";
		String name = "";
		String kuerzel = "";
		name = vorname.concat(nachname);
		System.out.println("name= "+name);
		kuerzel = vorname.substring(0, 1) + nachname.substring(0,1);
		System.out.println("kuerzel= "+kuerzel);
	}

}
