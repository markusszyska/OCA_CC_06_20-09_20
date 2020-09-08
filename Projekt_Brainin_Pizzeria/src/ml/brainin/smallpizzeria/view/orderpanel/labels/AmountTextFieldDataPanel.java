package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.text.MaskFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class AmountTextFieldDataPanel.
 */
public class AmountTextFieldDataPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The decimal format. */
	private DecimalFormat decimalFormat = new DecimalFormat("#.00");
	
	/** The j text field. */
	private JTextField jTextField;
	
	/**
	 * Instantiates a new amount text field data panel.
	 *
	 * @param name the name
	 */
	public AmountTextFieldDataPanel(String name) {
		super();
		super.setLayout(new BorderLayout());
		JLabel label = new JLabel(name);
		label.setFont(new Font("Dialog", 0, 14));
		label.setPreferredSize(new Dimension(100, 35));
		super.add(label, BorderLayout.WEST);
		this.jTextField = new JTextField();  
		this.jTextField.setFont(new Font("Dialog", 1, 14));
		this.jTextField.setPreferredSize(new Dimension(120, 35));
		super.add(this.jTextField, BorderLayout.CENTER);
		label = new JLabel("euro");
		label.setFont(new Font("Dialog", 0, 14));
		label.setPreferredSize(new Dimension(40, 35));
		super.add(label, BorderLayout.EAST);

		super.setBorder(new EtchedBorder());
		this.setVisible(true);

	}
	
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return this.jTextField.getText();
	}
	
	/**
	 * Sets the text.
	 *
	 * @param amount the new text
	 */
	public void setText(double amount) {
		this.jTextField.setText(decimalFormat.format(amount));
	}
	
	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.jTextField.setText("");
	}
}
