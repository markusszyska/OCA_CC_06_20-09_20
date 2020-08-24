package gui.layouts;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo04BoxLayout {

	/*
	 * https://www.dpunkt.de/java/Programmieren_mit_Java/Oberflaechenprogrammierung/84.html
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		frame.setTitle("Demo02FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton btn = new JButton("Button 1");
		panel.add(btn);
		
		panel.add(Box.createRigidArea(new Dimension(20, 20)));
		
		JButton btn2 = new JButton("Button 2");
		panel.add(btn2);
		
		panel.add(Box.createVerticalGlue());
		
		JButton btn3 = new JButton("Button 3");
		panel.add(btn3);
		
		panel.add(new Box.Filler(new Dimension(50, 50),new Dimension(50, 50),new Dimension(50, 50)));
		
		JButton btn4 = new JButton("Button 4");
		panel.add(btn4);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
