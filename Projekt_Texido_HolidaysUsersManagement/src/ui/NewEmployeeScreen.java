/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class NewEmployeeScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lbEmployeeName,lbEmployeeLastName,lbEmployeeLastSecondName, lbScreenName, lbDepartment,lbAntiquity;
	private JTextField textEmployeeName, txtEmployeeLastFirstName, txtEmployeeLastSecondName;
	private JComboBox<String> cBDepartmentOptions,cBAntiquity;
	private JButton btnEnter;
	
	
	public NewEmployeeScreen() {
		 setLayout(null); //default layout system
		 setTitle("Create New Employee"); //Adding title to Principal Interface
		 setIconImage(new ImageIcon("images/icon.png").getImage());
		 getContentPane().setBackground(new Color(255,0,0));//adding background 
		 this.initComponents();
	}
	
	private void initComponents() {
		/**
		 *  New Employee Screen Title
		 * */
		lbScreenName = new JLabel("Create New Employee");
		lbScreenName.setBounds(50, 20, 300, 30);
		lbScreenName.setFont(new Font("Andele Mono", 3, 18));//setting Font size and type, bold font, cursive and size 18 
		lbScreenName.setForeground(new Color(255,255,255)); //adding text Color
		add(lbScreenName);
	
		/**
		 * Employee Name
		 * **/
		lbEmployeeName = new JLabel("Enter Name:");
		lbEmployeeName.setBounds(45, 80, 200, 30);
		lbEmployeeName.setFont(new Font("Andele Mono", 1, 12)); //bold font
		lbEmployeeName.setForeground(new Color(255,255,255));
		add(lbEmployeeName);
		
		textEmployeeName = new JTextField();
		textEmployeeName.setBounds(45, 108, 255, 25);
		textEmployeeName.setBackground(new Color(224,224,224));
		textEmployeeName.setFont(new Font("Andele Mono", 1, 14)); //bold font
		textEmployeeName.setForeground(new Color(255,0,0)); //setting color red to text
		add(textEmployeeName);
	
		lbEmployeeLastName = new JLabel("Enter First Last Name:");
		lbEmployeeLastName.setBounds(45, 136, 200, 30);
		lbEmployeeLastName.setFont(new Font("Andele Mono", 1, 12)); //bold font
		lbEmployeeLastName.setForeground(new Color(255,255,255));
		add(lbEmployeeLastName);
		
		txtEmployeeLastFirstName = new JTextField();
		txtEmployeeLastFirstName.setBounds(45, 164, 255, 25);
		txtEmployeeLastFirstName.setBackground(new Color(224,224,224));
		txtEmployeeLastFirstName.setFont(new Font("Andele Mono", 1, 14)); //bold font
		txtEmployeeLastFirstName.setForeground(new Color(255,0,0)); //setting color red to text
		add(txtEmployeeLastFirstName);

		
		
		lbEmployeeLastSecondName = new JLabel("Enter Second Last Name:");
		lbEmployeeLastSecondName.setBounds(45, 192, 200, 30);
		lbEmployeeLastSecondName.setFont(new Font("Andele Mono", 1, 12)); //bold font
		lbEmployeeLastSecondName.setForeground(new Color(255,255,255));
		add(lbEmployeeLastSecondName);
		
		txtEmployeeLastSecondName = new JTextField();
		txtEmployeeLastSecondName.setBounds(45, 220, 255, 25);
		txtEmployeeLastSecondName.setBackground(new Color(224,224,224));
		txtEmployeeLastSecondName.setFont(new Font("Andele Mono", 1, 14)); //bold font
		txtEmployeeLastSecondName.setForeground(new Color(255,0,0)); //setting color red to text
		add(txtEmployeeLastSecondName);

		/*
		 * Combo Boxes 
		 * **/
		lbDepartment = new JLabel("Select Department:");
		lbDepartment.setBounds(45, 248, 180, 25);
		lbDepartment.setFont(new Font("Andele Mono",1,12));
		lbDepartment.setForeground(new Color(255,255,255));
		add(lbDepartment);
			//ComboBox Departments Data
			cBDepartmentOptions = new JComboBox<String>();
			cBDepartmentOptions.setBounds(45, 276, 255, 25);
			cBDepartmentOptions.setBackground(new Color(224,224,224));
			cBDepartmentOptions.setFont(new Font("Andele Mono", 1, 12));
			cBDepartmentOptions.setForeground(new Color(255,0,0));
			/*
			 * TODO here I must to improve the implementation 
			 * */
			cBDepartmentOptions.addItem("");
			cBDepartmentOptions.addItem("Customer service");
			cBDepartmentOptions.addItem("Logistics department");
			cBDepartmentOptions.addItem("Management department");
			add(cBDepartmentOptions);
	
		/**
		  * Setting Section Antiquity
		* **/
		lbAntiquity = new JLabel("Select Antiquity:");
		lbAntiquity.setBounds(45,304, 180, 25);
		lbAntiquity.setFont(new Font("Andele Mono", 1, 12));
		lbAntiquity.setForeground(new Color(255,255,255));
		add(lbAntiquity);
				//ComboBox Antiquity Data
			cBAntiquity = new JComboBox<String>();
			cBAntiquity.setBounds(45, 332, 255, 25);
			cBAntiquity.setBackground(new Color(224,224,224));
			cBAntiquity.setFont(new Font("Andele Mono", 1, 12));
			cBAntiquity.setForeground(new Color(255,0,0));
			cBAntiquity.addItem("");
			cBAntiquity.addItem("1 year of service");
			cBAntiquity.addItem("2 to 6 years of service");
			cBAntiquity.addItem("7 years or more of service");
			add(cBAntiquity);	
			
	    //Setting Section button Enter 
		btnEnter =  new JButton("Create");
		btnEnter.setBounds(125, 380, 100,30);
		btnEnter.setBackground(new Color(255,255,255));
		btnEnter.setFont(new Font("Andele Mono",1,14));
		btnEnter.setForeground(new Color(255,0,0));
		add(btnEnter);
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
	 * @return the txtEmployeeLastFirstName
	 */
	public JTextField getTxtEmployeeLastFirstName() {
		return txtEmployeeLastFirstName;
	}

	/**
	 * @param txtEmployeeLastFirstName the txtEmployeeLastFirstName to set
	 */
	public void setTxtEmployeeLastFirstName(JTextField txtEmployeeLastFirstName) {
		this.txtEmployeeLastFirstName = txtEmployeeLastFirstName;
	}

	/**
	 * @return the txtEmployeeLastSecondName
	 */
	public JTextField getTxtEmployeeLastSecondName() {
		return txtEmployeeLastSecondName;
	}

	/**
	 * @param txtEmployeeLastSecondName the txtEmployeeLastSecondName to set
	 */
	public void setTxtEmployeeLastSecondName(JTextField txtEmployeeLastSecondName) {
		this.txtEmployeeLastSecondName = txtEmployeeLastSecondName;
	}

	/**
	 * @return the cBDepartmentOptions
	 */
	public JComboBox<String> getcBDepartmentOptions() {
		return cBDepartmentOptions;
	}

	/**
	 * @param cBDepartmentOptions the cBDepartmentOptions to set
	 */
	public void setcBDepartmentOptions(JComboBox<String> cBDepartmentOptions) {
		this.cBDepartmentOptions = cBDepartmentOptions;
	}

	/**
	 * @return the cBAntiquity
	 */
	public JComboBox<String> getcBAntiquity() {
		return cBAntiquity;
	}

	/**
	 * @param cBAntiquity the cBAntiquity to set
	 */
	public void setcBAntiquity(JComboBox<String> cBAntiquity) {
		this.cBAntiquity = cBAntiquity;
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
