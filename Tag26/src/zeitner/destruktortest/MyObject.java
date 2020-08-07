package zeitner.destruktortest;

public class MyObject{
	
	public static int anzahl = 0;
	
	public MyObject() {
		super();
		MyObject.anzahl = MyObject.anzahl + 1;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Das myObject wurde aus dem Speicher entfernt ...");
		MyObject.anzahl = MyObject.anzahl - 1; 
	}
}
