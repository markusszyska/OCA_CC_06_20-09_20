package gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo02JButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo02JButton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		/*
		 * An implementation of a "push" button. 
		 */
		JButton btn = new JButton("Hier Beschriftung einfuegen");
		//Text auf dem Button aendern
		btn.setText("Oder so");
		
		JButton btn2 = new JButton("Hier soll was passieren");
		//ActionListener fuer den Button erstellen
		ActionListener al = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Der ActionListener reagiert auf den Klick des Buttons");				
			}
		};
		//Dem Button den ActionListener hinzufuegen
		btn2.addActionListener(al);
		
		//Dem Panel die Buttons hinzufuegen
		panel.add(btn);
		panel.add(btn2);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
	
	
}
