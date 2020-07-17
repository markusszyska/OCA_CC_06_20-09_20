package ml.Liebermann.Bauernhof;

import ml.Liebermann.Gebaeude.Stall;
import ml.Liebermann.Items.Eimer;
import ml.Liebermann.Items.Schluessel;
import ml.Liebermann.Lebewesen.Bauer;
import ml.Liebermann.Lebewesen.Kuh;
import ml.Liebermann.Lebewesen.Schwein;
import ml.Liebermann.Nahrung.Milch;
import ml.Liebermann.Nahrung.Moehre;

public class Bauernhof {

	private static Stall meinStall;
	
	public Bauernhof(){
		meinStall = new Stall();
		
	}
	
	
	
	
	public static Stall getMeinStall() {
		return meinStall;
	}

	public static void setMeinStall(Stall meinStall) {
		Bauernhof.meinStall = meinStall;
	}
}