package kapitel1.demoEnum;
interface I{}
enum Parent{}

enum Tage /*extends Parent*/ implements I{
	MO("Montag"), DI(""); //public static final Tage MO = new Tage("Montag");
	
	String stringAttr;
	
	Tage(String stringAttr) {
		System.out.println("Enum " + this.ordinal() +" gebaut");
	}
	void go() {
		
	}
	static void staticGo() {
		
	}
}

public class DemoEnum {
	
	enum InnerEnum {}
	
	public static void main(String[] args) {
//		enum InMethod{};
		
		Tage tag = Tage.MO;
		Tage.MO.go();
		tag.go();
		
		Tage[] tage = Tage.values();
		

	}
}
