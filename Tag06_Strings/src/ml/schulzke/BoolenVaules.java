package ml.schulzke;

public class BoolenVaules {
	public static void main(String[] args) {
		System.out.println("Logische Operatoren:");
		System.out.println("====================");
		//intialisieren der booleans
		boolean bool1 = true,bool2 = true;
		
		
		for (int i=0;i<=1;i++) {
			//wecheseln zwischen true und false
			bool1 ^= true;
			
			for (int a=0;a<=1;a++) {
			//wecheseln zwischen true und false
			bool2 ^= true;
				System.out.println(bool1+" && "+bool2+" liefert "+(bool1&&bool2));
				System.out.println(bool1+" || "+bool2+" liefert "+(bool1||bool2));
				System.out.println(bool1+" ^ "+bool2+" liefert "+(bool1^bool2)+"\n");
			}
			
		}
	}
}
