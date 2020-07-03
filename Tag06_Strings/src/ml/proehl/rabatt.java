package ml.proehl;

import java.util.Scanner;

public class rabatt
{
	public static void main (String args[])
    {
        int st;
        double pr;
        double ge;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Stückzahl ein :");
        st = eingabe.nextInt();
        
        System.out.println("Bitte geben Sie den Stückreis an :");
        pr = eingabe.nextDouble();

        if (st >= 5 && st <=49 ) 
        {
        	ge=(st*pr)-((((st*pr)/100)*5));
        	System.out.println("Gesamtbetrag: " + ge);
        }
        else if (st >= 50  ) 
        {
        	ge=(st*pr)-((((st*pr)/100)*10));
        	System.out.println("Gesamtbetrag: " + ge);
        }
        else
        {
        	ge=(st*pr);
        	System.out.println("Gesamtbetrag: " + ge);
        }
       
    }
}

