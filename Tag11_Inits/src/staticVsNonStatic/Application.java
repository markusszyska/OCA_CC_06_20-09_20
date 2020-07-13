package staticVsNonStatic;

public class Application {  
	public static void main(String[] args) {
		Person.staticGo();
		Person p1 = new Person();
		p1.nonStaticGo();
		//Aus:
		p1.staticGo();   
		//Macht der Compiler
		Person.staticGo();  
		
//		Person p2 = new Person();
//		p2.nonStaticGo();
	}
}
class Person{
	public static String staticText = "static";
	public String nonStaticText = "nonstatic";
	
	public static void staticGo() {
//		System.out.println(this.nonStaticText);
		Person p1 = new Person();
		System.out.println(new Person().nonStaticText);
		System.out.println(p1.nonStaticText);
		new Person().nonStaticGo();
		p1.nonStaticGo();		
	}
	public void nonStaticGo() {
		System.out.println(this.nonStaticText);
		System.out.println(this.staticText);
	}
	
	
	
}