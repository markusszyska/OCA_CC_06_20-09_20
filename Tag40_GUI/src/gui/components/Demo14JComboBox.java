package gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo14JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setTitle("Demo14JComboBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		String[] strings = {"Erster String", "Zweiter String", "Dritter String"};
		
		JComboBox<String> cb = new JComboBox<String>(strings);
		cb.addItem("Hinzugefuegter String");
		cb.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				String item = (String)cb.getSelectedItem();
				System.out.println(item);
			}
		});
		
		panel.add(cb);
		frame.setVisible(true);
	}

}
