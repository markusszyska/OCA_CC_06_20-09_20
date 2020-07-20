package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AdventureTime {
	
	static Float trvl_distance = -1f;
	
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		printIntro();
		
		Hero hero = new Hero();
		hero.setPotion(3);
		hero.setGold(2000);
		
		World world = new World();
		
		Monster monster = new Monster();
		City[] city = new City[4];
		
		city[0] = new City("Men-nefer",290,165,"Menouthis Weg 4");
		city[1] = new City("Heliopolis",262,170,"Iteru Allee 36");
		city[2] = new City("Merimda",250,130,"Hedjet Straße 7");
		city[3] = new City("Heracleion",75,150,"Uat-Ur Straße 15");

		System.out.println("Es ist der 5. Tag des Achet II im Lande Kemet!");
		System.out.println("Sei auf der Hut Abenteurer, gefährliche Kreaturen lauern in diesen Gefilden.\n");
		
		Action(hero,monster,city[0],city, world);

		
	}
	
	public static void Action(Hero hero,Monster monster,City city, City[] citys, World world) throws IOException {
		while (world.controls.isNext()==false) {
			
			world.controls.setNext(true);
			
		if(world.controls.getLocationType()==0) {
			System.out.println("Du bist in der Wildniss! Was möchtest du machen?");
		}else if(world.controls.getLocationType()==1) {
			System.out.println("Du bist in einem Kampf mit einem "+monster.getName());
		}else if(world.controls.getLocationType()==2) {
			System.out.println("Du bist in der Wildniss! Moechtest du die Reise fortsetzen?");
		}else if(world.controls.getLocationType()==3) {
			System.out.println("Du bist in "+world.controls.getCurrentCity().getName()+". Was möchtest du machen?");
		}
		System.out.println(world.controls.print());
		
		//Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String action = reader.readLine(); 
  
        // Printing the read line 
        System.out.println();   
		
		if(world.controls.isJourney()==true&&action.equals("1")) {
			System.out.println("Reisen");
			city.getDistances(hero, citys, city, world);
			city = city.selectCity(hero, monster, citys, city, world);
			world.controls.setNext(false);
			if(world.controls.isTravelAbbort()==false) {
			Travel(hero,monster,city,citys, world);
			hero.setDistanceToTravel(-1f);
			}else {
				
			}
		}
		else if(world.controls.isFight()==true&&action.equals("2")) {
			System.out.println("Kampf");
			world.controls.setNext(false);
			hero.fight(monster, world);
			
		}
		else if(world.controls.isRest()==true&&action.equals("3")) {
			world.setTime(1);
			System.out.println("Eine Stunde gewartet.");
			System.out.println(world.showTime());
			world.controls.setNext(false);
			Action(hero,monster,city,citys, world);
			
		}
		else if(world.controls.isTrade()==true&&action.equals("4")) {
			world.setTime(3);
			System.out.println("4 - Waren handeln");
			world.controls.setNext(false);
			world.controls.setNextTrade(false);
			city.trader.trade(hero, city, world);
			
			Action(hero,monster,city,citys, world);
			
		}
		else if(world.controls.isPotion()&&action.equals("5")) {
			System.out.println(hero.usePotion());
			world.controls.setNext(false);
			
		}else if(world.controls.isFlee()==true&&action.equals("6")) {
			System.out.println("6 - Geflohen!");
			
		}else if(world.controls.isShowInventory()==true&&action.equals("7")) {
			System.out.println(hero.getInv());
			world.controls.setNext(false);
			
		}else if(world.controls.isJourneyCon()==true&&action.equals("8")) {
			System.out.println("Weiter reisen");
			System.out.println(city.getName()+" ist "+Math.round(hero.getDistanceToTravel())+"km entfernt.");
			System.out.println("Restliche Reise nach "+city.getName()+" wird ca. "+Math.round(hero.getDistanceToTravel()/6)+" Stunden dauern.");
			System.out.println("Weiter nach "+city.getName()+" reisen?");
			world.controls.setNext(false);
			world.controls.setJourney(true);
			Travel(hero,monster,city,citys, world);
			
		}else if(world.controls.isHouse()==true&&action.equals("9")) {
			world.setTime(3);
			System.out.println("Du begibst dich zum "+city.house.getName());
			if(city.house.isOwned()==false) {
				
				System.out.println("Scheint als waere die Tuer verschlossen...");
				world.controls.setNext(false);
				Action(hero,monster,city,citys, world);
			}else {
				System.out.println("Yeah die Tuer geht auf!");
				city.house.store(hero, world, city);
				world.controls.setNext(false);
				Action(hero,monster,city,citys, world);
			}
		}else if(world.controls.isStats()==true&&action.equals("10")) {
			hero.printStats();
			world.controls.setNext(false);
			Action(hero,monster,city,citys, world);
			
		}else {
			System.out.println("Ungueltige Eingabe!");
			world.controls.setNext(false);
			
		}
		}
	}
	
	public static boolean Travel(Hero hero,Monster monster,City city,City[] citys, World world) throws IOException {
		while ((world.controls.isNext()==false)&&(hero.getDistanceToTravel()==-1||hero.getDistanceToTravel()>0)) {
				world.controls.setNext(false);
				System.out.println("1 - reisen");
				System.out.println("2 - abbrechen");
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String action = reader.readLine(); 
	  
	        // Printing the read line 
	        System.out.println();   
	        
			if((world.controls.isJourney()==true||world.controls.isJourneyCon()==true)&&(action.equals("1")||action.equals("8"))) {
				System.out.println("Reisen begonnen");
				if(hero.getDistanceToTravel()==-1) {
					hero.setDistanceToTravel(city.distance(hero));
				}
				while (hero.getDistanceToTravel()>0) {
					Random r = new Random();
					float chance = r.nextFloat();
	
				  if (chance <= 0.01f) {
					  if(world.controls.isFoundMonster()==false) {
						world.controls.setFoundMonster(true);
						 	System.out.println("Ein Monster stellt sich dir in den Weg!");
						 	world.controls.setStartFight(world.getTime());
						 	world.controls.changeControls(1);
						 	world.controls.setLocationType(1);
						 	Action(hero,monster,city,citys, world);
							  return false;
					  }
					 
				  }
				  System.out.println("Reise nach wird "+city.getName()+" noch ca. "+Math.round(hero.getDistanceToTravel()/6)+" Stunden dauern.");
				  hero.setDistanceToTravel(hero.getDistanceToTravel()-6);
				  world.setTime(1);
				}
				System.out.println("Das Ziel befindet sich in 50m auf der rechten Seite.\n");
				
				System.out.println(world.showTime());
				
				hero.setX(city.getPosX());
				hero.setY(city.getPosY());
				world.controls.changeControls(5);
				world.controls.setCurrentCity(city);
				world.controls.setLocationType(3);
				
			}
			else if(world.controls.isRest()==true&&action.equals("2")) {
				System.out.println("abgebrochen");
				world.controls.setNext(false);
				Action(hero,monster,city,citys, world);
			}else {
				System.out.println("Ungueltige Eingabe!");
				world.controls.setNext(false);
			}
		}
		return true;
		
	}
	
	
	static void printIntro() throws InterruptedException{
		String[] intro = {	"",
							"       ______          __     ___       __                 __                      ",
							"      /_  __/__  _  __/ /_   /   | ____/ /   _____  ____  / /___  __________       ",
							" ______/ / / _ \\| |/_/ __/  / /| |/ __  / | / / _ \\/ __ \\/ __/ / / / ___/ _ \\______",
							"/_____/ / /  __/>  </ /_   / ___ / /_/ /| |/ /  __/ / / / /_/ /_/ / /  /  __/_____/",
							"     /_/  \\___/_/|_|\\__/  /_/  |_\\\\_,_/ |___/\\___/_/ /_/\\__/\\__,_/_/   \\___/       ",
							"                                 / /_  __  __                                       ",
							"  ______________________________/ __ \\/ / / /___________________________________    ",
							" /_____/_____/_____/_____/_____/ /_/ / /_/ /_____/_____/_____/_____/_____/_____/    ",
							"                      ______  /_.___/\\__, /           ___                           ",
							"                     / ____/__  ____/____/_____  ____/ (_)___                       ",
							"  __________________/ / __/ _ \\/ __ \\/ ___/ __ \\/ __  / / __ \\__________________    ",
							" /_____/_____/_____/ /_/ /  __/ /_/ / /  / /_/ / /_/ / / / / /_____/_____/_____/    ",
							"                   \\____/\\___/\\____/_/   \\____/\\__,_/_/_/ /_/                       ",
							"",
							"Dies ist ein Fantasy Text-RPG!"};
	                   
	   for(String entry : intro) {
			Thread.sleep(180);
		   System.out.println(entry);
	   }                
	}
	


}