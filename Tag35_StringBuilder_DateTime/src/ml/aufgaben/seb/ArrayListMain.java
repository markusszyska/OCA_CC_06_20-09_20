package ml.aufgaben.seb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListMain {

	public static void main(String[] args) {
		
		/*
		 * ###### A1.
		 * Erzeugen Sie eine `ArrayList` mit 20 zufälligen Integer aus dem Bereich [1 ... 100]. 
		 * Geben Sie die Elemente der Liste durchnummeriert untereinander aus.
		 */
		
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list = rndGen(list,10,50);
	       
	    for(int a : list) {
	           
	    	System.out.println(a);
	       
	    }
	    
	    // -------------------------------------------------------------------------------------------------------------
	    
	    
	    ArrayList<String> weekDays = new ArrayList<String>();

	    weekDays.add("Mo");
	    weekDays.add("Di");
	    weekDays.add("Mi");
	    weekDays.add("Do");
	    weekDays.add("Fr");
	      
	      // Ausgabe mit for
	      //for (String string : weekDays) {
	      //	System.out.println(string);
	      //}
	      
	      // Ausgabe mit foreach und lambda
	      weekDays.forEach((i) -> System.out.println(i)); 
	      
	      // Ausgabe mit foreach ohne lambda
	      for (String s : weekDays) { 	
	    	  
	           System.out.println(s); 	
	           
	      }
	      
	      
		  // -------------------------------------------------------------------------------------------------------------
	      /* ###### A3.
			 Erzeugen Sie eine `ArrayList` mit folgenden Strings: "mo", "di", "mi", "do", "fr=". 
			 Verwenden Sie einen `Iterator` um die Elemente der Liste mit der while-Schleife auszugeben.
	       */
	  	      
		    ArrayList<String> weekDays2 = new ArrayList<String>();

		    weekDays2.add("Mo");
		    weekDays2.add("Di");
		    weekDays2.add("Mi");
		    weekDays2.add("Do");
		    weekDays2.add("Fr");
		          
	        ListIterator<String> listItr = null;
	        listItr = weekDays2.listIterator();
			   		      
		      while(listItr.hasNext()) {
		    	  
		         System.out.println(listItr.next());
		         
		      }
		      
			// -------------------------------------------------------------------------------------------------------------
		    /* ###### A4.
				Erzeugen Sie eine `ArrayList` mit folgenden Werten: 10, 20, 30, 40, 50, 60, 70, 80. 
				Geben Sie jedes zweite Element der Liste aus.
		    */
	            
		   ArrayList<Integer> zahlen = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
	      
		   for (int j = 0; j < zahlen.size(); j += 2) {
			
			   System.out.println(zahlen.get(j));
		   }
			
			// -------------------------------------------------------------------------------------------------------------
		    /* ###### A5.
			Erzeugen Sie eine `ArrayList` mit folgenden Werten: 10, 20, 30, 40, 50, 60, 70, 80. 
			Geben Sie die Elemete der Liste rückwärts aus.
		    */
		   
		   // Mit Iterator und while
		   ListIterator<Integer> it = zahlen.listIterator(zahlen.size());
		   
		   while(it.hasPrevious())
		     System.out.println(it.previous());	
		   
		   // ohne Iterator und for 
		   for (int i = zahlen.size()-1; i >= 0 ; i--) {
			    System.out.println(zahlen.get(i));
			}
		   
			// -------------------------------------------------------------------------------------------------------------
		    /* ###### A6.
			Erzeugen Sie eine `ArrayList` mit 20 zufälligen Integer aus dem Bereich [0 ... 100]. 
			Sortieren Sie die Liste und geben Sie sie aus.
		    */
		   
		   Collections.sort(list);
		   
		   System.out.println(list.toString());
		   
		   
		   // -------------------------------------------------------------------------------------------------------------
		   /* ###### A7.
		   Erzeugen Sie eine `ArrayList` mit 10 zufälligen Integer aus dem Bereich [0 ... 50]. 
           Suchen Sie mit `indexOf` nach dem Wert 12.
		   */
		   
		    ArrayList<Integer> listA7 = new ArrayList<>(); 
		   
		    listA7 = rndGen(listA7,10,50);
		    
		    System.out.println("listA7: " + listA7.toString());
		    System.out.println(listA7.indexOf(12));
		    
		    // -------------------------------------------------------------------------------------------------------------
			/* ###### A8.
			Erzeugen Sie eine `ArrayList` mit 10 zufälligen Integer aus dem Bereich [0 ... 50]. 
	        Entfernen Sie mit `remove(int)` die ungeraden Werte.
			*/
		    
		    ArrayList<Integer> listA8 = new ArrayList<>(); 
		    listA8 = rndGen(listA8,10,50);

		    for (int i = 0; i < listA8.size(); i++) {
		    	
		    	if (listA8.get(i) % 2 == 1) {
		    		
		    		listA8.remove(i);
		    	}
		    }
		    
		    System.out.println("listA8: " + listA8.toString());
		    
     
			
		    // -------------------------------------------------------------------------------------------------------------
			/* ###### A9.
			Erzeugen Sie eine `ArrayList` mit 10 zufälligen Integer aus dem Bereich [0 ... 50]. 
		    Entfernen Sie mit `removeIf` die ungeraden Werte.
			*/	  
		    
		    ArrayList<Integer> listA9 = new ArrayList<>(); 
		    listA9 = rndGen(listA9,10,50);
		    
		    System.out.println("listA9: " + listA9);
		    
		    listA9.removeIf(number -> number % 2 == 1);
		    
		    System.out.println("listA9.removeif(): " + listA9);
		    
		    
		    // -------------------------------------------------------------------------------------------------------------
			/* ###### A10.
			Erzeugen Sie eine `ArrayList` mit 10 zufälligen Integer aus dem Bereich [0 ... 50]. 
			Ersetzen Sie in einer Schleife mit der Methode `set` alle ungeraden Werte durch 0.
			*/	
		    
		    ArrayList<Integer> listA10 = new ArrayList<>(); 
		    listA10 = rndGen(listA10, 10, 50);
		    
		    for (int i = 0; i < listA10.size(); i++) {
		    	
		    	if (listA10.get(i) % 2 == 1) {
		    		
		    		listA10.set(i, 0);
		    	}
		    }
		    
		    System.out.println("listA10: " + listA10);
		    
		    
		    // -------------------------------------------------------------------------------------------------------------
			/* ###### A11.
			Erzeugen Sie eine `ArrayList` mit 10 zufälligen Integer aus dem Bereich [0 ... 50]. 
			Verwenden Sie eine Methode `toArray` um ein Array mit den Elementen der Liste zu erhalten.
			*/	
		    
		    ArrayList<Integer> listA11 = new ArrayList<>(); 
		    listA11 = rndGen(listA11, 10, 50);
		    
		    Integer[] array = new Integer[listA11.size()]; 
	        array = listA11.toArray(array); 
	        
	        System.out.println(Arrays.toString(array));
  	    
}
	

	
	
	
	
	
	
	public static ArrayList<Integer> rndGen(ArrayList<Integer> list, int quantity, int maxNr) {
		
		Random randNum = new Random();
		
	    while (list.size() < quantity) { 
	        int a = randNum.nextInt(maxNr-1); 

	        if (!list.contains(a)) {
	        	list.add(a);
	        }
	    }
		
		return list;
	}
	
	
	
	/*
	// Methode entfernt ungerade Elemente
	public static ArrayList<Integer> removeOddElements(ArrayList<Integer> list) {
		
        if (list.isEmpty()) { 
        	
        	throw new Error(); 
        }
        
        ArrayList<Integer> toRemove = new ArrayList<>();

        for (int si : list) {
        	
            if (si % 2 != 0) { 
            	
            	toRemove.add(si); 
            }  
        }

        list.removeAll(toRemove);
        
        return list;
    }
    */

}
