package demoArray;

public class DemoVarArgs {
	public static void main(String[] args) {
		int[]zahlen = {1,2,3,4};
		nimmtArray(zahlen);
		
		varArgs(1,34,35,36);
		varArgs(1,2,3);
		varArgs(1,2);
		varArgs(zahlen);
		varArgs(zahlen,zahlen);
		varArgs(zahlen, 1,2);
		
	}

	public static void normaleParams(int x, int y) {
		System.out.println("Das Ergebnis ist: " + (x+y));
	}

	public static void normaleParams(int x, int y, int z) {
		System.out.println("Das Ergebnis ist: " + (x + y + z));
	}
	
	public static void nimmtArray(int[] zahlen) {
		
	}
//	public static void varArgs(int...varArgParam) {
//		int[] werte = varArgParam;
//		int erg = 0;
//		for(int zahl : varArgParam) {
//			erg += zahl;
//		}
//		System.out.println("Summe = " + erg);
//	}
	public static void varArgs(String s, int...is) {
		
	}
	public static void varArgs(int[]zahlen, int...is) {
		
	}
	//Der varArg Parameter muss als letztes stehen
//	public static void varArgs(int...is, int zahl) {}
	
//	public static void varArgs(int zahl, int...is) {}
	
	public static void varArgs(int zahl,int zahl2, int...is) {}
	
//	public static void varArgs(String...strings, int...is) {}
}
