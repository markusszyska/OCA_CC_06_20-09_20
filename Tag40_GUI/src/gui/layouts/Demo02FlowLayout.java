package gui.layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo02FlowLayout {
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
		
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		JButton btn = new JButton("Button");
		btn.setBounds(50, 50, 100, 50);
		
		JButton btn2 = new JButton("Button 2");
		btn2.setBounds(150, 100, 100, 50);
		
		JButton btn3 = new JButton("Button 3");
		btn3.setBounds(300, 300, 100, 50);
		
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		frame.setContentPane(panel);

		frame.setVisible(true);
	}
}
