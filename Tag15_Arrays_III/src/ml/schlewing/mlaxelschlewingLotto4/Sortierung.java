package ml.schlewing.mlaxelschlewingLotto4;

public class Sortierung {
	
	/* Methode bubbleSort, Uebergabe feld ist vom Typ int array */
	static void bubbleSort(int[] feld) {  
	      int n = 6;  
	      int temp = 0;  
	      
	      /* Doppelschleife ueber alle Elemente */
	      
	         for(int i = 0; i < n; i++) {  
	                
	        	 for(int j = 1; j < (n-i); j++){  
	                     
	        		 if(feld[j-1] > feld[j]) {  
	                     
	                   /* Austausch der Elemente, der eigentliche Zauber */ 
	        			 
	                   temp = feld[j-1]; 
	                   
	                   feld[j-1] = feld[j];
	                   
	                   feld[j] = temp;  
	                   
		                   }  
		              }  
		         }  
		    }
}

