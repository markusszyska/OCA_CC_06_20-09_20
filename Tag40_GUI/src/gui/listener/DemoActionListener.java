package gui.listener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class DemoActionListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		frame.setTitle("DemoActionListener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		//--------------------Pre Java 8-------------------------
		JButton btn = new JButton("Anonyme Listener Objekt");
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Anonymes Listener Objekt");			
			}
		});
		
		JButton btn2 = new JButton("Button 2");
		btn2.addActionListener(new MeinActionListener());
		//---------------------Ab Java 8----------------------------
		JButton btn3 = new JButton("Button 3");
		btn3.addActionListener(MeinController::staticMethod);
		
		MeinController mc = new MeinController();
		JButton btn4 = new JButton("Button 4");
		btn4.addActionListener(mc::instanceMethod);
		
		JButton btn5 = new JButton("Button 5");
		btn5.addActionListener(e->{System.out.println("Lambda Listener");});
		
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		frame.setVisible(true);
	}
}

class MeinActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Klasse die ActionListener implementiert");
		//Action Command auslesen und reagieren
	}
	
}


class MeinController{
	
	public static void staticMethod(ActionEvent e) {
		System.out.println("static Method");
	}
	
	public void instanceMethod(ActionEvent e) {
		System.out.println("instance Method");
	}
	
}




