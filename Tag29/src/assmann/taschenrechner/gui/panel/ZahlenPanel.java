package assmann.taschenrechner.gui.panel;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import assmann.taschenrechner.gui.GridBagConstraints.NumberButtonConstraints;
import assmann.taschenrechner.gui.button.NegateButton;
import assmann.taschenrechner.gui.button.NumberButton;
import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class ZahlenPanel extends JPanel {

	private static final long serialVersionUID = -4935974176144423678L;

	public ZahlenPanel(IAusgabeTextfeld ausgabeTextfeld) {
		super();
		super.setLayout(new GridBagLayout());

		NumberButton button;
		String[] buttonNames = new String[] {"7", "8", "9", "4", "5",
				"6", "1", "2", "3", "0", "."};
		
		int i = 0;
		for(int y = 0;y<4;y++) {
			for(int x = 0;x<3;x++) {
				if(y == 3 && x == 2) {
					continue;
				}
				button = new NumberButton(buttonNames[i++], ausgabeTextfeld);
				super.add(button, new NumberButtonConstraints(x,y));
			}
		}

		NegateButton negateButton = new NegateButton("+/-", ausgabeTextfeld);
		super.add(negateButton, new NumberButtonConstraints(2,3));

		super.setVisible(true);
	}
}
