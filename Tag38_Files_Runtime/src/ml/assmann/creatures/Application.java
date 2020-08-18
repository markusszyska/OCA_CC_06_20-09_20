package ml.assmann.creatures;

public class Application {
	public static void main(String[] args) {
		// A4 f
		Stable stable = new Stable(4);
		
		// A4 g
		System.out.println("========= add HEADY & FOOTY =========");
		stable.addCreature(new Creature(CreatureType.HEADY));
		stable.addCreature(new Creature(CreatureType.FOOTY));
		stable.printStable();
		
		// A4 h
		System.out.println("========= feeding time =========");
		stable.feedCreatures(1);
		stable.printStable();
		
		// A4 i
		System.out.println("========= add 2nd HEADY & TRUNKY =========");
		stable.addCreature(new Creature(CreatureType.HEADY));
		stable.addCreature(new Creature(CreatureType.TRUNKY));
		stable.printStable();
		
		// A4 j
		System.out.println("========= 2nd feeding time =========");
		stable.feedCreatures(2);
		stable.printStable();
		
		// A4 k
		System.out.println("========= 2nd feeding time =========");
		stable.feedCreatures(3);
		stable.printStable();
		
		// Tests
//		stable.addCreature(new Creature(CreatureType.TRUNKY));
//		stable.feedCreatures(0);
	}
}
