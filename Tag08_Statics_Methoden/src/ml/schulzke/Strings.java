package ml.schulzke;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args){
		
	String name = "Schulzke";
	String fname = "Max-Georg";
	String cname = "Max-Georg Schulzke";
	String intname = fname.charAt(0)+". "+name.charAt(0)+".";
	System.out.println(name+" | "+fname+" | "+cname+" | "+intname+" | "+name.length()+" | "+fname.length()+" | "+cname.length()+" | "+intname.length());
	
    try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Text zu ASCII: ");
		String str_input = scan.nextLine();
		char[] arr_ascii = str_input.toCharArray();

		for(char ch:arr_ascii){
		    System.out.println((int)ch+"  ");
		}
	}

    for(int i=32;i<=126;i++) {
    	System.out.println("code: "+i+" char: "+(char)i);
    }
    
	}
}
