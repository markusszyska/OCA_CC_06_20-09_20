package kapitel1.accessModifiers.memberSicht.paket5.pak1;

import kapitel1.accessModifiers.memberSicht.paket5.pak2.Child;

public class Parent {
	
	int go() {
		System.out.println("go Parent");
		return 0;
	}
	public static void main(String[] args) {
		Other o = new Other();
		o.doStuff();
	}
}

class Other{
	void doStuff() {
		Parent p = new Child();
		p.go();
	}
}