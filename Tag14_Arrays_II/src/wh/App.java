package wh;

public class App {

	public static void main(String[] args) {
		Schwein s1 = retSchwein();
		Schwein s2 = new Schwein();
		nimmtSchwein(s2);
		System.out.println(s2);
	}
	
	static void nimmtSchwein(Schwein s) {
		s = null;
	}
	
	static Schwein retSchwein() {
		return null;
	}
	
	
}
class Schwein{
	
	static String text;
	static String text2 = text;
	
	public Schwein() {
		// TODO Auto-generated constructor stub
	}
	String name;
	String name2 = name;
	
	void machLaut() {
		
	}
	int gewicht;
	
	
}