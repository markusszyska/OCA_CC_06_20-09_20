package gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Demo05JRadioButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo04JToggleButton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		/*
		 * An implementation of a radio button -- an item that can be selected
		 * or deselected, and which displays its state to the user.
		 */
		//Diese Buttons koennen gleichzeitig ausgewaehlt werden
		JRadioButton rdbtn = new JRadioButton("Radio 1");
		JRadioButton rdbtn2 = new JRadioButton("Radio 2");
		
		JRadioButton rdbtn3 = new JRadioButton("Group 1");
		JRadioButton rdbtn4 = new JRadioButton("Group 2");
		
		ButtonGroup bg = new ButtonGroup();
	
		bg.add(rdbtn3);
		bg.add(rdbtn4);

		JButton btn = new JButton("Check die Boxen");
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtn.isSelected()) {
					System.out.println(rdbtn.getText());
				}
				if(rdbtn2.isSelected()) {
					System.out.println(rdbtn2.getText());
				}
				if(rdbtn3.isSelected()) {
					System.out.println(rdbtn3.getText());
				}
				if(rdbtn4.isSelected()) {
					System.out.println(rdbtn4.getText());
				}
			}
		});
		
		panel.add(rdbtn);
		panel.add(rdbtn2);
		panel.add(btn);
		panel.add(rdbtn3);
		panel.add(rdbtn4);
		frame.setVisible(true);
	}
}
