package pizzabaecker.model.pizza;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import pizzabaecker.model.Pizzaria;

public class Pizza extends Observable {
	
	/*
	 * Attributes
	 */
	private ArrayList<IIngredient> ingredientsList;
	private int[] count;
	private int price; // in cent
	private Pizzaria pizzaria;
	
	/*
	 * Getters/Setters
	 */
	public ArrayList<IIngredient> getIngredientsList() {
		return this.ingredientsList;
	}
	private void setIngredientsList(ArrayList<IIngredient> ingredientsList) {
		this.ingredientsList = ingredientsList;
	}
	public int[] getCount() {
		return count;
	}
	private void setCount(int[] count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	private void setPrice(int price) {
		this.price = price;
	}
	public Pizzaria getPizzaria() {
		return pizzaria;
	}
	private void setPizzaria(Pizzaria pizzaria) {
		this.pizzaria = pizzaria;
	}
	
	/*
	 * Constructors
	 */
	public Pizza() {
		this.setIngredientsList(new ArrayList<IIngredient>());
		this.setPrice(0);
		this.setCount(new int[5]);
		
	}
	
	public Pizza(Pizzaria pizzaria, Observer mainPanelObs ,Observer priceObs, Observer statObs) {
		this();
		this.setPizzaria(pizzaria);
		this.addObserver(mainPanelObs);
		this.addObserver(priceObs);
		this.addObserver(statObs);
		//debugzeile
//		System.out.println("Observer added: " + o);
	}
	
	/*
	 * Methods
	 */
	
	// Setzt Pizza zurueck auf neu-Zustand
	public void newPizza(PizzaBottom bottom) {
		this.setIngredientsList(new ArrayList<IIngredient>());
		this.setPrice(0);
		for(int i=0; i<this.getCount().length;i++) {
			this.getCount()[i] = 0; //stats zuruecksetzen
		}
		this.notifyAboutCount(); // stats uebergeben
		if(bottom != null) {
			this.addIngredient(bottom);
		} else {
			this.addIngredient(PizzaBottom.CRUSTY); 
		}
	}
	
	// Zutaten auf die Pizza packen, besser: enum
	public void addIngredient(IIngredient i) {
		int ingValue = i.getPrice()/5; // Kosten 20%
		
		if(!this.getPizzaria().tooExpensive(ingValue)) {
			this.getPizzaria().addCredits(-ingValue); // Kosten abziehen
			this.getIngredientsList().add(i);
			this.notifyAboutIngredient(i); // Obs notify
			this.addToPrice(i.getPrice()); 
			
			// Stats anpassen
			switch(i.getName()) {
			case "Cheese": {
				this.getCount()[0]++;
				break;
			}
			case "Chili": {
				this.getCount()[1]++;
				break;
			}
			case "Ham": {
				this.getCount()[2]++;
				break;
			}
			case "Onions": {
				this.getCount()[3]++;
				break;
			}
			case "Salami": {
				this.getCount()[4]++;
				break;
			}
			}
			this.notifyAboutCount();
			// debugzeile
//			System.out.println(count[0] + " " + count[1] + " " + count[2] + " " + count[3] + " " + count[4]);
			
		}
	}
	
	// nie verwendet, unvollstaendig...
	public void removeLastIngredient() {
		if(this.getIngredientsList().size() > 1) {
			IIngredient i = this.getIngredientsList().remove(this.getIngredientsList().size()-1);
			this.subtractFromPrice(i.getPrice());
		} else {
			System.out.println("Cannot remove bottom!");
		}
	}
	
	public void addToPrice(int value) {
		this.setPrice(this.getPrice() + value);
		this.notifyAboutPrice();
	}
	
	// nie verwendet, unvollstaendig...
	public void subtractFromPrice(int value) {
		this.setPrice(this.getPrice() - value);
	}
	
	// sende double an Obs
	private void notifyAboutPrice() {
		// Convert price to € and notify Obs.
		double dprice = ((double)this.getPrice())/100;
		this.setChanged();
		this.notifyObservers(dprice);
	}
	
	// sende IIngredient an Obs
	private void notifyAboutIngredient(IIngredient i) {
		this.setChanged();
		this.notifyObservers(i);
	}
	
	// sende int[] an Obs
	private void notifyAboutCount() {
		this.setChanged();
		this.notifyObservers(this.getCount());
	}

	// alter code, nicht noetig, nur interessant wegen dem lambda und in[]
	public int getFullPrice() {
		/*
		 *  java lambda Local variable price defined in an enclosing 
		 *  scope must be final or effectively final
		 *  
		 *  WORKAROUND
		 */
		int[] price = new int[1];
		this.getIngredientsList().forEach((e)->price[0]+=e.getPrice());
		
		// ohne Lambda
//		Iterator<IIngredient> it = this.getIngredientsList().iterator();
//		while(it.hasNext()) {
//			price += it.next().getPrice();
//		}
		return price[0];
	}
	
	// ist die Pizza scharf (2+ IIngredients scharf)
	public boolean isHot() {
		boolean hot = false;
		int[] count = new int[1];
		this.getIngredientsList().forEach((e)->{if(e.isHot())count[0]++;});
		if(count[0]>=2) {
			hot = true;
		}
		return hot;
	}
	
	// ist die Pizza vegetarisch (alle Toppings vegetarisch)
	public boolean isVegetarian() {
		boolean[] veggy = {true};
		this.getIngredientsList().forEach((e)->{veggy[0] = veggy[0] && e.isVegetable();});
		return veggy[0];
	}
	
	@Override
	public String toString() {
		return "This Pizza costs " + (double)this.getPrice()/100 
				+ " €.\nThis Pizza is veggy?: " + this.isVegetarian()
				+ "\nThis Pizza is hot?: " + this.isHot();
	}
}
