package gui.components;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Demo03JLabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo03JLabel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		/*
		 * A display area for a short text string or an image,or both.A label does not
		 * react to input events.As a result, it cannot get the keyboard focus.A label
		 * can, however, display a keyboard alternative as a convenience for a nearby
		 * component that has a keyboard alternative but can't display it.
		 */
		JLabel label = new JLabel("Der Text des Labels");
		label.setBackground(Color.red);

		JLabel label2 = new JLabel("Zweites Label");

		/*
		 * If true the component paints every pixel within its bounds.Otherwise, the
		 * component may not paint some or all of its pixels, allowing the underlying
		 * pixels to show through.
		 */
		label2.setOpaque(true);
		label2.setBackground(Color.red);
		
		JLabel label3 = new JLabel();
		//Image laden
		ImageIcon icon = new ImageIcon(Demo03JLabel.class.getResource("/rkt.png"));
		System.out.println("icon Breite: " + icon.getIconWidth());
		System.out.println("icon Hoehe: " + icon.getIconHeight());
		
		//Ein Image in der Groesse skalieren
		ImageIcon iconScaled = new ImageIcon(icon.getImage().getScaledInstance(80, 100, 0));
		//Oder alles in einer Zeile
		ImageIcon iconScaled2 = new ImageIcon(new ImageIcon(Demo03JLabel.class.getResource("/rkt.png")).getImage().getScaledInstance(80, 100, 0));
		
		label3.setIcon(iconScaled);
			
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
