package uebung;

public class Uebung {

	public static void main(String[] args) {
		System.out.println("-------------b1-----------");
		boolean b1 = (retTrue() || retFalse()) || retFalse() && retTrue();
		
		System.out.println("------------b2------------");
		boolean b2 = (retFalse() & retTrue()) && (retFalse() || retTrue());
		
		System.out.println("------------b3------------");
		boolean b3 = (retFalse() && retTrue()) & (retTrue() | retTrue());
		
		System.out.println("-------------b4-----------");
		boolean b4 = (retTrue() | retTrue()) | (retFalse() && retTrue());
		
		System.out.println("-----------b5-------------");
		boolean b5 = retFalse() | (retTrue() || retFalse()) && retTrue();
		
		System.out.println("------------b6------------");
		boolean b6 = retTrue() && retTrue() || retFalse() && retFalse();
		
		System.out.println("------------b7------------");
		boolean b7 = retTrue() | (retTrue() & retFalse() && retTrue());
		
		System.out.println("------------b8------------");
		boolean b8 = retFalse() && retTrue();
		
		System.out.println("------------b9------------");
		boolean b9 = retTrue() && retTrue() | retFalse() && retFalse();
		System.out.println("b9: "+ b9);
		System.out.println("test " + (retTrue() && retFalse() | retTrue()));
	}
	
	public static boolean retTrue() {
		System.out.println("true");
		return true;
	}

	public static boolean retFalse() {
		System.out.println("false");
		return false;
	}
}
