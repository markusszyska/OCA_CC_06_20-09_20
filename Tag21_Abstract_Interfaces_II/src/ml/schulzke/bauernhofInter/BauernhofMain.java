package ml.schulzke.bauernhofInter;
import ml.schulzke.bauernhofInter.fauna.*;

import ml.schulzke.bauernhofInter.flora.*;


public class BauernhofMain {

	public static void main(String[] args) {
		IEssbar s1 = new Schwein();
		IEssbar m1 = new Kuh();
		IEssbar p1 = new Gurke();
		IEssbar p2 = new Banane();
		IEssbar w1 = new Wolf();
		IEssbar w2 = new Wolf();
		IEssbar meat1 = new Meat();
		
		s1.frisst(p1);
		s1.frisst(p2);
		m1.frisst(p1);
		m1.frisst(p2);
		m1.frisst(meat1);
		s1.frisst(meat1);
		s1.frisst(s1);
		
		w1.frisst(w2);
		w1.frisst(w1);
		w1.frisst(meat1);

	}

}
