package gui.layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo03BorderLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		frame.setTitle("Demo03BorderLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();

		panel.setLayout(new BorderLayout(10,10));

		JButton north = new JButton("North");

		JButton south = new JButton("South");

		JButton west = new JButton("West");

		JButton east = new JButton("East");
//		east.setSize(new Dimension(500, 500));
		east.setPreferredSize(new Dimension(150, 50));
//		east.setMinimumSize(new Dimension(500, 500));
//		east.setMaximumSize(new Dimension(500, 500));
		
		
		JButton center = new JButton("Center");
		center.setPreferredSize(new Dimension(50,150));
		
		panel.add(north, BorderLayout.NORTH);
		panel.add(south, BorderLayout.SOUTH);
		panel.add(west, BorderLayout.WEST);
		panel.add(east, BorderLayout.EAST);
		panel.add(center, BorderLayout.CENTER);
		panel.setBackground(Color.blue);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
