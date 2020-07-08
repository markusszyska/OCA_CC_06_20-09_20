package ml.turairajah;
import java.util.Scanner;

public class StringUmdrehen {

	public static void main(String[] args)
{
			erste(null);	
		}
		public static void erste(String einWort) 
		{
			Scanner sc = new Scanner(System.in);
			 einWort = sc.next();
			 String fin= "";

			 for (int i = 0; i < einWort.length(); i++) 
			 {
				char c = einWort.charAt(i);
				System.out.println("V: " + c);
			
			}
			 for (int j = einWort.length()-1; j >= 0; j--) 
			 {
				 char c = einWort.charAt(j);
				System.out.println("R: " + c);			
			}
		}
}
