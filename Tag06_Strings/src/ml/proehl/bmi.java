package ml.proehl;

import java.util.Scanner;

public class bmi 
{
	public static void main (String args[])
    {
        double kg;
        double m;
        double bmi;
        int a;
        
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihr Gewicht in KG ein :");
        kg = eingabe.nextDouble();
        
        System.out.println("Bitte geben Sie ihre Größe in M ein :");
        m = eingabe.nextDouble();

        bmi = kg/(m*m);
        
        System.out.println("Bitte geben Sie ihre Alter an :");
        a = eingabe.nextInt();
        
        
        if (a >= 19 && a <=24 && bmi >= 19 && bmi <=24   ) 
        {
        	  System.out.println("Alles super ihr BMI beträgt " + (int)bmi);
        }
        else if (a >= 25 && a <=34 && bmi >= 20 && bmi <=25   ) 
        {
        	  System.out.println("Alles super ihr BMI beträgt " + (int)bmi);
        }
        else if (a >= 35 && a <=44 && bmi >= 21 && bmi <=26   ) 
        {
        	  System.out.println("Alles super ihr BMI beträgt " + (int)bmi);
        }
        else if (a >= 45 && a <=54 && bmi >= 22 && bmi <=27   ) 
        {
        	  System.out.println("Alles super ihr BMI beträgt " + (int)bmi);
        }
        else if (a >= 55 && a <=64 && bmi >= 23 && bmi <=28   ) 
        {
        	  System.out.println("Alles super ihr BMI beträgt " + (int)bmi);
        }
        else if (a >= 64 && bmi >= 24 && bmi <=29   ) 
        {
        	  System.out.println("Alles super ihr BMI beträgt " + (int)bmi);
        }
        else
        {
        	  System.out.println("Achtung!!! Ihr BMI beträgt " + (int)bmi + " suchen Sie bitte dringend einen Arzt auf.");
        }
       
    }
}