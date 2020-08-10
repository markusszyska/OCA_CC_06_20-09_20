package ml.liebermann.aufgabe2;

import ml.liebermann.aufgabe2.print.CreatureType;

public class Application {

	
	public static void main(String[] args) {
		Creature c = new Creature(CreatureType.TRUNKY);
		
		Stable s1 = new Stable(4);
		s1.addCreature(new Creature(CreatureType.HEADY));
		s1.addCreature(new Creature(CreatureType.FOOTY));
		s1.addCreature(new Creature(CreatureType.HEADY));
		s1.addCreature(new Creature(CreatureType.FOOTY));
		
		System.out.println("Erstausgabe nach dem Erstellen der Kreaturen und des Stalls");
		System.out.println(s1);

		s1.feedCreatures(1);
		
		System.out.println("Nach dem Füttern mit einem Eimer");
		System.out.println(s1);
		
		s1.addCreature(new Creature(CreatureType.HEADY));
		s1.addCreature(new Creature(CreatureType.TRUNKY));
		
		System.out.println("Nach dem hinzufügen 2 neuer Kreaturen");
		System.out.println(s1);
		
		System.out.println("Nach dem Füttern mit zwei Eimern");
		s1.feedCreatures(2);
		System.out.println(s1);

		System.out.println("Nach dem Füttern mit drei Eimern");
		s1.feedCreatures(3);
		System.out.println(s1);
	}
	
}
