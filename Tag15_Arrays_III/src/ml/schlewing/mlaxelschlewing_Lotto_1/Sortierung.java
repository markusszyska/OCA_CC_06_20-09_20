package ml.schlewing.mlaxelschlewing_Lotto_1;

public class Sortierung {
	
/* statische Methode bubbleSort, Uebergabe ist vom Typ Array */
	
static void bubbleSort(int[] feld) {  
      int n = 6;  
      int temp = 0;  
      
      /* Doppelschleife ueber alle Elemente */
      
         for(int i=0; i < n; i++) {  
                
        	 for(int j=1; j < (n-i); j++){  
                     
        		 if(feld[j-1] > feld[j]) {  
                     
                   /* Austausch der Elemente, der ganze Zauber */ 
        			 
                   temp = feld[j-1]; 
                   
                   feld[j-1] = feld[j];
                   
                   feld[j] = temp;  
                   
	                   }  
	              }  
	         }  
	    }
}