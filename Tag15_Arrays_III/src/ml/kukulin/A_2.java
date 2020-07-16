package ml.kukulin;

import java.util.Scanner;

public class A_2 {
	
	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Geben Sie 6 Zahlen :");
		
		
		
     

       int[] zahl = new int[6];
       int[] zahlNeu = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("zahl eingeben " + (i + 1) + ".. ");
            zahl [i] = sc.nextInt();
        }
        
       
            Bubblesort bs = new Bubblesort();
            zahlNeu = bs.sort(zahl);
            for (int i = 0; i < zahl.length; i++) {
                System.out.println(i + 1 + ": " + zahl[i]);
            }
        }
        
        
        
        
	}
       
		
	
	
	
	
	
	
	
	


