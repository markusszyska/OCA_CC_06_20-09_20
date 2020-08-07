package demoEnum.demoFrame;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	Resolution reso = Resolution.MEDIUM;
	
	public static void main(String[] args) {
		
		MainFrame frame = new MainFrame();
		
		frame.setTitle("Mein Frame");
		frame.setLocation(200,100);
		frame.setSize(frame.reso.getWidth(), frame.reso.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}
