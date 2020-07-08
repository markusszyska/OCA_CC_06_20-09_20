package ml.salastexido;

import java.util.Scanner;

public class StringReverse {
	
	public static String reverse(String s) {
		String reverse = "";
		for (int i = s.length()-1; i >= 0 ; i--) {
			reverse+=s.charAt(i);}
		return reverse;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println("Original String value= " + s + " Reverse String value= " + reverse(s));
		scanner.close();
	}
}
