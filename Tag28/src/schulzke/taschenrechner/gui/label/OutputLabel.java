package schulzke.taschenrechner.gui.label;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import schulzke.taschenrechner.gui.font.MainFont;

public class OutputLabel extends JLabel implements IOutputLabel{

		public OutputLabel() {
			super();
			super.setLayout(new GridBagLayout());
	        super.setForeground(Color.WHITE);
	        super.setBackground(Color.decode("#555555"));
	        super.setOpaque(true);
	        super.setHorizontalAlignment(SwingConstants.RIGHT);
	        super.setFont(new MainFont());
	        //set size of outputPanel
	        super.setPreferredSize(new Dimension(600, 60));
	        super.setMinimumSize(new Dimension(600, 60));
	        
	            
	        EmptyBorder eBorder = new EmptyBorder(2, 10, 2, 10); // oben, rechts, unten, links
	        super.setBorder(BorderFactory.createCompoundBorder(eBorder, eBorder));
	        super.setVisible(true);
		}
}
