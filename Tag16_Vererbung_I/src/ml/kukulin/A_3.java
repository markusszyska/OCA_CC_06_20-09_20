package ml.kukulin;

import java.util.Scanner;

public class A_3 {
	
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie viele Ziehungen durchgefuehrt werden sollen :");
		
		
            int z = sc.nextInt();
		
		

		int[][] lotto = new int[z][6];
		
		//int zahl = (int) (Math.random() * 49 + 1);

		
		for (int i = 0; i < z; i++) {
			for(int j = 0; j < 6; j++) {
				
			lotto[i][j] = (int) (Math.random() * 49 + 1);

		
			
		}
		}
		

		for (int i = 0; i < z; i++) {
			System.out.print("Die Zahlen fuer Ziehung " + (i+1) + " sind : ");
		for (int q = 0; q < 6; q++) {
			System.out.print(lotto[i][q] + " \t");
			
			}
		System.out.println();
		}

		}
	}

