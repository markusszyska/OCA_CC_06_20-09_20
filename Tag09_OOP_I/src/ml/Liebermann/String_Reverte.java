package ml.Liebermann;

public class String_Reverte {
	public static void main(String[] args) {

		System.out.println(revert("hallo mein name ist anna "));
		
	}
	
	
	public static String revert(String orig) {
		String newString = "";
		
		for (int i = orig.length()-1; i >= 0 ; i--) {
			newString += orig.charAt(i);
			
		}
		
		return newString;
	}
	
	
}
