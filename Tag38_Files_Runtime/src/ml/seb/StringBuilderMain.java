package ml.seb;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class StringBuilderMain {
	
	public static void  main(String[] args) {
		
		System.out.println("--------------------------- AUFGABE 1 ---------------------------");
		String[] word = new String[] {"Haus"};
		String[] reverseWord = reverseString(word);
		System.out.println(Arrays.toString(reverseWord));

		
		System.out.println("--------------------------- AUFGABE 2 ---------------------------");
		
		Scanner input = new Scanner(System.in); //System.in is a standard input stream  
		
		System.out.print("Bitte String eingeben: ");  
		String inStr = input.nextLine();   
		
		String outStr = swapAdjacentPairs(inStr);
		System.out.println(outStr);

		
		System.out.println("--------------------------- AUFGABE 3 ---------------------------");
	
		System.out.print("Bitte Name-Wert-Paar in der Form 'Name-Wert' eingeben: ");  
		String inStr2 = input.nextLine();  
		
		String intStr2Sub = new String();
		String intStr3Sub = new String();
		
		if(inStr2.contains("=")) {
			
			int pos = inStr2.indexOf("=");
			
			intStr2Sub = inStr2.substring(0, pos);
			intStr3Sub = inStr2.substring(pos+1, inStr2.length());
			
			System.out.println("intStr2Sub: " + intStr2Sub);
			System.out.println("intStr3Sub: " + intStr3Sub);
			
			
		} else {
			System.out.print("Bitte Name-Wert-Paar in der Form 'Name-Wert' eingeben!");
			System.exit(0);
		}
		
		
		System.out.println("--------------------------- AUFGABE 4 ---------------------------");
		
		System.out.print("Bitte posistive dezimale Ganzzahl eingeben: ");
		int decNum = input.nextInt();
		System.out.println(decNum);
		
        int m;
        String binaryStr = "";
        
		while(decNum > 0) {
			
			int tmp = decNum % 2;
			binaryStr = tmp + binaryStr;
			decNum = decNum / 2;
		}
		
		System.out.println(binaryStr);

		
	}
	
	// Aufgabe 1
	public static String[] reverseString(String[] word) {
		
	    String[] t = new String[word.length];
	    
	    for (int i = 0; i < word.length; i++) {
            t[i]= new StringBuilder(word[i]).reverse().toString();
        }
	    
	    return t;
	}
	
	// Aufgabe 2
	public static String swapAdjacentPairs(String s) {
		
	    StringBuilder sb = new StringBuilder(s);
	    // divide 2 and then multiply by 2 to handle cases where the string length is odd
	    // we always want an even string length
	    // also note the i += 2
	    for (int i = 0 ; i < (s.length() / 2 * 2); i += 2) {
	        swapAdjacent(sb, i);
	    }
	    return sb.toString();
	}
	
	private static void swapAdjacent(StringBuilder sb, int index) {
		
	    char x = sb.charAt(index);
	    sb.setCharAt(index, sb.charAt(index + 1));
	    sb.setCharAt(index + 1, x);
	}

	






}
