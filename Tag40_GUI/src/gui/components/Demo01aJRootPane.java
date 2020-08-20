package gui.components;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class Demo01aJRootPane {

	/*
	 * https://stackoverflow.com/questions/21215188/what-is-exactly-a-jpanel-jframe-
	 * jlayeredpane-and-jrootpane/21215344
	 * 
	 * https://www.straub.as/java/swing/RootPane.html
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo01aJRootPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);

		JPanel panel = new JPanel();
		frame.setContentPane(panel);

		JRootPane rootPane = frame.getRootPane();
		JLayeredPane layeredPane = rootPane.getLayeredPane();
		Component glassPane = frame.getGlassPane();

		// frame.setContentPane(panel); legt das JPanel in das LayeredPane
		/*
		 * In der Version 1.5 wurden die add()-Methoden der fünf RootPaneContainer neu
		 * geschrieben. Zitat aus der 1.5 API:
		 * 
		 * For conveniance JFrame, JDialog, JWindow, JApplet and JInternalFrame, by
		 * default, forward, by default, all calls to the add, remove and setLayout
		 * methods, to the contentPane.
		 */
		System.out.println(panel == layeredPane.getComponent(0));

		JLabel lbl = new JLabel("Hallo Welt");
		frame.add(lbl);

		System.out.println("Anzahl der Components im Frame: " + frame.getComponentCount());
		System.out.println("Anzahl der Components im JRootPane: " + rootPane.getComponentCount());
		System.out.println("Anzahl der Components im JLaredPane: " + layeredPane.getComponentCount());

		System.out.println("---------------------------------------------");
		Component[] compRootP = rootPane.getComponents();
		for (Component c : compRootP) {
			System.out.println("Klasse von c: " + c.getClass().getSimpleName());
			if (c == glassPane) {
				System.out.println(c.getClass().getSimpleName() + " : GlassPane im RootPane");
			}
			if (c instanceof JLayeredPane) {
				System.out.println("--------------JLayeredPane--------------");
				for (Component c1 : ((JLayeredPane) c).getComponents()) {
					System.out.println("Hier haben wir unser ContentPane gefunden: " + (c1 == panel));
				}
			}
		}

//		frame.setVisible(true);

	}

}
