package ml.schulzke;

import java.util.Random;

public class Abenteurer {
	//Attribute
	public String name;
	public int strength = 12;
	public int health = 100;
	public int age = 20;
	public int potion = 4;
	public String location;
	
	public void attack(Monster monster) {
		
		if(this.health>0) {
		Random rnd_dmg = new Random();
		Float dmg = (float) rnd_dmg.nextInt(4)/10;
		int dmg_end;
				
		Random rnd_minus = new Random();
		
		if(rnd_minus.nextInt(2)==0) {
			dmg_end = (int) (this.strength*(1+dmg));
			
		}else {
			dmg_end = (int) (this.strength*(1-dmg));
		}
		
		monster.health = monster.health-dmg_end;
		
		System.out.println(this.name+" attacked "+monster.name+" with "+dmg_end+" damage!");
		}
	}
	
	public void heal() {
		
		if(this.potion>0) {
			this.health = 100;
			System.out.println(this.name+" used Healing-Potion and has again "+this.health);
			this.potion = this.potion-1;
			System.out.println(this.potion+" Healing-Potions left");
		}
		
	}
	
	public void hp(Monster m1) {
		if(this.health>0) {
			System.out.println(this.name+" hat "+this.health+" uebrig!");
		}else {
			System.out.println(m1.name+" hat "+this.name+" besiegt!");
			System.out.println("\n");
			m1.hp(this);
		}
	}

}
