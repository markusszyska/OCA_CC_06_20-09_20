package demoStatics;

public class Demo05_Stack {
	public static void main(String[] args) {
		methodA();		
	}
	
	public static void methodA() {
		System.out.println("----------------");
		System.out.println("Methode A vor B");
		methodB();
		System.out.println("Methode A nach B");
	}
	public static void methodB(){
		System.out.println("----------------");
		System.out.println("Methode B vor C");
		methodC();
		System.out.println("Methode B nach C");
	}	
	public static void methodC() {
		System.out.println("----------------");
		System.out.println("Methode C");
	}
	
}
