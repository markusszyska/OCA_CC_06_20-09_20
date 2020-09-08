package ui;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.*;

/**
 * @author Lic. Raul Alejandro Salas Texido
 *
 */

public class WelcomeScreen extends JFrame{

	private JTextField textEmployeeName;
	private JLabel lbCompanyImagenLogo, lbSystemName, lbEmployeeName, lbCopyRights;
	private JButton btnEnter;
	
	private static final long serialVersionUID = 1L;
	
	public WelcomeScreen() {
		 setLayout(null); //default layout system
		 setTitle("Welcome"); //Adding title to Principal Interface
		 getContentPane().setBackground(new Color(255,0,0));//adding background 
		 setIconImage(new ImageIcon("images/icon.png").getImage());
		 this.initComponents();
	}
	
	
	private void initComponents() {
		 //setting Center Image Logo
		 ImageIcon imageIcon = new ImageIcon("images/logo-coca.png"); //setting image inside Object ImageIcon
		 lbCompanyImagenLogo = new JLabel(imageIcon); //adding image to Label
		 lbCompanyImagenLogo.setBounds(25, 15, 300, 150); //setting image dimensions
		 add(lbCompanyImagenLogo);
		 
		 //setting Center Label System Name
		 lbSystemName = new JLabel("Holidays Management System");
		 lbSystemName.setBounds(35, 135, 300, 30);//setting label dimensions
		 lbSystemName.setFont(new Font("Andele Mono", 3, 18));//setting Font size and type, bold font, cursive and size 18 
		 lbSystemName.setForeground(new Color(255,255,255)); //adding text Color
		 add(lbSystemName);
		 
		 
		 //setting Section Employee Name Data
		 lbEmployeeName = new JLabel("Enter you Name:");
		 lbEmployeeName.setBounds(45,212, 200, 30);
		 lbEmployeeName.setFont(new Font("Andele Mono", 1, 12)); //bold font
		 lbEmployeeName.setForeground(new Color(255,255,255));
		 add(lbEmployeeName);
		 
		 textEmployeeName = new JTextField();
		 textEmployeeName.setBounds(45,240, 255, 25);
		 textEmployeeName.setBackground(new Color(224,224,224));
		 textEmployeeName.setFont(new Font("Andele Mono", 1, 14)); //bold font
		 textEmployeeName.setForeground(new Color(255,0,0)); //setting color red to text
		 add(textEmployeeName);
		 
		 //Setting Section button Enter 
		 btnEnter =  new JButton("Enter");
		 btnEnter.setBounds(125, 280, 100,30);
		 btnEnter.setBackground(new Color(255,255,255));
		 btnEnter.setFont(new Font("Andele Mono",1,14));
		 btnEnter.setForeground(new Color(255,0,0));
		 add(btnEnter);
		 
		 //setting Section Copy Rights
		 lbCopyRights = new JLabel("� 2020 The Coca-Cola Company");
		 lbCopyRights.setBounds(85,375, 300, 30);
		 lbCopyRights.setFont(new Font("Andele Mono", 1, 12)); //bold font
		 lbCopyRights.setForeground(new Color(255,255,255));
		 add(lbCopyRights);
		 
	}




	/**
	 * @return the textEmployeeName
	 */
	public JTextField getTextEmployeeName() {
		return textEmployeeName;
	}




	/**
	 * @param textEmployeeName the textEmployeeName to set
	 */
	public void setTextEmployeeName(JTextField textEmployeeName) {
		this.textEmployeeName = textEmployeeName;
	}




	/**
	 * @return the lbEmployeeName
	 */
	public JLabel getLbEmployeeName() {
		return lbEmployeeName;
	}




	/**
	 * @param lbEmployeeName the lbEmployeeName to set
	 */
	public void setLbEmployeeName(JLabel lbEmployeeName) {
		this.lbEmployeeName = lbEmployeeName;
	}




	/**
	 * @return the btnEnter
	 */
	public JButton getBtnEnter() {
		return btnEnter;
	}




	/**
	 * @param btnEnter the btnEnter to set
	 */
	public void setBtnEnter(JButton btnEnter) {
		this.btnEnter = btnEnter;
	}
	
	
	
	
	
	
	
}
