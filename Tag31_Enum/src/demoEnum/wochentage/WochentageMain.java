package demoEnum.wochentage;

public class WochentageMain {
	public static void main(String[] args) {
		/*
		 * enums bringen Typsicherheit
		 */
		machWasMitEinemTag("Banane");
		machWasMitWochentag(Wochentag.DI);
		/*
		 * Die Referenz, die hinter dem statischen Attribut steckt
		 * herausholen in eine lokale Variable
		 */
		Wochentag meinTag = Wochentag.MON;
		System.out.println(meinTag == Wochentag.MON);
		
		System.out.println("-----------enum class----------");
		System.out.println(meinTag.getClass().getSimpleName());
		System.out.println("-------------------");
		Wochentag.gibAlleTageAus();
		System.out.println("-------------------");
		
		/*
		 * Instanzmethoden ueber die Objekte, die hinter den statischen
		 * Attributen stecken ausfuehren
		 */
		Wochentag.MON.nonStaticInEnum();
		Wochentag.DI.nonStaticInEnum();
		/*
		 * Instanzmethoden vom Interface ueber die Objekte, die hinter
		 * den statischen Attributen stecken ausgefuehrt
		 */
		Wochentag.MON.defMethodInInterface();
		Wochentag.MON.nonDefaultInInterface();
		
		I1 i1 = meinTag;
		I1 i2 = Wochentag.DO;
		
		
		
	}
	
	public static void machWasMitWochentag(Wochentag tag) {
		System.out.println(tag);
	}
	
	public static void machWasMitEinemTag(String tag) {
		if(tag.equalsIgnoreCase("Mon")) {
			System.out.println("Ich hasse Montage");
		}
	}
}
