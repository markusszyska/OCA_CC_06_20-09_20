package polymorphie;

public class Application {
	public static void main(String[] args) {
		Mutter m = new Tochter();
		Tochter t = new Tochter();
		
		System.out.println(m.name);
		System.out.println(t.name);
		
		System.out.println("------------------------");
		System.out.println("m.name: " + m.name);
		System.out.println("((Tochter)m).name "+((Tochter)m).name);
		
		t.setName("neuer Tochtername");
		System.out.println("t.name: "+ t.name);
		System.out.println("((Mutter)t).name "+((Mutter)t).name);
		
		
		System.out.println("-----------static-------------");
		Mutter.goStatic();
		Tochter.goStatic();
		
		Mutter m1 = new Tochter();
		Tochter t1 = new Tochter();
		Mutter m2 = new Mutter();
		
		
		m1.goStatic();
		Mutter.goStatic();
		t1.goStatic();
		Tochter.goStatic();
		
		m1.go();
		t1.go();
		m2.go();
		
		t1.go2();
	}
}
