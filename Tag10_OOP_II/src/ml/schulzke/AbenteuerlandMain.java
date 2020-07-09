package ml.schulzke;


public class AbenteuerlandMain {

	public static void main(String[] args) {
		Abenteurer a1 = new Abenteurer();
		Monster m1 = new Monster();
		
		a1.name = "Sinbad";
		m1.name = "Godzilla";
		
		System.out.println(a1.name);
		
		
		while(m1.health>=0&&a1.health>=0) {
			System.out.println("\n");
			a1.attack(m1);
			m1.hp(a1);
			System.out.println("\n");
			m1.attack(a1);
			a1.hp(m1);
		}
	}

}

