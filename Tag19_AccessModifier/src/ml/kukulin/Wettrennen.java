package ml.kukulin;

import java.util.ArrayList;
import java.util.Collections;

public class Wettrennen {
	
	public static void main(String[] args) {
		
	Fahrrad f = new Fahrrad();
	//f.setMaxGw(30);
	f.setGw(20.0);
	
	System.out.println("Fahrrad: " + f.bewege(300));
	Auto a = new Auto();
	//a.setMaxGw(160);
	a.setGw(150);	
	System.out.println("Auto: " + a.bewege(60));	
	Rennwagen r = new Rennwagen();
	//r.setMaxGw(220);
	r.setGw(200);
	System.out.println("rennwagen: " + r.bewege(60));
	Krankenwagen k = new Krankenwagen ();
	//k.setMaxGw(220);
	k.setBlaulicht(true);
	k.setGw(80);
	System.out.println("Krankenwagen: " + k.bewege(60));
	
	
		
	final ArrayList<Double> list = new ArrayList<>();
	list.add(f.bewege(300));
	list.add(a.bewege(60));
	list.add(r.bewege(60));
	list.add(k.bewege(60));
	Collections.sort(list, Collections.reverseOrder());
	for(int i=0;i<list.size();++i)
	System.out.println(list.get(i));
		
		
	}

}
