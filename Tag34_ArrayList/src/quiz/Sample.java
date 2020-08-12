package quiz;

public class Sample implements IInt {
	public static void main(String[] args) {
		Sample s = new Sample(); // 1
		int j = s.thevalue; // 2
		int j1 = Sample.thevalue;
		
		int k = IInt.thevalue; // 3
		int l = thevalue; // 4
		
		System.out.println(Parent.attr);
		System.out.println(Child.attr);
		
		Child.go2();
	}
}

class Parent{
	static int attr = 0;
	static void go2() {
		
	}
}

class Child extends Parent {
	
}
