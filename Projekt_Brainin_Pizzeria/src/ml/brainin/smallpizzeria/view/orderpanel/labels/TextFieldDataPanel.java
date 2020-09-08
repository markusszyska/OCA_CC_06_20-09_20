package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

// TODO: Auto-generated Javadoc
/**
 * The Class TextFieldDataPanel.
 */
public class TextFieldDataPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The j text field. */
	private JTextField jTextField;
	
	/**
	 * Instantiates a new text field data panel.
	 *
	 * @param name the name
	 */
	public TextFieldDataPanel(String name) {
		super();
		super.setLayout(new BorderLayout());
		JLabel label = new JLabel(name);
		label.setFont(new Font("Dialog", 0, 14));
		label.setPreferredSize(new Dimension(100, 35));
		super.add(label, BorderLayout.WEST);
		this.jTextField = new JTextField();  
		this.jTextField.setFont(new Font("Dialog", 1, 14));
		this.jTextField.setPreferredSize(new Dimension(150, 35));
		super.add(this.jTextField, BorderLayout.CENTER);
		super.setBorder(new EtchedBorder());
		this.setVisible(true);

	}
	
	/**
	 * Sets the editable.
	 *
	 * @param mode the new editable
	 */
	public void setEditable(boolean mode) {
		this.jTextField.setEnabled(mode);
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
	 * @param text the new text
	 */
	public void setText(String text) {
		this.jTextField.setText(text);
	}
}
