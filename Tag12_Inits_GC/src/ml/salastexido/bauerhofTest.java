package ml.salastexido;

import ml.salastexido.bauernhof.Bauer;
import ml.salastexido.bauernhof.Eimer;
import ml.salastexido.bauernhof.Kuh;
import ml.salastexido.bauernhof.Schluessel;
import ml.salastexido.bauernhof.Stall;
import ml.salastexido.bauernhof.Tuer;

public class bauerhofTest {
	
	public static void main(String [] args) {
		
		Kuh lola = new Kuh("Lola","White","Black",20,120);
		Eimer eimer =  new Eimer();
		//System.out.println(eimer.getMaxfuellmenge());
		Bauer bauer = new Bauer("Pedro",70,170,75);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		bauer.melken(lola,eimer);
		
		//Door
		System.out.println("*****************************************");
		System.out.println("*************** DOOR ********************");
		System.out.println("*****************************************");
		
		Schluessel schluessel = new Schluessel("Schluessel von den Stall");
		Stall stall = new Stall(new Tuer("WOOD",schluessel));
		bauer.OeffneStall(stall);
		bauer.ZuStall(stall);
	}
}
