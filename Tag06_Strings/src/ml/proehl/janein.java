package ml.proehl;

import java.util.Scanner;

public class janein 
{
	public static void main (String args[], String J, String j, String N, String n)
    {
        String e;
        Scanner eingabe = new Scanner(System.in) ;
        e = eingabe.toString();
        {
           	System.out.println("Sie haben mit ja geantwortet");
        }
			
		{
        if (e == J || e == j ) 
		
        {
        	System.out.println("Sie haben mit ja geantwortet");
        }
        else if (e == N || e == n )
        {
        	System.out.println("Sie haben mit nein geantwortet");
        }
        else
        {
        	System.out.println( "Sie haben eine falsche Eingabe gemacht");
        }
        }
       
    }
}

