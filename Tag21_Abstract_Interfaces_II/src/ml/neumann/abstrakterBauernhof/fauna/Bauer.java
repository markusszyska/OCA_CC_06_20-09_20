package ml.neumann.abstrakterBauernhof.fauna;

import ml.neumann.abstrakterBauernhof.flora.APflanze;

public class Bauer extends ATier {

	private double kontostand; 
	
	// getter Setter 
	public double getKontostand() {
		return kontostand;
	}
	
	public void setKontostand(double kontostand) {
		this.kontostand= kontostand;
	}
	
	// Konstruktor 
	public Bauer() {
		super();
		this.setKontostand(0);
	}
	
	public Bauer (String name, int alter, int gewicht, boolean female, double kontostand) {
	super(name,alter,gewicht,female);
	this.setKontostand(kontostand);
	}
	
	// Methode aus ATier
	@Override
	public void machGeraeusch() {
		System.out.println("Der Bauer " +this.getName() + " schnarcht chhhrrrazepüüüh");
		
	}
	public void schlachten (ANutztier n) {
		System.out.println("Bauer " + this.getName() + " schlachtet Tier " + n.getName());
	}
	
	
	public void fuettert(ANutztier n, APflanze p) {
		System.out.println("Bauer füttert Nutztier " + n.getName() + " mit Pflanze " + p.getSorte());
		
	}
	
	}

