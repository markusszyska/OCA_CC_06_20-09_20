package ml.boettger;

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
import java.io.File;
import java.io.IOException;

public class Bernds_PDF_READER {

	private JFrame frame;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bernds_PDF_READER window = new Bernds_PDF_READER();
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
	public Bernds_PDF_READER() {
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
		
		btnNewButton = new JButton("Load PDF");
		btnNewButton.addActionListener(this::loadPDF);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(Bernds_Actions::exitAction);
		panel.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.BOLD, 20));
		scrollPane.setViewportView(textArea);
	}	
	
	public void loadPDF(ActionEvent e) {
		//File file = new File ("lib/test.pdf");
		
		// reading the OCA Pdf book as text.
		
		File file = new File ("lib/139-9_Book PDF for CD.pdf");
		
		try {
			PDDocument document = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			String text = pdfStripper.getText(document);
			document.close();
			textArea.setText(text);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
