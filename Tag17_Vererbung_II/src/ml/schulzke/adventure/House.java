package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class House {
	
	
	
	private String name;
	
	private Inventory inv = new Inventory();
	
	private static boolean next = false;
	
	private boolean owned = false;
	
	
	public boolean isOwned() {
		return owned;
	}

	public void setOwned(boolean owned) {
		this.owned = owned;
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getGold(){
		return this.inv.getGold();
	}
	
	public void setGold(int gold){
		this.inv.setGold(gold);
	}
	
	public int getPotion(){
		return this.inv.getPotion();
	}
	
	public void setPotion(int potion){
		this.inv.setPotion(potion);
	}
	
	public void store(Hero hero, World world, City city) throws IOException {
		next = false;
		System.out.println("Du bist in deinem Zimmer in "+city.getName());
		while(next==false) {
			System.out.println("Was möchtest du machen?\n");
	
			
			System.out.println("1 - Gold abladen/einladen");
			System.out.println("2 - Traenke abladen/einladen");
			System.out.println("3 - schalfen und essen");
			System.out.println("4 - Haus verlassen");
			
			
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String action = reader.readLine(); 
	  
	        // Printing the read line 
	        System.out.println();  
	        
			if(action.equals("1")) {
				this.storeGold(hero,world);
				next = false;
			}else if(action.equals("2")) {
				this.storePotions(hero,world);
				next = false;
			}else if(action.equals("3")) {
				world.setTime(4);
				hero.setHealth(100f);
				System.out.println(world.showTime());
				System.out.println("Du hast dich ausgeschalfen und etwas gegessen. \nDeine HP wurden auf 100% aufgefuellt.");
				next = false;
			}else if(action.equals("4")) {
				next = true;
				System.out.println("Du verlaesst dein Haus...");
			}else {
				System.out.println("Ungueltige Eingabe!");
			}
		}
	}
	
	public void storePotions(Hero hero, World world) throws IOException {
		while(next==false) {
			
			System.out.println("In deiner Kiste hast du "+this.getPotion()+" Traenke.");
			System.out.println("In deinem Inventar hast du "+hero.getPotion()+" Traenke.");
			System.out.println("Was möchtest du machen?");
			if(this.getPotion()>0) {
				
			}
			if(hero.getPotion()>=1) {
			System.out.println("1 - Traenke abladen");
			}
			if(this.getPotion()>=1) {
			System.out.println("2 - Traenke abholen");
			}
			System.out.println("3 - zurück");
			
			
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String action = reader.readLine(); 
	  
	        // Printing the read line 
	        System.out.println();  
	        
			if(action.equals("1")&&hero.getPotion()>=1) {
				inputPot_Number(this, hero, world, 0);
				next = false;
			}else if(action.equals("2")&&this.getPotion()>=1) {
				inputPot_Number(this, hero, world, 1);
				next = false;
			}else if(action.equals("3")) {
				next = true;
			}else {
				System.out.println("Ungueltige Eingabe!");
			}
		}
		
	}
	
	String potionCount(House house, Hero hero, int state) {
		String switchStr = "ablegen";
		int switchInt = hero.getPotion();
		if(state==1) {
			 switchStr = "abholen";
			 switchInt = house.getPotion();
		};
		
		return "In deiner Kiste hast du "+house.getPotion()+" Traenke.\n"+
		"In deinem Inventar hast du "+hero.getPotion()+" Traenke.\n"+
		"Gib ein wie viele Traenke du "+switchStr+" moechtest: (maximal "+switchInt+")";
	}
	
	void inputPot_Number(House house, Hero hero, World world, int state) throws IOException {
		
		String switchStr = "abgelegt";
		if(state==1) {
			 switchStr = "mitgenommen";
		};
		
		//Enter data using BufferReader 
        BufferedReader reader;
        
        // Reading data using readLine 
        String action;
        
        int inputNumber = 0;
        
        boolean isCorrect = false;
        
        while(isCorrect==false) {
        	
        	System.out.println(potionCount(house, hero, state));
            isCorrect = false;
        	
        	reader =  
                    new BufferedReader(new InputStreamReader(System.in));
        	action = reader.readLine();
        	
        	if(isNumeric(action)) {
        		inputNumber = Integer.parseInt(action);
        		if(state==0) {
            		if(inputNumber<=hero.getPotion()) {
            			isCorrect = true;
            		}else{
            			System.out.println("Wert zu gross! Ungueltige Eingabe!");
            		}
        		}
        		if(state==1) {
            		if(inputNumber<=house.getPotion()) {
            			isCorrect = true;
            		}else{
            			System.out.println("Wert zu gross! Ungueltige Eingabe!");
            		}
        		}

        	}else {
        		System.out.println("Ungueltige Eingabe!");
        	}
        }
    	if(state==0) {
    		hero.setPotion(hero.getPotion()-inputNumber);
    		house.setPotion(house.getPotion()+inputNumber);
    	}else {
    		house.setPotion(house.getPotion()-inputNumber);
    		hero.setPotion(hero.getPotion()+inputNumber);
    	}
       
        System.out.println("\nDu hast "+inputNumber+" Traenke "+switchStr+".");
	}
	
	public void storeGold(Hero hero, World world) throws IOException {
		while(next==false) {
			
			System.out.println("In deiner Kiste hast du "+this.getGold()+" Gold.");
			System.out.println("In deinem Inventar hast du "+hero.getGold()+" Gold.");
			System.out.println("Was möchtest du machen?");
			if(this.getGold()>0) {
				
			}
			if(hero.getGold()>=1) {
			System.out.println("1 - Gold abladen");
			}
			if(this.getGold()>=1) {
			System.out.println("2 - Gold abholen");
			}
			System.out.println("3 - zurück");
			
			
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String action = reader.readLine(); 
	  
	        // Printing the read line 
	        System.out.println();  
	        
			if(action.equals("1")&&hero.getPotion()>=1) {
				inputGold_Number(this, hero, world, 0);
				next = false;
			}else if(action.equals("2")&&this.getPotion()>=1) {
				inputGold_Number(this, hero, world, 1);
				next = false;
			}else if(action.equals("3")) {
				next = true;
			}else {
				System.out.println("Ungueltige Eingabe!");
			}
		}
		
	}
	
	String goldCount(House house, Hero hero, int state) {
		String switchStr = "ablegen";
		int switchInt = hero.getGold();
		if(state==1) {
			 switchStr = "abholen";
			 switchInt = house.getGold();
		};
		
		return "In deiner Kiste hast du "+house.getGold()+" Traenke.\n"+
		"In deinem Inventar hast du "+hero.getGold()+" Gold.\n"+
		"Gib ein wie viel Gold du "+switchStr+" moechtest: (maximal "+switchInt+")";
	}
	
	void inputGold_Number(House house, Hero hero, World world, int state) throws IOException {
		
		String switchStr = "abgelegt";
		if(state==1) {
			 switchStr = "mitgenommen";
		};
		
		//Enter data using BufferReader 
        BufferedReader reader;
        
        // Reading data using readLine 
        String action;
        
        int inputNumber = 0;
        
        boolean isCorrect = false;
        
        while(isCorrect==false) {
        	
        	System.out.println(goldCount(house, hero, state));
            isCorrect = false;
        	
        	reader =  
                    new BufferedReader(new InputStreamReader(System.in));
        	action = reader.readLine();
        	
        	if(isNumeric(action)) {
        		inputNumber = Integer.parseInt(action);
        		if(state==0) {
            		if(inputNumber<=hero.getGold()) {
            			isCorrect = true;
            		}else{
            			System.out.println("Wert zu gross! Ungueltige Eingabe!");
            		}
        		}
        		if(state==1) {
            		if(inputNumber<=house.getGold()) {
            			isCorrect = true;
            		}else{
            			System.out.println("Wert zu gross! Ungueltige Eingabe!");
            		}
        		}

        	}else {
        		System.out.println("Ungueltige Eingabe!");
        	}
        }
    	if(state==0) {
    		hero.setGold(hero.getGold()-inputNumber);
    		house.setGold(house.getGold()+inputNumber);
    	}else {
    		house.setGold(house.getGold()-inputNumber);
    		hero.setGold(hero.getGold()+inputNumber);
    	}
       
        System.out.println("\nDu hast "+inputNumber+" Gold "+switchStr+".");
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
