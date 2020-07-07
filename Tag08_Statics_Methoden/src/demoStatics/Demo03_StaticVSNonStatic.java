package demoStatics;

public class Demo03_StaticVSNonStatic {

	public String non_Static_Text = "Nicht statischer Text";
	public static String static_Text = "Statischer Text";
	
	public static void main(String[] args) {
		werDarfWasStatic();
		Demo03_StaticVSNonStatic.werDarfWasStatic();
//		werDarfWasNonStatic();
//		Demo03_StaticVSNonStatic.werDarfWasNonStatic();
		
		Demo03_StaticVSNonStatic myDemo = new Demo03_StaticVSNonStatic();
		myDemo.werDarfWasNonStatic();
	}
	//statische Methode
	public static void werDarfWasStatic() {
		System.out.println(static_Text);
		/*
		 * geht nicht:
		 * Eine statische Methode kann nicht direkt auf ein nicht statisches Member zugreifen
		 */
//		System.out.println(non_Static_Text);
		Demo03_StaticVSNonStatic myDemo = new Demo03_StaticVSNonStatic();
		System.out.println(myDemo.non_Static_Text);
	}
	
	public void werDarfWasNonStatic() {
		System.out.println(static_Text);
		System.out.println(non_Static_Text);
	}
}
