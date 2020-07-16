package ml.thurairajah;

import java.util.Arrays;
import java.util.Random;

public class LottoGen_Aufg1 {
	public static void main(String[] args) 
	{
	//Math.random()
		System.out.println("\n\tLottozahlen-Generator:\n");
		
		int[] z = new int[6];
		int temp;
		
			for (int i = 0; i < 6; i++) 
			{					
				int zahl = (int)(Math.random()*49+1);
				z[i] = zahl;
 
				
//				System.out.print("["+ z[i] + "] ");	
			
//				if (z[i] == z[i+1]) 
//				{
//					temp = z[i];
//					zahl = (int)(Math.random()*49+1);
//					z[i]=zahl;
//					System.out.println("test");
//				}
			}	
			
//			Arrays.sort(z);
			
			for (int arr : z) 
			{	
				System.out.print( "[-" + arr + "-] ");
			}

			
//			System.out.println("\n\n\nRandom:");
//	//Random()
//			int[] za = new int[6];
//			Random rand = new Random();
//			
//				for (int i = 0; i < za.length; i++) 
//				{					
//					za[i] = rand.nextInt(50);
//					
////					if (za.equals(rand)) {
////						System.out.println("");
//					
//					System.out.print("[["+za[i]+"]] ");	
//				}
						
	}	
}
