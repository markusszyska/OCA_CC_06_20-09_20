package ml.schulzke.creature;

public class CreatureMain {
	public static void main(String[] args) {
		
		//f
		Stable s = new Stable(4);
		//f end
		
		//g
		Creature footy = new Creature(CreatureType.FOOTY);
		Creature heady = new Creature(CreatureType.HEADY);
		s.fillToEmptyStable(footy);
		s.fillToEmptyStable(heady);
		System.out.println("\n--------------\n");
		s.printAllCreatures();
		//g end
		
		//h
		System.out.println("\n--------------\n");
		s.feedCreatures(1);
		System.out.println("\n--------------\n");
		s.printAllCreatures();
		//h end
		
		//i
		Creature heady1 = new Creature(CreatureType.HEADY);
		Creature trunky = new Creature(CreatureType.TRUNKY);
		s.fillToEmptyStable(heady1);
		s.fillToEmptyStable(trunky);
		System.out.println("\n--------------\n");
		s.printAllCreatures();
		//i end
		
		//j
		System.out.println("\n--------------\n");
		s.feedCreatures(2);
		System.out.println("\n--------------\n");
		s.printAllCreatures();
		//j end
		
		//k
		System.out.println("\n--------------\n");
		s.feedCreatures(2);
		System.out.println("\n--------------\n");
		s.printAllCreatures();
		//k end

	}

}
