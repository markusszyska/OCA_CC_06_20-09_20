package gui.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Demo12aJScrollPane {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setTitle("Demo12aJScrollPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		frame.setContentPane(panel);

		Font font = new Font("Arial", Font.PLAIN, 20);

		JTextArea txtArea = new JTextArea(
				"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, \r\n"
						+ "sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est \r\n"
						+ "Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et \r\n"
						+ "dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea \r\n"
						+ "takimata sanctus est Lorem ipsum dolor sit amet.");
		/*
		 * Provides a scrollable view of a lightweight component.A JScrollPane manages a
		 * viewport, optionalvertical and horizontal scroll bars, and optional row
		 * and column heading viewports.
		 */
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(txtArea);

		panel.add(scrollPane, BorderLayout.CENTER);

		frame.setVisible(true);
	}
}
