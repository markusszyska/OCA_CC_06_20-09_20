package pizzabaecker.view.panel;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import pizzabaecker.view.button.IngredientButton;

public class IngredientPanel extends JPanel {
	
	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -6590677376584481567L;
	private ArrayList<IngredientButton> buttonList;

	/*
	 * Getter/Setter
	 */
	private ArrayList<IngredientButton> getButtonList() {
		return buttonList;
	}
	
	private void setButtonList(ArrayList<IngredientButton> buttonList) {
		this.buttonList = buttonList;
	}

	/*
	 * Constructor
	 */
	public IngredientPanel() {
		super();
		super.setLayout(new GridBagLayout());
		
		this.setButtonList(new ArrayList<IngredientButton>());
		
		JLabel ingLabel = new JLabel("Zutaten:", SwingConstants.CENTER);
		ingLabel.setFont(new Font(ingLabel.getFont().getFontName(), Font.BOLD, 16));
		ingLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
		
		IngredientButton ingKaese = new IngredientButton("Kaese", "Cheese");
		this.getButtonList().add(ingKaese);
			
		IngredientButton ingChili = new IngredientButton("Chili", "Chili");
		this.getButtonList().add(ingChili);
	
		IngredientButton ingSchinken = new IngredientButton("Schinken", "Ham");
		this.getButtonList().add(ingSchinken);
	
		IngredientButton ingZwiebel = new IngredientButton("Zwiebel", "Onions");
		this.getButtonList().add(ingZwiebel);
		
		IngredientButton ingSalami = new IngredientButton("Salami", "Salami");
		this.getButtonList().add(ingSalami);
		
		
		// zum UI hinzufuegen im GridBagLayout
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		this.add(ingLabel, gbc);
		
		for(int i=0;i<this.getButtonList().size();i++) {
			gbc.gridy = i+1;	
			this.getButtonList().get(i).setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
			this.add(buttonList.get(i), gbc);
		}
		
		super.setVisible(true);			
		
	}

	/*
	 * Methods
	 */
	// nimm ActionListener und pack ihn an alle Ingredientbuttons
	public void addActionListenerToIngredients(ActionListener al) {
		buttonList.forEach(b->b.addActionListener(al));	
	}

}