package ml.schulzke;

public class TurnAround {

	public static void main(String[] args) {
		System.out.println(turnAround("nenneoK"));
		System.out.println(turnAround("eiS"));
		System.out.println(turnAround("sad"));
		System.out.println(turnAround("nesel"));
		System.out.println(turnAround("?nenhciezegarF"));
		System.out.println(turnAround(""));
	}
	
	public static String turnAround(String input) {
		String output = "";
		
		for(int i=0;i<input.length();i++) {
			output += input.charAt((input.length()-i)-1);
			
			}
		if(input=="") {
			output = "Ohne INPUT geht hier ja nüscht!";
		}
		
		return output;
	}
}
