package demoGC;

public class BauernhofMain {
	public static void main(String[] args) {
		System.out.println("Programmstart");
		Stall s = new Stall();
		Kuh k = new Kuh();
		s.nonStaticKuh = k;
		k = null;
		Object o;
		System.out.println("Programmende");
		new BauernhofMain().doStuff();
	}
	
	static void go(Kuh k) {
		go2(k);
	}
	
	static void go2(Kuh k) {
		System.out.println(k);
	}
	
	void doStuff() {
		
	}
	
}
