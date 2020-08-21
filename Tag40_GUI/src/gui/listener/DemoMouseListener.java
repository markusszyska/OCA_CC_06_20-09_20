package gui.listener;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class DemoMouseListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		frame.setTitle("DemoMouseListener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		JLabel label = new JLabel("Ein Label Text");
		label.addMouseListener(new MyMouseListener());
		
		panel.add(label);
		frame.setVisible(true);
	}
}

class MyMouseListener implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed");	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered");		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited");
	}	
}

class MyMouseListener2 extends MouseAdapter{
	
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited");
	} 
	
}





