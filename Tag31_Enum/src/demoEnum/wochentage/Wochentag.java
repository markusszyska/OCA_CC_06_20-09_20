package demoEnum.wochentage;

/*
 * Enums koennen nicht erben
 * aber interfaces implementieren
 */
public enum Wochentag implements I1{
	/*
	 * enum ist ein Schluesselwort
	 * 
	 * enum ist eine spezielle Art von Klasse
	 * 
	 * Jedes Enum ist eine Klasse, die der Compiler
	 * automatisch von java.lang.Enum ableitet
	 * 
	 * Enum selber ist dann von Object abgeleitet
	 */
	MON,DI,MI,DO,FR,SA,SO;
	
	public static void gibAlleTageAus() {
		Wochentag[] tage = Wochentag.values();
		for(Wochentag tag : tage) {
			System.out.println(tag.toString());
			if(tag == Wochentag.MON) {
				System.out.println("Ich hasse Montage");
			}
		}
	}
	
	public void nonStaticInEnum() {
		System.out.println(this.name() + " sagt Hallo Welt");
		System.out.println("nonStatic in Enum");
	}
	@Override
	public void nonDefaultInInterface() {
		System.out.println("abstrakte Methode vom Interface implementiert");
	}
	
	public void defMethodInInterface() {
		System.out.println("Ueberschriebene default Methode aus dem Interface");
	}
}

class A{
	
}
interface I1{
	void nonDefaultInInterface();
	default void defMethodInInterface() {
		System.out.println("default Methode im Interface");
	}
}
