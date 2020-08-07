package zeitner.gui_01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiDemo {

	public static void main(String[] args) {
		JFrame f = new JFrame();
			f.setSize(600,600);
			f.setTitle("Mein tolles Programm!");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//f.setLayout(new FlowLayout());

			JButton b1 = new JButton("1");
			b1.setVisible(true);
			JButton b2 = new JButton("2");
			b2.setVisible(true);
			JButton b3 = new JButton("3");
			b3.setVisible(true);
			JButton b4 = new JButton("4");
			b4.setVisible(true);
			JButton b5 = new JButton("5");
			b5.setSize(10, 10);
			b5.setVisible(true);
			
			f.add(b3,BorderLayout.WEST);
			f.add(b4,BorderLayout.EAST);
			f.add(b1,BorderLayout.NORTH);
			f.add(b2,BorderLayout.SOUTH);
			f.add(b5,BorderLayout.CENTER);
			f.setVisible(true);
		

	}

}
