package zeitner.Exception_01;

public class ExceptionDemo {

	public static void main(String[] args) {
		String a = null;
//		
//		System.out.println(a.toUpperCase());
		
		try {
			System.out.println(1/0);
			System.out.println(a.toUpperCase());	
		} catch(NullPointerException e) {
			System.out.println("NPE aber ist mir egal ... mache mit leerem String weiter ...");
			a = "";
			System.out.println(a.toUpperCase());
		} catch(ArithmeticException e) {
			System.out.println("AE aber ist mir egal ... mache mit 1 als Teiler weiter ...");
			System.out.println(1/1);
		}


		
		

	}

}
