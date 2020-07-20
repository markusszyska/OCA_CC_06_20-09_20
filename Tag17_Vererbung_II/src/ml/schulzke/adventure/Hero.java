package ml.schulzke.adventure;

import java.util.Random;

public class Hero {
	
	private String name = "name";
	private int age = 26;
	private int level = 1;
	private int xp = 0;
	private Float health = 100f;
	private Float distanceToTravel = -1f;
	private boolean ownFlat = false;
	
	private int strengthBase = 10;
	private int strength;
	Inventory inv = new Inventory(); // Gold > Weapons > Clothing > Potions
	private double x = 285;
	private double y = 182;
	private int packMax = 30000;
	private int pack;
	
	public boolean isOwnFlat(){
	    return ownFlat;
	}

	public void setOwnFlat(final boolean ownFlat){
	    this.ownFlat = ownFlat;
	}
	
	public String getInv(){
		String out = "";

		
		out = "Du besitzt:\n"+this.inv.getGold()+" Gold\n"+this.inv.getPotion()+" Heiltraenke\n";
		out += "Inventarplaetze: "+this.inv.getInventoryLength()+"/50\n";
		if(this.getKeyHouse()==true) {
			out += "Schluessel zu Haus";
		}
		
		return out;
	}
	
	public double getX(){
		return this.x;
	}
	public void setX (double x){
		this.x = x;
	}
	public double getY(){
		return this.y;
	}
	public void setY (double y){
		this.y = y;
	}
	
	public String usePotion() {
		String out = null;
		if(this.inv.getPotion()>0) {
			
			this.setHealth(100f);
			this.inv.setPotion(this.inv.getPotion()-1);
		
			if(this.inv.getPotion()==0) {
				out = "Auf 100HP geheilt. Keine Heiltraenke mehr uebrig!";
			}else {
				out = "Auf 100HP geheilt. Heiltraenke uebrig: "+this.inv.getPotion();
			}
		}
		return out;
		
	}

	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public Float getHealth(){
		return this.health;
	}
	
	public void setHealth(Float health){
		this.health = health;
	}
	
	public Float getDistanceToTravel(){
		return this.distanceToTravel;
	}
	
	public void setDistanceToTravel(Float distanceToTravel){
		this.distanceToTravel = distanceToTravel;
	}
	
	public int getStrength(){
		return this.strengthBase*(1+(level/5));
	}
	
	public void setStrength(int strength){
		this.strength = strength;
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
	
	public boolean getKeyHouse(){
		return this.inv.isKeyHouse();
	}
	
	public void setKeyHouse(boolean keyHouse){
		this.inv.setKeyHouse(keyHouse);
	}
	
	public void printStats() {
		System.out.println("Deine Stats: ");
		System.out.println("Level:		"+this.getLevel());
		System.out.println("Grundstaerke:	"+this.getStrengthBase());
		System.out.println("Schaden:	"+((int) (this.getStrength()*0.7f))+"-"+((int) (this.getStrength()*1.3f)));
		System.out.println("Tragkraft:	"+(this.getPackMax()/1000)+"kg");
		System.out.println("Platz:		"+(this.getPack()/1000)+"kg");
		System.out.println("Alter:		"+this.getAge());
		System.out.println("Erfahrung:	"+this.getXp()+"\n");
	}
	
public void fight(Monster monster,World world) {

		
		Random rnd_dmg = new Random();
		Float dmg = (float) rnd_dmg.nextInt(4)/10;
		int dmg_end;
				
		Random rnd_minus = new Random();
		
		if(rnd_minus.nextInt(2)==0) {
			dmg_end = (int) (this.getStrength()*(1+dmg));
			
		}else {
			dmg_end = (int) (this.getStrength()*(1-dmg));
		}
		
		System.out.println("Du gibst dem "+monster.getName()+" einen Hieb: "+dmg_end+" Schaden!");
		if((monster.getHealth()-dmg_end)>0) {
			monster.setHealth(monster.getHealth()-dmg_end);
			//monster attacks back
			rnd_dmg = new Random();
			dmg = (float) rnd_dmg.nextInt(4)/10;
					
			rnd_minus = new Random();
			
			if(rnd_minus.nextInt(2)==0) {
				dmg_end = (int) (monster.getStrength()*(1+dmg));
				
			}else {
				dmg_end = (int) (monster.getStrength()*(1-dmg));
			}
			
			world.setTime(0);
			
			this.setHealth(this.getHealth()-dmg_end);
			
			System.out.println("Der "+monster.getName()+" tritt dich: "+dmg_end+" Schaden!");
			System.out.println("Der "+monster.getName()+" hat "+monster.getHealth()+" Lebenspunte uebrig!");
			System.out.println("Du hast "+this.getHealth()+" Lebenspunte uebrig!");
			
		}else{
			System.out.println("Du hast den "+monster.getName()+" besiegt!");
			System.out.println("Du erhaelst "+monster.getGold()+" Gold von dem besiegten "+monster.getName()+".");
			
			int duration = world.getTime()-world.controls.getStartFight();
			if(duration>=60) {
				int minutes = (int) Math.floor(duration/60);
				if(minutes==1) {
					System.out.println("Der Kampf hat eine Minute und "+(duration-(minutes*60))+" Sekunden gedauert.");
				}else {
					System.out.println("Der Kampf hat "+minutes+" Minuten und "+(duration-(minutes*60))+" Sekunden gedauert.");
				}
				
			}else {
				System.out.println("Der Kampf hat "+duration+" Sekunden gedauert.");
			}
			
			
			
			
			world.controls.changeControls(4);
			world.controls.setLocationType(2);
			this.setGold(this.getGold()+monster.getGold());
		}
		
	}

public int getStrengthBase() {
	return strengthBase;
}

public void setStrengthBase(int strengthBase) {
	this.strengthBase = strengthBase;
}

public int getLevel() {
	return level;
}

public void setLevel(int level) {
	this.level = level;
}

public int getXp() {
	return xp;
}

public void setXp(int xp) {
	this.xp = xp;
}

public int getPackMax() {
	return packMax;
}

public void setPackMax(int packMax) {
	this.packMax = packMax;
}

public int getPack() {
	//System.out.println(this.getPackMax()+"-"+(this.getGold()*8)+"-"+(this.getPotion()*40)+"-"+this.inv.getInventoryWeight());
	return this.getPackMax()-(this.getGold()*8)-(this.getPotion()*40)-this.inv.getInventoryWeight();
}

public void setPack(int pack) {
	this.pack = pack;
}
	
	
}
