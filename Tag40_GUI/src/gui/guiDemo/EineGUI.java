package gui.guiDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.sun.java.swing.plaf.motif.MotifBorders.BevelBorder;

public class EineGUI {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("EineGUI");
		mainFrame.setBounds(400, 400, 640, 480);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout(5,5));
		mainPanel.setBackground(Color.blue);
		mainFrame.setContentPane(mainPanel);
		
		JPanel page_Start = new JPanel();
		page_Start.add(new JLabel("Label 1"));
		page_Start.add(new JLabel("Hallo Welt"));
		page_Start.add(new JLabel("Label 3"));
		
		JPanel line_Start = new JPanel(new GridLayout(8, 1));
		line_Start.add(new JButton("Button 1"));
		line_Start.add(new JButton("Button 2"));
		line_Start.add(new JButton("Button 3"));
		line_Start.add(new JButton("Button 4"));
		line_Start.add(new JButton("Button 5"));
		line_Start.add(new JButton("Button 6"));
		line_Start.add(new JButton("Button 7"));
		line_Start.add(new JButton("Button 8"));
		
		JPanel center = new JPanel(new GridBagLayout());
		center.setBackground(Color.green);
		
		JTextArea txtArea = new JTextArea("Hier koennte Ihre Werbung stehen");
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.insets= new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		center.add(txtArea, gbc_textArea);
		
		JButton btn = new JButton("Button");
		GridBagConstraints gbc_btn = new GridBagConstraints();
		gbc_btn.insets = new Insets(0, 0, 5, 5);
		gbc_btn.gridx = 1;
		gbc_btn.gridy = 0;
		center.add(btn, gbc_btn);
		
		JButton btn2 = new JButton("Button 2");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 2;
		gbc_btn2.gridy = 0;
		center.add(btn2, gbc_btn2);
		
		JTextArea txtArea2 = new JTextArea("Hier koennte Ihre Werbung stehen");
//		txtArea2.setBorder(BorderFactory.createLineBorder(Color.red, 10));
		txtArea2.setMargin(new Insets(0, 5, 0, 0));
		GridBagConstraints gbc_textArea2 = new GridBagConstraints();
		gbc_textArea2.gridwidth = 2;
		gbc_textArea2.fill = GridBagConstraints.BOTH;
		gbc_textArea2.insets= new Insets(0, 0, 5, 0);
		gbc_textArea2.gridx = 0;
		gbc_textArea2.gridy = 1;
		center.add(txtArea2, gbc_textArea2);
		
		JButton btn3 = new JButton("Button 3");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 1;
		center.add(btn3, gbc_btn3);
		
		mainPanel.add(page_Start, BorderLayout.PAGE_START); //oder NORTH
		mainPanel.add(line_Start, BorderLayout.LINE_START); //oder WEST
		mainPanel.add(center, BorderLayout.CENTER);
		
		
		mainFrame.setVisible(true);
	}
	
	
}
