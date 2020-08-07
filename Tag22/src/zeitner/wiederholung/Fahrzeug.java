package zeitner.wiederholung;

public class Fahrzeug {
	//Attribute
	private String typ;
	private int geschwindigkeit;
	//getter & setter
	public String getTyp() {
		return this.typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	private int getGeschwindigkeit() {
		return this.geschwindigkeit;
	}
	private void setGeschwindigkeit(int geschwindigkeit) {
		if (geschwindigkeit >= 0) {
			this.geschwindigkeit = geschwindigkeit;	
		} else {
			System.out.println("Fehler ! negative Geschwindigkeit ...");
			this.geschwindigkeit = 0;
		}
	}
	//Konstruktoren (Destruktor)
	public Fahrzeug(String typ, int geschwindigkeit){
		this.setTyp(typ);
		this.setGeschwindigkeit(geschwindigkeit);
	}
	public Fahrzeug() {
	}
	//Standardmethoden (toString, clone, equals, hashcode)
	@Override
	public String toString() {
		return "Typ : " + this.getTyp() + " (" + this.getGeschwindigkeit() + " km/h)";
	}
	@Override
	protected Fahrzeug clone() {
		return new Fahrzeug(this.getTyp(), this.getGeschwindigkeit());
	}

	//Funktionalitäten
	public void beschleunigen(int beschleunigung) {
		if (beschleunigung >= 0) {
			this.setGeschwindigkeit(this.getGeschwindigkeit()+beschleunigung);
		} else {
			System.out.println("Fehler ! Beschleunigung muss positiv sein ...");
		}
	}
	public void bremsen(int beschleunigung) {
		if (beschleunigung >= 0) {
			this.setGeschwindigkeit(this.getGeschwindigkeit()-beschleunigung);	
		} else {
			System.out.println("Fehler ! Beschleunigung muss positiv sein ...");
		}
	}
}
