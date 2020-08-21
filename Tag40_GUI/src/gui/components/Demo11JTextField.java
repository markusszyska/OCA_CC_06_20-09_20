package gui.components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Demo11JTextField {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setTitle("Demo11JTextField");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		Font font = new Font("Arial", Font.PLAIN, 20);
		
		JTextField txtField = new JTextField("Ein einfaches editierbares Textfeld");
		txtField.setFont(font);
		txtField.setForeground(Color.GREEN);
		
		
		JTextField txtField2 = new JTextField("Ein einfaches nicht editierbares Textfeld");
		txtField2.setFont(font);
		txtField2.setEditable(false);
		
		JPasswordField pass = new JPasswordField("Passwort");
		pass.setFont(font);
		char echoChar = pass.getEchoChar();
		System.out.println((int)echoChar);
		
		JButton btn = new JButton("Anzeigen");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pass.getEchoChar() == echoChar) {
					pass.setEchoChar((char)0);
				}else {
					pass.setEchoChar(echoChar);
				}
				char[] passw = pass.getPassword();
				for(char c : passw) {
					System.out.println(c);
				}				
			}
		});
				
		panel.add(txtField);
		panel.add(txtField2);
		panel.add(pass);
		panel.add(btn);
		frame.setVisible(true);
	}
}
