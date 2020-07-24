package demoDrucker;

public class Textverarbeitung {

	
	static void druckenAufDrucker(IDrucker drucker) {
		drucker.drucken();
	}
	
	static void nimmtScanner(IScanner scan) {
		scan.scannen();
	}
	
	static void nimmtKombigeraet(IKombigeraet ik) {
		ik.drucken();
		ik.scannen();
		ik.kopieren();
	}
	
	public static void main(String[] args) {
		MeinDrucker md = new MeinDrucker();
		druckenAufDrucker(md);
		Combigeraet cg = new Combigeraet();
		druckenAufDrucker(cg);
		MeinScanner scan = new MeinScanner();
		ImplementiertScannerUndDrucker isud = new ImplementiertScannerUndDrucker();
		
		nimmtScanner(isud);
		druckenAufDrucker(isud);
//		nimmtKombigeraet(isud);
		
	}
	
}
