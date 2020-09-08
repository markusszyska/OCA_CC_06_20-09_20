package pizzabaecker.view.panel;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class BottomPanel extends JPanel {
	
	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -7927437463837808922L;
	private PricePanel pricePanel;
	private CreditPanel creditPanel;
	
	/*
	 * Getter/Setter
	 */
	public PricePanel getPricePanel() {
		return pricePanel;
	}
	private void setPricePanel(PricePanel pricePanel) {
		this.pricePanel = pricePanel;
	}
	public CreditPanel getCreditPanel() {
		return creditPanel;
	}
	private void setCreditPanel(CreditPanel creditPanel) {
		this.creditPanel = creditPanel;
	}

	/*
	 * Constructor
	 */
	public BottomPanel() {
		super();
		super.setLayout(new BorderLayout());
		super.setBorder(BorderFactory.createEmptyBorder(0, 5, 20, 10));
		// debugzeile
//		super.setBackground(Color.RED);
		
		// Border vs JSeperator
//		super.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
		
		JSeparator topline = new JSeparator(JSeparator.HORIZONTAL);
	    this.add(topline, BorderLayout.PAGE_START);
	    
		this.setPricePanel(new PricePanel());
		this.setCreditPanel(new CreditPanel());
		
		this.add(this.getPricePanel(), BorderLayout.LINE_START);
		this.add(this.getCreditPanel(), BorderLayout.LINE_END);
		
		super.setVisible(true);
	}
	
	
}
