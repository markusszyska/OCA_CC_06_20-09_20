package gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo07JOptionPane {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		frame.setTitle("Demo07JOptionPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);

		/*
		 * JOptionPane makes it easy to pop up a standard dialog box that prompts users
		 * for a value or informs them of something.
		 */
		JButton btn = new JButton("Texteingabe");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = JOptionPane.showInputDialog(panel, "Bitte Text eingeben", "Eine Frage",
						JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(panel, "Danke fuers Klicken", "Ein Titel", JOptionPane.ERROR_MESSAGE);

				if (text != null) {
					System.out.println(text);
				} else {
					System.out.println("Dialog mit x oder abbrechen beendet");
				}

			}
		});

		JButton btn2 = new JButton("To Confirm");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Integer input = JOptionPane.showConfirmDialog(panel, "Wirklich beenden?", "Ein Titel",
						JOptionPane.OK_CANCEL_OPTION);
				System.out.println(input);
				if (input == 0) {
					System.out.println("Ja gedrueckt");
				}
				if (input == 1) {
					System.out.println("Nein gedrueckt");
				}
				if (input == 2) {
					System.out.println("Abbrechen gedrueckt");
				}
				if (input == -1) {
					System.out.println("Dialog mit x beendet");
				}				
			}
		});

		panel.add(btn);
		panel.add(btn2);
		frame.setVisible(true);
	}
}
