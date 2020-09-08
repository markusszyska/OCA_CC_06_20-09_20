package pizzabaecker;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import pizzabaecker.actionListener.AddIngredientListener;
import pizzabaecker.actionListener.NewPizzaListener;
import pizzabaecker.actionListener.SellPizzaListener;
import pizzabaecker.model.Pizzaria;
import pizzabaecker.model.pizza.PizzaBottom;
import pizzabaecker.view.MainView;

public class Controller {
	/*
	 * Attribute
	 */
	private final Pizzaria pizzaria;
	private MainView mainView;
	
	/*
	 * Getter/Setter
	 */
	public Pizzaria getPizzaria() {
		return pizzaria;
	}
	public MainView getMainView() {
		return mainView;
	}
	private void setMainView(MainView mainView) {
		this.mainView = mainView;
	}
	
	/*
	 * Constructor
	 */
	public Controller() {
		this.setMainView(new MainView());
		
	
		// Pizzaria mit 3 Observern und Controller als übergabe
		this.pizzaria = new Pizzaria(this.getMainView().getMainFrame().getMainPanel(), this.getMainView().getMainFrame().getBottomPanel().getCreditPanel(), this.getMainView().getMainFrame().getBottomPanel().getPricePanel(), this.getMainView().getMainFrame().getRightPanel().getStatPanel());
		
		// Add ActionListeners to Buttons
		this.addActionListenerToNewPizzaButton(new NewPizzaListener(this));
		this.addActionListenerToIngredients(new AddIngredientListener(this));
		this.addActionListenerToSellButton(new SellPizzaListener(this));
		
		// Boden Auswahldialog (besser eigene Klasse schreiben, Retundanz verringern)
		PizzaBottom[] choices = PizzaBottom.values();
		PizzaBottom input = (PizzaBottom) JOptionPane.showInputDialog(this.getMainView().getMainFrame(), "Waehle einen Boden", "Neue Pizza erstellen",
				JOptionPane.QUESTION_MESSAGE, null, 
				choices, // Array of choices
				choices[0]); // Initial choice
		
		//debugzeile
//		System.out.println(input);
		
		this.getPizzaria().newPizza(input);
	}
	
	/*
	 * Methods
	 */
	// Was ist besser: getter verwenden oder für jede Klasse im Baum ne eigene Methode...?
	public void addActionListenerToNewPizzaButton(ActionListener al) {
		this.getMainView().getMainFrame().getRightPanel().addActionListenerToNewPizzaButton(al);
	}
	public void addActionListenerToIngredients(ActionListener al) {
		this.getMainView().getMainFrame().getRightPanel().getIngPanel().addActionListenerToIngredients(al);
	}
	public void addActionListenerToSellButton(ActionListener al) {
		this.getMainView().getMainFrame().getRightPanel().addActionListenerToSellButton(al);
	}
}
