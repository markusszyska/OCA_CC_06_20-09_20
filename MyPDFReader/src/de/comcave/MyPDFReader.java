package de.comcave;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyPDFReader {

	private JFrame frame;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPDFReader window = new MyPDFReader();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyPDFReader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		MyActions myActions = new MyActions(scrollPane);
		
		btnNewButton = new JButton("PDF Laden");
		btnNewButton.addActionListener(this::loadPDF);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(MyActions::exitAction);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("CSV");
		btnNewButton_2.addActionListener(this::loadCSV);
		panel.add(btnNewButton_2);

		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 24));
		scrollPane.setViewportView(textArea);
	}
	
	public void loadCSV(ActionEvent e) {
		try {
			FileReader fr = new FileReader("lib/test.csv");
			BufferedReader br = new BufferedReader(fr);

			while(br.ready()) {
				String tmp[] = br.readLine().split(";");
				System.out.println(tmp[0]);
				System.out.println(tmp[1]);
				System.out.println(tmp[2]);
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void loadPDF(ActionEvent e) {
		File file = new File("lib/test.pdf");
		try {
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			
			String text = pdfStripper.getText(document);
			document.close();
			textArea.setText(text);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
