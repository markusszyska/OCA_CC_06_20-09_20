package pizzabaecker.view.panel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PricePanel extends JPanel implements Observer {
	
	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -6239893542527844595L;
	private JLabel currentPriceLabel;
	private JLabel currentPriceValue;
	private JLabel currentPriceCurrency;

	/*
	 * Getter/Setter
	 */
	private JLabel getCurrentPriceLabel() {
		return currentPriceLabel;
	}
	private void setCurrentPriceLabel(JLabel currentPriceLabel) {
		this.currentPriceLabel = currentPriceLabel;
	}
	public JLabel getCurrentPriceValue() {
		return currentPriceValue;
	}
	private void setCurrentPriceValue(JLabel currentPriceValue) {
		this.currentPriceValue = currentPriceValue;
	}
	private JLabel getCurrentPriceCurrency() {
		return currentPriceCurrency;
	}
	private void setCurrentPriceCurrency(JLabel currentPriceCurrency) {
		this.currentPriceCurrency = currentPriceCurrency;
	}

	/*
	 * Constructor
	 */
	public PricePanel() {
		super();
		super.setLayout(new FlowLayout());
		
		this.setCurrentPriceLabel(new JLabel("Preis:"));
		this.setCurrentPriceValue(new JLabel("0,00"));
		this.setCurrentPriceCurrency(new JLabel("€"));
		
		Font labelFont = new Font(this.getCurrentPriceCurrency().getFont().getFontName(), Font.PLAIN, 30);
		this.getCurrentPriceLabel().setFont(labelFont);
		this.getCurrentPriceValue().setFont(labelFont);
		this.getCurrentPriceCurrency().setFont(labelFont);
	
		this.add(this.getCurrentPriceLabel());
		this.add(this.getCurrentPriceValue());
		this.add(this.getCurrentPriceCurrency());	
		
		super.setVisible(true);
	}

	/*
	 * Methods
	 */
	
	// Observer update, bekommt double fuer den Preis
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Double) {
		    String price = String.format("%.2f", arg);
			this.getCurrentPriceValue().setText(price);
			
			// debugzeile
//			System.out.println("Preis updated");
		}
	}

}
