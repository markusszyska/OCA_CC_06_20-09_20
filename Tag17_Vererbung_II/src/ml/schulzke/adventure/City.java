package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class City {
	
	//String[] streetNames = new String[];
	
	
	
	
	private String name;
	private int posX;
	private int posY;
	House house = new House();
	Trader trader = new Trader();
	
	public String getHouseName() {
		return house.getName();
	}

	public void getHouseName(String name) {
		this.house.setName(name);
	}
	
	public boolean isOwnedHouse() {
		return house.isOwned();
	}

	public void setOwnedHouse(boolean ownedHouse) {
		this.house.setOwned(ownedHouse);
	}

	public City(String name,int x,int y, String hName){
		   this.name = name;
		   this.posX = x;
		   this.posY = y;
		   this.house.setName(hName);
		   
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getPosX(){
		return this.posX;
	}
	
	public void setPosX(int posX){
		this.posX = posX;
	}
	
	public int getPosY(){
		return this.posY;
	}
	
	public void setPosY(int posY){
		this.posY = posY;
	}
	
	
	public float distance(Hero hero) {
		return (float) Math.sqrt(((this.posX-hero.getX())*(this.posX-hero.getX()))+((this.posY-hero.getY())*(this.posY-hero.getY())));
	}
	
	public void getDistances(Hero hero, City[] citys, City city, World world) {
		for(int i = 0; i<citys.length;i++) {
			if(world.controls.getCurrentCity()!=citys[i]) {
			System.out.println(citys[i].getName()+" ist "+Math.round(citys[i].distance(hero))+"km entfernt.");
			System.out.println("Reise nach "+citys[i].getName()+" wird ca. "+Math.round(citys[i].distance(hero)/6)+" Stunden dauern.");
			System.out.println("Nach "+citys[i].getName()+" reisen?\n");
			}
		}
	}
	
	public City selectCity(Hero hero,Monster monster, City[] citys, City city, World world) throws IOException {
		world.controls.setTravelAbbort(false);
		City[] citySelect = new City[citys.length];
        int i = 0;
        int iSelect = 0;
        while(i<citys.length) {
        	if(world.controls.getCurrentCity()!=citys[i]) {
        		citySelect[iSelect] = citys[i];
            	System.out.println((iSelect+1)+" - Nach "+citySelect[iSelect].getName()+" reisen?	("+Math.round(citys[i].distance(hero))+"km)");
            	iSelect++;
        	}
        	
        	i++;
        }
        
        System.out.println((iSelect+1)+" - abbrechen\n");
        
        boolean next = false;
        boolean valid = false;
        City returnCity = null;
        while (next==false) {
        
        	next = true;
        	valid = false;
        	
		//Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String action = reader.readLine(); 
        
        for(int i1=0;i1<citySelect.length-1;i1++) {
        	if(action.equals(Integer.toString((i1+1)))) {
    			System.out.println((i1+1)+" - Nach "+citySelect[i1].getName()+" reisen\n");
    			returnCity = citySelect[i1];
    			valid = true;
    		}
        }
        if((action.equals(Integer.toString((citySelect.length+1))))&&(world.controls.getCurrentCity()==null)||(action.equals(Integer.toString((citySelect.length))))&&(world.controls.getCurrentCity()!=null)) {
        	valid = true;
        	returnCity = city;
        	world.controls.setTravelAbbort(true);
        	System.out.println("Abgebrochen!\n");
        }
        
        if(valid==false) {
        	System.out.println("Ungueltige Eingabe!");
			next = false;
        }
	}
        return returnCity;
	}

	
	


}
