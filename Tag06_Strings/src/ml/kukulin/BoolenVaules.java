package ml.kukulin;

public class BoolenVaules {
	public static void main(String[] args) {
		
		    
		     boolean a = true;
		     boolean b = true;
		    
		     System.out.println("Logische Operatoren");
		     System.out.println("====================");
		     System.out.println("\n");

		        for(int i = 0; i < 2; i++){            
		            a = !a;
		            
		            for(int j = 0; j < 2; j++){              
		                b = !b;
		                
		              
		                
		                if(!a && !b) 
		                    System.out.println(a + " && " + b + " liefert "  + (a && b));             
		                else if(!a && b)
		                    System.out.println(a + " && " + b + " liefert "  + (a && b)); 
		                else if(a && !b)
		                    System.out.println(a + " && " + b + " liefert "  + (a && b));
		                else if(a && b)
		                    System.out.println(a + " && " + b + " liefert "  + (a && b));
		                
		                
		                if(!a || !b) 
		                    System.out.println(a + " || " + b + " liefert "  + (a || b));             
		                else if(!a || b)
		                    System.out.println(a + " || " + b + " liefert "  + (a || b)); 
		                else if(a || !b)
		                    System.out.println(a + " || " + b + " liefert "  + (a || b));
		                else if(a || b)
		                    System.out.println(a + " || " + b + " liefert "  + (a || b));
		                
		                if(!a ^ !b) 
		                    System.out.println(a + " ^ " + b + " liefert "  + (a ^ b));            
		                else if(!a ^ b)
		                    System.out.println(a + " ^ " + b + " liefert "  + (a ^ b)); 
		                else if(a ^ !b)
		                    System.out.println(a + " ^ " + b + " liefert "  + (a ^ b));
		                else if(a ^ b)
		                    System.out.println(a + " ^ " + b + " liefert "  + (a ^ b));
		                System.out.println("\n");
		            }
		        }      
		    }
		}