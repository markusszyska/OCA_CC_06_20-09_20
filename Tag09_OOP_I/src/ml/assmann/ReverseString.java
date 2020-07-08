package ml.assmann;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Geben Sie einen Satz ein der umgedreht wird:");
		String input = sc.nextLine();
		
		//For-Schleife
		System.out.println("For-Schleife:");
		System.out.println(reverseString(input));
		
		System.out.println("==========");
		
		//Rekursion
		String output = reverseStringRekursion(input, "");
		System.out.println("Rekursion:");
		System.out.println(output);
	}
	
	public static String reverseString(String input) {
		String output = "";
		for(int i=input.length()-1;i>=0;i--) {
			output += input.charAt(i);
		}			
		return output;
	}
	
	public static String reverseStringRekursion(String input, String output) {
		if(input.length()>1) output = reverseStringRekursion(input.substring(1), output);
		output += input.charAt(0);
		return output;
	}
	
}
