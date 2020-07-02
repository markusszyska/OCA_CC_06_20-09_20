package ml.Proehl;
import java.util.Scanner;
public class  Zeit 
	{
		public static void main(String[] args) 	
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Bitte Sekunden eingeben");
			int zahl = sc.nextInt();
			int tage = zahl/86400;
			int stunde = (zahl/3600)%24;
			int minute = (zahl/60)%1440;
			int sekunde = zahl%60;
			System.out.println( zahl + " Sekunden sind " + tage +  "Tag(e) , " + stunde + "Stunde(n), " + minute + " Minute(n) und " + sekunde + " Sekunde(n)."
);
		
		}
	}