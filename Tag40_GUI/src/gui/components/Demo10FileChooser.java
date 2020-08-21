package gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo10FileChooser {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setTitle("Demo10FileChooser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);

		JButton btn = new JButton("Laden");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(
						new File("D:\\Dokumente\\JavaWorkspacesUnterricht\\OCA_Juni_bis_Sep_2020\\OCA_CC_06_20-09_20"));
				int ret = fc.showOpenDialog(panel);
				System.out.println(ret);
				if (ret == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					System.out.println(f.getName() + " geladen");
				}

			}
		});

		JButton btnSave = new JButton("Speichern");
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(
						new File("D:\\Dokumente\\JavaWorkspacesUnterricht\\OCA_Juni_bis_Sep_2020\\OCA_CC_06_20-09_20"));
				int ret = fc.showSaveDialog(panel);
				if (ret == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					System.out.println("Datei " + f.getName() + " gespeichert");
				}
			}
		});

		JButton btnCustom = new JButton("Custom Dialog");
		btnCustom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(
						new File("D:\\Dokumente\\JavaWorkspacesUnterricht\\OCA_Juni_bis_Sep_2020\\OCA_CC_06_20-09_20"));
				int ret = fc.showDialog(panel, "Starten oder sowas");
				if(ret == JFileChooser.APPROVE_OPTION) {
					System.out.println("Datei " + fc.getSelectedFile().getName() + " gestartet oder sowas");
				}				
			}
		});
		panel.add(btn);
		panel.add(btnSave);
		panel.add(btnCustom);
		frame.setVisible(true);

	}
}
