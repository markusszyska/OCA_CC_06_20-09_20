package demoShadowing;

public class DemoShadowing {
	static String text;
	String nonStaticText;
//	static String nonStaticText;
	public static void main(String[] args) {
		//Hier wird das Attribut angesprochen
		System.out.println(text);
		
		String text = "Hallo";
		//Hier die lokale Variable
		System.out.println(text);
		//Ueber den Klassennamen kann wieder das Attribut angesprochen werden
		System.out.println(DemoShadowing.text);
		
		
	}	
	public static void go(String text) {		
		System.out.println(text);
		System.out.println(DemoShadowing.text);
//		System.out.println(this.nonStaticText);
	}
	public void nonstaticGo(String nonStaticText) {
		System.out.println(nonStaticText);
		System.out.println(this.nonStaticText);
	}
	
}
