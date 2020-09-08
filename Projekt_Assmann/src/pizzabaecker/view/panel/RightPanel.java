package pizzabaecker.view.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RightPanel extends JPanel {
	
	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -1822030082432740679L;
	private StatPanel statPanel;
	private IngredientPanel ingPanel;
	private JButton sellButton, newPizzaButton;

	/*
	 * Getter/Setter
	 */
	public StatPanel getStatPanel() {
		return statPanel;
	}
	private void setStatPanel(StatPanel statPanel) {
		this.statPanel = statPanel;
	}
	public IngredientPanel getIngPanel() {
		return ingPanel;
	}
	private void setIngPanel(IngredientPanel ingPanel) {
		this.ingPanel = ingPanel;
	}
	private JButton getSellButton() {
		return sellButton;
	}
	private void setSellButton(JButton sellButton) {
		this.sellButton = sellButton;
	}
	private JButton getNewPizzaButton() {
		return newPizzaButton;
	}
	private void setNewPizzaButton(JButton newPizzaButton) {
		this.newPizzaButton = newPizzaButton;
	}

	/*
	 * Constructor
	 */
	public RightPanel() {
		super();
		super.setLayout(null);
		super.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.BLACK));
		Font bFont = new Font(super.getFont().getFontName(), Font.PLAIN, 14);
		
		// Neue Pizza Button
		this.setNewPizzaButton(new JButton("Neue Pizza"));
		this.getNewPizzaButton().setFont(bFont);
		this.getNewPizzaButton().setBounds(2,10,90,30);
		this.getNewPizzaButton().setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		this.add(this.getNewPizzaButton());
		
		// Stat Panel
		this.setStatPanel(new StatPanel());
		this.getStatPanel().setBounds(2,40,90,110);
		this.getStatPanel().setBorder(BorderFactory.createEtchedBorder(0));
		this.add(this.getStatPanel());
		
		// Ingredient Button panel
		this.setIngPanel(new IngredientPanel());
		this.getIngPanel().setBounds(2,150,90,170);
		this.getIngPanel().setBorder(BorderFactory.createEtchedBorder(0));
		this.add(this.getIngPanel());
		
		// Sell Button
		this.setSellButton(new JButton("Verkaufen"));
		this.getSellButton().setFont(bFont);
		this.getSellButton().setBounds(2,490,90,30);
		this.getSellButton().setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		this.add(this.getSellButton());
		
		super.setVisible(true);
	}


	/*
	 * Methods
	 */
	public void addActionListenerToNewPizzaButton(ActionListener al) {
		this.getNewPizzaButton().addActionListener(al);
	}
	
	public void addActionListenerToSellButton(ActionListener al) {
		this.getSellButton().addActionListener(al);;
	}
	
}