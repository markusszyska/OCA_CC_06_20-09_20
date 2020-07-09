package ml.schulzke;

import java.util.Random;

public class Monster {
	public String name;
	public int strength = 25;
	public int health = 200;
	public String location;
	
	public void hp(Abenteurer a1) {
		if(this.health>0) {
			System.out.println(this.name+" hat "+this.health+" uebrig!");
		}else {
			System.out.println(a1.name+" hat "+this.name+" besiegt!");
		}
	}
	
	public void attack(Abenteurer a1) {
		
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
		
		a1.health = a1.health-dmg_end;
		
		System.out.println(this.name+" attacked "+a1.name+" with "+dmg_end+" damage!");
		
		if(a1.health<30) {
			a1.heal();
		}
		}
	}
}