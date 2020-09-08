package pizzabaecker.view.button;

import java.awt.Font;

import javax.swing.JButton;

public class IngredientButton extends JButton {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -2148294083239096330L;

	/*
	 * Constructor
	 */
	public IngredientButton(String text, String ac) {
		super(text);
		super.setFont(new Font(super.getFont().getFontName(), Font.PLAIN, 14));
		this.setActionCommand(ac);
	}

}
