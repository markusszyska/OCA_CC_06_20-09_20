package schulzke.taschenrechner.gui.button;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import schulzke.taschenrechner.gui.font.MainFont;
import schulzke.taschenrechner.gui.label.IOutputLabel;

public class InputButton extends JButton {
	
public InputButton(String text, Color background, IOutputLabel outputLabel ) {
	super(text);
	super.setBackground(background);		
	super.setForeground(Color.white);	
	super.setFont(new MainFont());
	super.setPreferredSize(new Dimension(110, 60));
	super.setMinimumSize(new Dimension(110, 60));			
	super.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			outputLabel.setText(text); 
		}
	});
	super.setVisible(true);
}
}
