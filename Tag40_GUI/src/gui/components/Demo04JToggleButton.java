package gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Demo04JToggleButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo04JToggleButton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);

		/*
		 * An implementation of a two-state button.The JRadioButton and JCheckBox
		 * classes are subclasses of this class.For information on using them see How to
		 * Use Buttons, Check Boxes, and Radio Buttons,a section in The Java Tutorial.
		 */
		JToggleButton tglbtn = new JToggleButton("Toggle Me");
		
		JLabel label = new JLabel("Hier kommt der Text rein ob der Toggle Button getoggelt ist");
		
		JButton btn = new JButton("Check Toggle");
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tglbtn.isSelected()) {
					System.out.println("Ist getoggelt");
					label.setText("        An          ");
				}else {
					System.out.println("Ist nicht getoggelt");
					label.setText("         Aus         ");
				}				
			}
		});
		
		
		panel.add(tglbtn);
		panel.add(label);
		panel.add(btn);
		frame.setVisible(true);
	}

}
