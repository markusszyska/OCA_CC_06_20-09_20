package demoEnum.enumAlsKlasse;

public class MeineEnumKlasse {

	String name;
	
	public static final MeineEnumKlasse MONTAG = new MeineEnumKlasse("Montag");
	
	private MeineEnumKlasse(String name) {
		this.name = name;
	}
}
