package Rajaobelina;
import java.util.*;

public class Banka {

    public static Scanner input = new Scanner(System.in);
    // 
    public static String checkID(String Zugangsnummer, String Password)
    {
        String Ergebnis = "Sie haben die falschen Daten eingetragen; bitte versuchen Sie erneut";

        String Lena_Warner = "45368735 randompassword 4243.34";
        String Timo_Schulz = "89098746 randompassword2 2343.23";
        String Gaston_Ramirez = "63567848 randompassword3 432.4";

        if (Zugangsnummer.equals(Lena_Warner.substring(0, Lena_Warner.indexOf(" "))) && 
        		Password.equals(Lena_Warner.substring(Lena_Warner.indexOf(" ")+1,Lena_Warner.lastIndexOf(" "))))
            return Ergebnis = Lena_Warner.substring(Lena_Warner.lastIndexOf(" ") + 1);

        if (Zugangsnummer.equals(Timo_Schulz.substring(0, Timo_Schulz.indexOf(" "))) && 
                Password.equals(Timo_Schulz.substring(Timo_Schulz.indexOf(" ")+1,Timo_Schulz.lastIndexOf(" "))))
            return Ergebnis = Timo_Schulz.substring(Timo_Schulz.lastIndexOf(" ") + 1);

        if (Zugangsnummer.equals(Gaston_Ramirez.substring(0, Gaston_Ramirez.indexOf(" "))) && 
        		Password.equals(Gaston_Ramirez.substring(Gaston_Ramirez.indexOf(" ") + 1,Gaston_Ramirez.lastIndexOf(" "))))
            return Ergebnis = Gaston_Ramirez.substring(Gaston_Ramirez.lastIndexOf(" ") + 1);

        return Ergebnis;
    }

    public static int menu()
    {
        int Operation;
        do
        { 
            System.out.print("\nBitte wählen Sie eine Aktion"
                    + "\n 1. Kontostand \n 2. Einzahlen"
                    + "\n 3. Abheben\n 4. Exit\n\n");

            Operation = input.nextInt();

            if (Operation < 1 || Operation > 4){
                System.out.println("Fehler! Bitte wählen Sie eine passende Operation!");
            }

        }while (Operation < 1 || Operation > 4);

        return Operation;
    }

    public static void Kontostand(double x)
    {
        System.out.printf("\nSie verfüger gerade über €%.2f\n", x);
    }

    public static double einzahlung(double x, double y)
    {
        double Einzalung_ = y, Kontostand_ = x;
        double neueKontostand = Einzalung_ + Kontostand_;

        System.out.printf("Sie verfüger gerade über €%.2f\n",  neueKontostand);

        return neueKontostand;
    }

    public static double abhebung(double x, double y)
    {
        double Abheben_ = y, Kontostand_ = x, neueKontostand;

        neueKontostand = Kontostand_ - Abheben_;
        System.out.printf("Sie verfüger gerade über € %.2f\n",neueKontostand);

        return neueKontostand;  
    }

    public static void main(String[] args) {

        String Zugansnummer, pass, Kontostand = "Fehler";
        int count = 0, Aktion = 0;
        double Einzahlung_ = 0, Abhebung_ = 0, neue_Kontostand=0; 
        boolean  erneut;
        
        
        do{
            erneut = false;
            System.out.println("Tragen Sie bitte Ihre Zugansnummer ein: ");
            Zugansnummer = input.next();

            System.out.println("Tragen Sie bitte Ihre Password: ");
            pass = input.next();

            Kontostand = checkID(Zugansnummer, pass);

            count++;

            if (count >= 3 && Kontostand.equals("Fehler")){
                System.out.print("Sie haben keine Login-Versuche mehr.");
                System.exit(0);
            }
            if (!(Kontostand.equals("Fehler"))){
                System.out.println("\nSie verfüger gerade über € "+ Kontostand);
            }
            else
                System.out.println(Kontostand);


        }while(Kontostand.equals("Fehler!"));

        neue_Kontostand=Double.parseDouble(Kontostand);
        
        while (Aktion != 4)
        { 
            Aktion =menu();
            switch (Aktion)
            {
            case 1:
                Kontostand(neue_Kontostand);
                break;
            case 2:
                System.out.print("\nWie viel Geld möchten Sie einzahlen? ");
                Einzahlung_ = input.nextDouble();
                neue_Kontostand=einzahlung(Einzahlung_, neue_Kontostand);
                break;
            case 3:
                System.out.print("\nWie viel Geld möchte Sie abheben? ");
                Abhebung_ = input.nextDouble();

                while(Abhebung_>neue_Kontostand){
                    System.out.print("FEHLER: IHREN BEITRAG REICHT NICHT AUS!! "
                            + "BITTE WÄHLEN SIE EINEN NEUEN BEITRAG: €");
                    Abhebung_ = input.nextDouble();
                }

                neue_Kontostand = abhebung(neue_Kontostand, Abhebung_);
                break;
            case 4:
                System.out.print("\nAuf Wiedersehen und einen schönen Tag noch!");
                System.exit(0);
                break;
            }
        }
    }
}