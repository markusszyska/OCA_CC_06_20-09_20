package ml.salastexido;

public class CheckPassword {

	public static boolean checkPassword(String password) {
		boolean result=false;
		if(password.length()<10) {
			result=false;
		}else {
			char c;
			int counter = 0;
			for (int i = 0; i < password.length(); i++) {
				c = password.charAt(i);
				if(Character.isUpperCase(c)) {
					counter++;
				}
				else if(Character.isDigit(c)) {
					counter++;
				}
				result=(counter>=2) ? true:false;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String password = "aaaddd1fhfjfhfjfA";
		System.out.println(checkPassword(password));
	}
	
}
