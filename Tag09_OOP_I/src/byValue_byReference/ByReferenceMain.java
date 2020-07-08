package byValue_byReference;

public class ByReferenceMain {

	public static void main(String[] args) {
		int meineZahl = 1;
		byValue(meineZahl);
		System.out.println(meineZahl);
		
		ReferenzA ra = new ReferenzA();
		ra.name = "ein Name";
		System.out.println("ReferenzA name : " + ra.name);
		byReference(ra);
		System.out.println("ReferenzA name : " + ra.name);
		
	}
	
	public static void byValue(int zahl) {
		System.out.println("Uebergebene Zahl: " + zahl);
		zahl = 100;
		System.out.println("Zahl geaendert: " + zahl);
	}
	
	public static void byReference(ReferenzA param) {
		param.name = "geaendert";
	}
}
