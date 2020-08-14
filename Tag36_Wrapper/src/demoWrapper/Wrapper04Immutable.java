package demoWrapper;

public class Wrapper04Immutable {

	public static void main(String[] args) {
		//Wrapper sind immutable
		Integer i = 567;
		Integer i2 = i;
		
		System.out.println(i + " " + i2);
		System.out.println("i == i1: " + (i == i2));
		System.out.println("i.equals(i2): " + i.equals(i2));
		
		i++; // unwrap, use, rewrap
		System.out.println(i + " " + i2);
		System.out.println("i == i1: " + (i == i2));
		System.out.println("i.equals(i2): " + i.equals(i2));
		
		//Zeile 14 ausfuehrlich
		int x = i.intValue(); 	//unwrap
		x++;					//use
		i = new Integer(x);		//rewrap
	}
	
}
