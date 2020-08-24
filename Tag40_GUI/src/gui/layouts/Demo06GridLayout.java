package gui.layouts;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo06GridLayout {
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
		GridLayout gl = new GridLayout(4, 4, 5, 5);
		panel.setLayout(gl);				
		
		for (int i = 0; i < 13; i++) {
			panel.add(new JButton("Button " + i));
		}

		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
