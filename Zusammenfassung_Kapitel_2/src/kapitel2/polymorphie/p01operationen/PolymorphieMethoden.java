package kapitel2.polymorphie.p01operationen;

public class PolymorphieMethoden {
	/**
	 * Polymorphie von Operationen
	 * 
	 * Eine Klasse stellt einen Namensraum dar. Damit ist es möglich, dass
	 * verschiedene Klassen dieselbe Operation implementieren, in anderen Worten,
	 * derselbe Methodenkopf kann in verschiedenen Klassen auftreten.
	 * 
	 * Je nach Klasse kann eine Operation in verschiedenen Implementierungen –
	 * sprich in verschiedener Gestalt – auftreten. Man spricht hierbei auch von der
	 * Vielgestaltigkeit (Polymorphie) von Operationen.
	 */
	public static void main(String[] args) {
		Bruch bruch = new Bruch(0, 2);
		bruch.print();

		Person p = new Person("Mueller", "Anton", 25);
		p.print();

	}
	
	public static void gebeAus(IPrintable p) {
		p.print();
	}
}
