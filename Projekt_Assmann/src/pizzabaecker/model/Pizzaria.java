package pizzabaecker.model;

import java.util.Observable;
import java.util.Observer;

import pizzabaecker.model.pizza.Pizza;
import pizzabaecker.model.pizza.PizzaBottom;

public class Pizzaria extends Observable {
	/*
	 * Attribute
	 */
	private int credit;
	private final Pizza pizza;

	/*
	 * Getter/Setter
	 */
	private int getCredit() {
		return credit;
	}
	private void setCredit(int credit) {
		this.credit = credit;
	}
	public Pizza getPizza() {
		return pizza;
	}

	/*
	 * Constructor
	 */
	public Pizzaria(Observer mainPanelObs, Observer creditObs, Observer priceObs, Observer statObs) {
		this.addObserver(creditObs);
		this.pizza = new Pizza(this, mainPanelObs, priceObs, statObs);
		this.setCredit(1000);
		this.notifyAboutCredits();
	}

	/*
	 * Methods
	 */
	// Setzt Pizza zurueck auf neu-Zustand
	public void newPizza(PizzaBottom bottom) {
		if(this.getCredit() > PizzaBottom.CRUSTY.getPrice()) {
			this.getPizza().newPizza(bottom); // nur wenn genug Geld vorhanden ist
		} else {
			// Evtl Popup erstellen
			System.out.println("Bitte verkaufe die alte Pizza erst");
		}
	}
	
	public void sellPizza() {
		this.addCredits(this.getPizza().getPrice());
	}
	
	public void addCredits(int value) {
		this.setCredit(this.getCredit() + value);
		this.notifyAboutCredits(); // Call Obs notify
	}
	
	private void notifyAboutCredits() {
		// Convert price to € and notify Obs.
		double dprice = ((double)this.getCredit())/100;
		this.setChanged();
		this.notifyObservers(dprice); // als double
	}
	
	public boolean tooExpensive(int value) {
		return value > this.getCredit();
	}
	
}
