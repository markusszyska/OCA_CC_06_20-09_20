package gui.components;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Demo12JTextArea {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setTitle("Demo12JTextArea");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		Font font = new Font("Arial", Font.PLAIN, 20);
		//A JTextArea is a multi-line area that displays plain text. 
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(font);
		txtArea.setEditable(false);
		txtArea.setText("Hier wird nur angezeigt");
		txtArea.append("\naber man kann nichts reinschreiben");
		txtArea.append("\nweil editable auf false gesetzt ist");
		
		JTextArea txtArea2 = new JTextArea();
		txtArea2.setFont(font);
		txtArea2.setText("Hier kann man was reinschreiben");
		
		panel.add(txtArea);
		panel.add(txtArea2);
		frame.setVisible(true);
		
	}
}
