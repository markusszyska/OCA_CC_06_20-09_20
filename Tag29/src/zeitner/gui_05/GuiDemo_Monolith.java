package zeitner.gui_05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class GuiDemo_Monolith {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(600, 600);
		mainFrame.setTitle("Mein tolles GUI-Testprogramm!");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBackground(Color.RED);

		JPanel workingPanel = new JPanel();
		workingPanel.setLayout(new BorderLayout());
		workingPanel.setBackground(Color.RED);

		JLabel display = new JLabel("Hallo");
		display.setBackground(Color.YELLOW);
		display.setOpaque(true);
		display.setVisible(true);

		JButton umschaltButton = new JButton("Welt");
		umschaltButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton quelle = ((JButton) (e.getSource()));
				if (quelle.getText().equals("Welt")) {
					display.setText("Welt");
					display.setBackground(Color.GREEN);
					quelle.setText("Hallo");
				} else {
					display.setText("Hallo");
					display.setBackground(Color.YELLOW);
					quelle.setText("Welt");
				}
			}
		});
		umschaltButton.setVisible(true);

		workingPanel.add(display, BorderLayout.PAGE_START);
		workingPanel.add(umschaltButton, BorderLayout.CENTER);
		workingPanel.setVisible(true);

		JToolBar mainToolBar = new JToolBar("mainToolBar");

		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setVisible(true);

		mainToolBar.add(exitButton);
		mainToolBar.setVisible(true);

		mainPanel.add(mainToolBar, BorderLayout.PAGE_START);
		mainPanel.add(workingPanel, BorderLayout.CENTER);
		mainPanel.setVisible(true);

		JMenuBar mainFrameMenuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");

		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitItem.setVisible(true);

		fileMenu.add(exitItem);
		fileMenu.setVisible(true);

		mainFrameMenuBar.add(fileMenu);
		mainFrameMenuBar.setVisible(true);

		mainFrame.setJMenuBar(mainFrameMenuBar);
		mainFrame.add(mainPanel, BorderLayout.CENTER);
		mainFrame.setVisible(true);

	}
}
