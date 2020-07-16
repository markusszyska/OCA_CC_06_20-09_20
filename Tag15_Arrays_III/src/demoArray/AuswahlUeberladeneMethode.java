package demoArray;

public class AuswahlUeberladeneMethode {

	public static void main(String[] args) {
		byte b = 10;
		byte b1 = 10;
		
//		go(b,b1);
		go(b, new byte[1]);
	}

//	public static void go(int x, int y) {
//		System.out.println("int Parameter");
//	}
	
//	public static void go(short s,short s2) {
//		System.out.println("short Param");
//	}
	
	public static void go(byte...bs) {
		System.out.println("byte varArg");
	}
	public static void go(byte b1, byte...bs) {
		System.out.println("byte varArg");
	}
	
	public static void go(short...bs) {
		System.out.println("short varArg");
	}
}






