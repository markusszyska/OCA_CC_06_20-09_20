package ml.schulzke.bauernhofAbstract;
import ml.schulzke.bauernhofAbstract.fauna.*;

import ml.schulzke.bauernhofAbstract.flora.*;


public class BauernhofMain {

	public static void main(String[] args) {
		ATier s1 = new Schwein();
		ATier m1 = new Kuh();
		APflanze p1 = new Gurke();
		APflanze p2 = new Banane();
		
		s1.frisst(p1);
		s1.frisst(p2);
		m1.frisst(p1);
		m1.frisst(p2);

	}

}
