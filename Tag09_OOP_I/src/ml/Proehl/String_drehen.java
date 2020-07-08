package ml.Proehl;

import java.util.Scanner;

public class String_drehen
{

  public static String umkehren( String str )
  {
    String umgekehrt = new String();

    for ( int i = str.length()-1; i >= 0; i-- )
      umgekehrt += str.charAt(i);

    return umgekehrt;
  }

  public static void main ( String[] args )
  {
	String eingabe = "";
	Scanner sc = new Scanner(System.in);
	System.out.println("Text zum drehen eingeben!");
	eingabe = sc.nextLine();
    System.out.println( umkehren( eingabe ) );
  }
}
