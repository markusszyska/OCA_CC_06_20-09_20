package pizzabaecker.view.panel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreditPanel extends JPanel implements Observer  {
	
	/*
	 * Attributes
	 */
	private static final long serialVersionUID = 1L;
	private JLabel currentCreditLabel; // text
	private JLabel currentCreditValue; // Geld in Euro
	private JLabel currentCreditCurrency; // €

	/*
	 * Getter/Setter
	 */
	private JLabel getCurrentCreditLabel() {
		return currentCreditLabel;
	}
	private void setCurrentCreditLabel(JLabel currentCreditLabel) {
		this.currentCreditLabel = currentCreditLabel;
	}
	public JLabel getCurrentCreditValue() {
		return currentCreditValue;
	}
	private void setCurrentCreditValue(JLabel currentCreditValue) {
		this.currentCreditValue = currentCreditValue;
	}
	private JLabel getCurrentCreditCurrency() {
		return currentCreditCurrency;
	}
	private void setCurrentCreditCurrency(JLabel currentCreditCurrency) {
		this.currentCreditCurrency = currentCreditCurrency;
	}

	/*
	 * Constructor
	 */
	public CreditPanel() {
		super();
		super.setLayout(new FlowLayout());
	
		this.setCurrentCreditLabel(new JLabel("Guthaben:"));
		this.setCurrentCreditValue(new JLabel("0,00"));
		this.setCurrentCreditCurrency(new JLabel("€"));
		
		Font labelFont = new Font(this.getCurrentCreditLabel().getFont().getFontName(), Font.PLAIN, 30);
		this.getCurrentCreditLabel().setFont(labelFont);
		this.getCurrentCreditValue().setFont(labelFont);
		this.getCurrentCreditCurrency().setFont(labelFont);
	
		this.add(this.getCurrentCreditLabel());
		this.add(this.getCurrentCreditValue());
		this.add(this.getCurrentCreditCurrency());
		
		super.setVisible(true);
	}

	/*
	 * Methods
	 */
	
	// Observer method, bekommt ein double (Guthaben)
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Double) {
		    String credit = String.format("%.2f", arg);
			this.getCurrentCreditValue().setText(credit);
//			System.out.println("Credits updated");
		}
	}

}
