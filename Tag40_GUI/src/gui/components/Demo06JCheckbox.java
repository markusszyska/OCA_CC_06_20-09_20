package gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Demo06JCheckbox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		frame.setTitle("Demo06JCheckbox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		JCheckBox box = new JCheckBox("Box 1");
		JCheckBox box2 = new JCheckBox("Box 2");
		
		JCheckBox box3 = new JCheckBox("Box 3");
		JCheckBox box4 = new JCheckBox("Box 4");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(box3);
		bg.add(box4);
		
		JButton btn = new JButton("Check die Boxen");
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(box.isSelected()) {
					System.out.println(box.getText());
				}
				if(box2.isSelected()) {
					System.out.println(box2.getText());
				}
				if(box3.isSelected()) {
					System.out.println(box3.getText());
				}
				if(box4.isSelected()) {
					System.out.println(box4.getText());
				}
				
			}
		});
		
		panel.add(box);
		panel.add(box2);
		panel.add(btn);
		panel.add(box3);
		panel.add(box4);
		
		frame.setVisible(true);
	}
}
