package quiz;

public class Test {
	public static void main(String[] args) {
		int a = 10;
	      int b = 20;
	      a += (a = 4);
	      a = a +(a=4);
	      b = (b = 5) + (b * b);
	      System.out.println(a+ ",  "+b);
	}
}
