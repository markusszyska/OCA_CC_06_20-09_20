package demoVerketteListe;

public class Person {
	private Coffee myCoffee;
	private Person naechstePerson;
	
	public Coffee getMyCoffee() {
		return myCoffee;
	}
	public void setMyCoffee(Coffee myCoffee) {
		this.myCoffee = myCoffee;
	}
	public Person getNaechstePerson() {
		return naechstePerson;
	}
	public void setNaechstePerson(Person naechstePerson) {
		this.naechstePerson = naechstePerson;
	}
	
	public Person(int anzahl) {
		if(anzahl > 0) {
			this.setNaechstePerson(new Person(--anzahl));			
		}
	}
	
	public void eintragenInFreiesFeld(Coffee coffee) {
		if(this.getMyCoffee() == null) {
			this.setMyCoffee(coffee);
		}else if(this.getNaechstePerson() != null) {
			this.getNaechstePerson().eintragenInFreiesFeld(coffee);
		}else {
			System.out.println("Alle haben schon Kaffee");
		}		
	}
	public void gebeAlleElementeAus() {
		if(this.getMyCoffee() != null) {
			System.out.println(this.getMyCoffee());
		}else {
			System.out.println("Kein Kaffee gefunden");
		}
		if(this.getNaechstePerson()!=null) {
			this.getNaechstePerson().gebeAlleElementeAus();
		}
	}
}
