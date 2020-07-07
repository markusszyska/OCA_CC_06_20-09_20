package demoStatics;

public class Demo04_Konstanten {

	public static final String STATICNAME = "statischer Name";
	
	public static void main(String[] args) {
		final float PI = 3.141F;
		/*
		 * geht nicht, da eine Konstante nach der Initialisierung
		 * nicht mehr geaendert werden kann.
		 */
//		PI = 1.5F;
		
		System.out.println(STATICNAME);
		System.out.println(Demo04_Konstanten.STATICNAME);
		
//		STATICNAME = "neuer Name";
		
	}
	
}
