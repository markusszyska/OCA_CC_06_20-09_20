package gui.components;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.UIManager;

public class Demo09JMenuBar {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		frame.setTitle("Demo09JMenuBar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);
		
		JMenu datei = new JMenu("Datei");
//		datei.setFont(new Font("Arial", Font.BOLD, 20));
		bar.add(datei);
		
		JMenuItem laden = new JMenuItem("Laden");
		datei.add(laden);
		
		JMenuItem speichern = new JMenuItem("Speichern");
		datei.add(speichern);
		
		JSeparator sep = new JSeparator();
		datei.add(sep);
		
		JMenuItem beenden = new JMenuItem("Beenden");
		datei.add(beenden);
		
		JMenu edit = new JMenu("Edit");
		bar.add(edit);
		
		JMenuItem font = new JMenuItem("Font");
		edit.add(font);
		
		JMenu schriftgroesse = new JMenu("Schriftgroesse");
		edit.add(schriftgroesse);
		
		JMenuItem groesser = new JMenuItem("Groesser");
		schriftgroesse.add(groesser);
		
		JMenuItem kleiner = new JMenuItem("Kleiner");
		schriftgroesse.add(kleiner);
		
		JMenu chkMenu = new JMenu("Checkboxen");
		bar.add(chkMenu);
		
		JCheckBoxMenuItem checkbox = new JCheckBoxMenuItem("Eine Checkbox");
		chkMenu.add(checkbox);
		
		JRadioButtonMenuItem radiobtn = new JRadioButtonMenuItem("Ein RadioButton", true);
		chkMenu.add(radiobtn);
		
		frame.setVisible(true);
		
	}
	
}
