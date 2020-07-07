package ml.assmann;

public class StringsAufgabe5 {
	public static void main(String[] args) {
				
		//Header
		System.out.println("Dezimalzahl\tZeichen\t\tDezimalzahl\\tZeichen");
		
		//Contents
		System.out.println("32\t\tLeerzeichen\t80\t\tP");
		for(int i = 33, j = 81;i<79;i++,j++) {
			System.out.println(i + "\t\t" + (char)i + "\t\t" + j + "\t\t" + (char)j);
		}
		System.out.println("79\t\tO\t\t127\t\tLoeschen");
		
	}
}
