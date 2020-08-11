package demoLambda;

interface I1 {
	void go();
}
interface I2 {
	int go();
}
interface I3{
	void go(int zahl);
}
interface I4{
	void go(int zahl1, int zahl2);
}
interface I5{
	void go(int...is);
}
interface I6{
	void go(int[] arr);
}

public class DemoLambda {
	public static void main(String[] args) {
//		demo01();
//		demo02();
//		demo03();
		demo05();
		
	}

	public static void demo01() {
		/*
		 * Wenn kein Parameter vorhanden ist, muss eine leere runde Klammer vorhanden
		 * sein
		 */
		I1 i1 = () -> {};
		/*
		 * Wenn nur eine Anweisung folgt, kann die geschweifte Klammer weggelassen
		 * werden
		 */
		I1 i1a = () -> System.out.println();
		
		I1 i1b = () -> {System.out.println("Hallo");return;};
		
		I1 i1c = () -> {
			System.out.println("Hallo Welt");
			System.out.println("zweite Anweisung");
		};
		i1c.go();
		
		I1 i1d = () -> 
		System.out.println("Hallo Welt"); 		//gehoert noch zum Lambda
		System.out.println("zweite Anweisung"); //gehoert nicht mehr zum Lambda
		;
		
		i1d.go();
	}

	public static void demo02() {
		I2 i2 = () -> 10;
		I2 i2a = () -> retInt();
		/*
		 * Wenn ein return geschrieben wird,
		 * muessen geschweifte Klammern vorhanden sein
		 */
		I2 i2b = () -> {
			System.out.println("Hallo");
			return 5;
		};		
	}
	
	public static void demo03() {
		/*
		 * Bei einem Parameter kann die 
		 * runde Klammer weggelassen werden
		 */
		I3 i3 = param -> {};
		I3 i3a = (param) -> {};
		I3 i3b = (int param) -> {};
		/*
		 * Der Bezeichner des Parameters kann in der 
		 * ueberschriebenen Methode ein anderer sein
		 */
		I3 i3c = new I3() {
			@Override
			public void go(int param) {
			
			}			
		};
		
		
	}
	
	public static void demo04() {
		/*
		 * Bei mehr als einem Parameter
		 * muss eine runde Klammer vorhanden sein
		 */
		I4 i4 = (param, param2) -> System.out.println();
		I4 i4a = (int param, int param2)->{};
	}
	
	public static void demo05() {
		I5 i5 = (varArgParam) -> {
			for(int zahl : varArgParam) {
				System.out.println(zahl);
			}			
		};
		i5.go(1,2,3);
		System.out.println("-------------------");
		i5.go(1,2,3,4,5,6,7);	
		
		I5 i5a = (int... ints) -> {
			for(int zahl : ints) {
				System.out.println(zahl);
			}			
		};
		
		I5 i5b = (int[] ints) -> {
			for(int zahl : ints) {
				System.out.println(zahl);
			}			
		};
		i5b.go(1,2,3);
	}
	
	public static void demo06() {
		I6 i6 = arr -> {
			for(int i : arr) {
				System.out.println(i);
			}
		};
//		i6.go(1,2,3);
		i6.go(new int[] {1,2,3});
	}
	
	public static int retInt() {
		int erg = 10;
		return erg;
	}
	
	
	
}
