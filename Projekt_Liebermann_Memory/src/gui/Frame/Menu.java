package gui.Frame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{

	public Menu() {
		
		JMenu menu = new JMenu("Spiel");
		
		
		JMenuItem neu = new JMenuItem("Neues Spiel");
		neu.setVisible(true);
		
		
		menu.add(neu);
		super.add(menu);
		
		neu.setVisible(true);
		menu.setVisible(true);
		super.setVisible(true);
		
	}
	
	
}
