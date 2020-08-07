package zeitner.draw;

import javax.swing.JFrame;

public class DrawDemo {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("DrawDemo");
		mainFrame.setSize(900, 900);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(new MyCanvas());
		mainFrame.setVisible(true);
	}
}
