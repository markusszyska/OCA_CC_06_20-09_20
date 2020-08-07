package zeitner.gui_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiDemo {

	public static void main(String[] args) {
		JFrame f = new JFrame();
			f.setSize(600,600);
			f.setTitle("Mein tolles Programm!");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//				JPanel labelPanel = new JPanel();
//				
//				labelPanel.setLayout(new BorderLayout());
//				labelPanel.setBackground(Color.YELLOW);
			
//				JLabel label = new JLabel("Hallo");
//				labelPanel.add(label);
//				labelPanel.setVisible(true);
				
				JPanel buttonPanel = new JPanel();
				
				buttonPanel.setLayout(new BorderLayout());
				buttonPanel.setBackground(Color.RED);
				
				JLabel label = new JLabel();
				label.setText("Hallo");
				label.setBackground(Color.YELLOW);
				label.setVisible(true);
				
				JButton b1 = new JButton("1");
				
					b1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							label.setText("Button gedrückt!!!!");
						}
					});
					b1.setVisible(true);

				buttonPanel.add(b1, BorderLayout.CENTER);
				buttonPanel.add(label, BorderLayout.PAGE_START);
					
				buttonPanel.setVisible(true);
			
				f.add(buttonPanel, BorderLayout.CENTER);
				//f.add(labelPanel, BorderLayout.PAGE_START);
			f.setVisible(true);

	}

}
