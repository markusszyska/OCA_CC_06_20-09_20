package demoStrings;

public class Demo01a_Stringumwandlung {
	public static void main(String[] args) {
		int a = 12;
		float f = 1.15f;
		
		String aString = "" + a;
		System.out.println(aString);
		String fString = "" + f;
		System.out.println(fString);
		
		String aString2 = String.valueOf(a);
		System.out.println(aString2);
		String fString2 = String.valueOf(f);
		System.out.println(fString2);
		
		System.out.println("----------Umwandlung II---------");
		//String -> boolean
		String boolString = "tRue";
		boolean bool = Boolean.parseBoolean(boolString);
		System.out.println(bool);
		if(bool) {
			System.out.println("bool = true");
		}else {
			System.out.println("bool = false");
		}
		String boolString2 = "treu";
		boolean bool2 = Boolean.parseBoolean(boolString2);
		System.out.println(bool2);
		
		String byteString = "1231";
		byte byt = Byte.parseByte(byteString);
		System.out.println(byt);
		
		String doubString = "1.5";
		double doub = Double.parseDouble(doubString);
		System.out.println(doub);
		
		String s = "hallo";
		//Fuehrt zu einem Laufzeitfehler
		int i = Integer.parseInt(s);
		
		
		
		
		
		
	}
}
