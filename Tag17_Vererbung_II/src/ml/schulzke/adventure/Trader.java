package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Trader {
	
	String[] traderNames = new String[]{"Ahmose Pen-Nekhebet","Ahmose Sipair","Ahmose Sitayet","Ahmose, son of Ebana","Amenemhab","Amenemhet","Amenemhet","Amenhirkhepshef","Amenhotep, son of Hapu","Amenken","Amenmose","Amunemhat","Amunemhet","Anen","Ani","Ankhkhaf","Anubisemonekeh","Auibre","Banefre","Baufre","Bay","Bebi","Bek ","Dedi","Dedu","Djar","Djau","Djedefhor","Djedptahaufankh","Djehontyhetep","Djehutihotep","Djhutmose ","Hapuneseb","Hardedef","Harkhaf","Haremhab ","Hekaib","Hemiunu","Henenu","Hepzefa","Herihor","Horwedja","Huy","Huya","Ibebi","Ibi","Idu","Idut","Ikernofret","Ikhernofret","Ikudidy","Imhotep","Ineni","Intef","Inyotefoker","Ipuki","Irsu","Ipy","Iumeri","Kagemni","Kawab","Kenamon","Kewab","Kha","Khaemweset","Khamet","Khenemsu","Khensuhotep","Khentemsemet","Khuenre","Kheruef ","Khufukaef","Khnumhotep","Khui","Khusebek","Khuy","Maherpa","Mahu","Mai","Ma'nakhtuf","Masaharta","May","Maya","Mehy","Meketre","Men","Menkhaf","Menkheperresenb","Menna","Merenre","Mereruka","Meri","Merimose ","Meriptah","Merkha","Mernuterseteni","Meryatum","Meryre'","Merytatum","Metjen","Minnakht ","Mitry","Montuherkhopshef","Nakht or Nakhte","Nanefer-ka-ptah","Nebamun","Nebemakhet","Nebenteru","Nebetka","Nebmakhet","Nebwawi","Nebwenef","Neferhotep","Neferkheperuhersekheper ","Neferiryetnes","Neferma'at","Neferpert","Neferti","Neferu","Nefer-weben","Nehesy","Nehi","Nekaure'","Nekhebu","Nekonekh","Nekure","Nenkhsekhmet","Nenwef","Nessumontu","Nibamon, Nibamun, Nebamon","Padiaset","Pamiu","Panehsi/Panhey","Panhesy","Parennefer","Paser","Patenemheb","Pawah ","Pawara","Pawero","Penno","Penni","Penne","Pentu","Pepy-Nakht","Pinhasy","Prehirwonmef","Prehirwonnef","Ptahshepses, Ptah-Shepses","Puyemre'","Rahotep","Raia","Ramose","Ranofer ","Rawer","Re'emkuy","Re'hotpe","Rehu-erdjersenb, Rehu'ardjersen","Rekhmire","Renni","Ro-an, Ro-en, Ra-an","Rudjek","Ruia","Sabaf","Sabni","Sabu","Sarenpet","Sebek-khu","Sebni","Sehetepibre","Inti Sendjemib","Mehi Sendjemib","Senenmut","Sen-nefer","Setau","Setka","Sihathor","Simontu","Surero","Tchanun","Tchay","Teni-menu","Thaneni","Theshen","Thethi","Thuity","Ti, Tiy","Tia","Tjuroy","Tuta","Urhiya","Userhat","Wahneferhotep","Wajmose","Wenamon","Weni","Wenisankh","Unasankh","Weshptah","Woser","Yey ","Yuf","Yuia","Yuny","Yuya","Zezemonekh"};
	
	private String name;
	private int gold = 2400;
	private int potionPrice = 1;
	private int flatPrice = 30;
	private Item sword = new Item(false,true,false,false,false, "einfacher Chepesch", 15, 2800, 7);
	
	Trader(){
		this.setName(traderNames[getRndInt(0,traderNames.length-1)]);
	}
	
		// return random int with min max input
	static int getRndInt(int min, int max) {
		return new Random().nextInt(max - min + 1) + min;
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getGold(){
		return this.gold;
	}
	
	public void setGold(int gold){
		this.gold = gold;
	}
	
	public int getPotionPrice(){
		return this.potionPrice;
	}
	
	public void setPotionPrice(int potionPrice){
		this.potionPrice = potionPrice;
	}
	
	public int getFlatPrice(){
		return this.flatPrice;
	}
	
	public void setFlatPrice(int flatPrice){
		this.flatPrice = flatPrice;
	}
	
	public void trade(Hero hero,City city,World world) throws IOException {
		System.out.println("Hallo ich bin "+this.getName()+" ein Haendler unserer schönen Stadt. Ich biete nur die besten Waren für Reisende an.\n");
		while(world.controls.isNextTrade()==false) {
		System.out.println("Fuer dich habe ich Heiltraenke fuer "+this.getPotionPrice()+" Gold pro Trank.");
		System.out.println("Vielleicht ein "+sword.getName()+" fuer "+sword.getPrice()+" Gold(Waffe)");
		System.out.println("Ich habe viele davon im Angebot...");
		if(city.house.isOwned()==false) {
			System.out.println("Oder vielleicht ein schoenes Zimmer für "+this.getFlatPrice()+" Gold in einer Lehmhuette am Rand von "+city.getName()+"?");
		}
		System.out.println("Ihr habt "+hero.getGold()+" Gold");
		
		world.setTime(2);
		System.out.println("1 - Heiltrank kaufen "+this.getPotionPrice()+" Gold");
		System.out.println("2 - "+sword.getName()+" kaufen "+sword.getPrice()+" Gold");
		if(city.house.isOwned()==false) {
		System.out.println("3 - Zimmer kaufen "+this.getFlatPrice()+" Gold");
		}
		System.out.println("4 - Gegenstaende verkaufen");
		System.out.println("5 - handel beenden");
		
		
		//Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String action = reader.readLine(); 
  
        // Printing the read line 
        System.out.println();  
        
		if(action.equals("1")) {
			if(hero.getGold()>=1) {
				hero.setGold(hero.getGold()-1);
				hero.setPotion(hero.getPotion()+1);
				System.out.println("Hier ein Heiltrank hoechster Qualität für Euch!");
				world.controls.setNextTrade(false);
			}else {
				System.out.println("Bitte kommt wieder wenn Ihr genuegend Gold habt...");
				world.controls.setNextTrade(true);
			}
		}else if(action.equals("2")) {
			if(hero.getGold()>=sword.getPrice()) {
				if((hero.getPack()-sword.getWeight())>=0) {
					System.out.println("Hier Euer "+sword.getName()+". ");
					hero.setGold((int) (hero.getGold()-sword.getPrice()));
					hero.inv.setItems(sword);
					world.controls.setNextTrade(false);
				}else {
					System.out.println("Ihr seid uberlastet! Wie wollt Ihr das den ueberhaupt tragen?");
					world.controls.setNextTrade(false);
				}

			}else {
				System.out.println("Bitte kommt wieder wenn Ihr genuegend Gold habt...");
				System.out.println("Euch fehlen noch "+(sword.getPrice()-hero.getGold())+" Gold zu "+sword.getPrice()+" Gold zum Erwerb.");
				world.controls.setNextTrade(false);
			}
		}else if(action.equals("3")&&city.house.isOwned()==false) {
			if(hero.getGold()>=this.getFlatPrice()) {
				hero.setGold(hero.getGold()-this.getFlatPrice());
				city.house.setOwned(true);
				System.out.println("Hier die Schlüssel. Schaut doch gleich mal vorbei!");
				world.controls.setNextTrade(false);
			}else {
				System.out.println("Bitte kommt wieder wenn Ihr genuegend Gold habt...");
				System.out.println("Euch fehlen noch "+(this.getFlatPrice()-hero.getGold())+" Gold zum Eigenheim!");
				world.controls.setNextTrade(false);
			}
		}else if(action.equals("4")) {
			if(hero.inv.getInventoryLength()!=0) {
				boolean next = false;
				while(next==false) {
				Item items[] = hero.inv.getItems();
				int itemIDs[] = new int[50];
				int itemID = 0;
				System.out.println("Was moechtest du verkaufen?");
				for(int i = 0;i<items.length;i++) {
					if(items[i]!=null) {
						System.out.println((itemID+1)+" - "+items[i].getName()+" "+Math.round(items[i].getPrice()*0.7)+" Gold");
						itemIDs[itemID] = i;
						itemID++;
					}
					
				}
				System.out.println((itemID+1)+" - abbrechen");
				//Enter data using BufferReader 
		        BufferedReader sellreader =  
		                   new BufferedReader(new InputStreamReader(System.in)); 
		         
		        // Reading data using readLine 
		        String sell = reader.readLine(); 
		        
		        for(int b = 0;b<itemID;b++) {
		        	if(sell.equals(""+(b+1))) {
		        		System.out.println("Du hast "+items[itemIDs[b]].getName()+" fuer "+Math.round(items[itemIDs[b]].getPrice()*0.7)+" Gold verkauft.\n");
		        		hero.setGold((int) (hero.getGold()+Math.round(items[itemIDs[b]].getPrice()*0.7)));
		        		hero.inv.setItem(itemIDs[b]);
		        		next = true;
					}
				}
		        if(sell.equals(""+(itemID+1))) {
		        	System.out.println("abgebrochen");
		        	next = true;
		        }
		        if(next==false) {
		        	System.out.println("Ungueltige Eingabe!");
		        }
		        
				
		        
				}
			}else {
				System.out.println("Du hast keine Items im Inventar...");
			}
			world.controls.setNextTrade(false);
			
		}else if(action.equals("5")) {
			System.out.println("Handel beendet!");
			world.controls.setNextTrade(true);
			
		}else {
			System.out.println("Ungueltige Eingabe!");
			world.controls.setNextTrade(false);
		}
        
		}
	}
}
