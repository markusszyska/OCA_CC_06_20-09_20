package demoVerketteListe;

public class DemoListe {

	public static void main(String[] args) {
		Person p = new Person(2);
		System.out.println(p.getNaechstePerson());
		System.out.println(p.getNaechstePerson().getNaechstePerson());
		System.out.println(p.getNaechstePerson().getNaechstePerson().getNaechstePerson());
		
		Coffee coffee1 = new Coffee(CupSize.SMALL);
		Coffee coffee2 = new Coffee(CupSize.LARGE);
		p.eintragenInFreiesFeld(coffee1);
		System.out.println(p.getMyCoffee());
		System.out.println(p.getNaechstePerson().getMyCoffee());
		p.eintragenInFreiesFeld(coffee2);
		System.out.println(p.getMyCoffee());
		System.out.println(p.getNaechstePerson().getMyCoffee());
		System.out.println("-----------------------------");
		p.gebeAlleElementeAus();
	}
	
}
