/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import controller.PrincipalScreenController;
import models.ApplicationModel;
import models.ItemComboBox;
import utils.ComboBoxDataGenerator;
import utils.ComboBoxItemRender;
import utils.Event;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PrincipalScreen extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar;
	// Menus
	private JMenu optionsMenu, calculateMenu, aboutUsMenu;
	// ItemsMenu
	private JMenuItem  mIAboutUs, mIExitApplication, mIHolidaysCalculation, mINewCalulation, mIListOfEmployee, mINewEmployee;
	 
	
	// Labels
	private JLabel lBLogo, lBWelcome, lBTitle, lBEmployeeName, lBEmployeeFirstLastName, lBEmployeeSecondLastName,
			lBDeparment, lBAntiquity, lBResult, lBFooter;
	// TextFields
	private JTextField txtEmployeeName, txtEmployeeFirstLastName, txtEmployeeSecondLastName;
	// ScrollPane
	private JScrollPane scrollPane;
	// TextArea
	private JTextArea textArea;
	//ComboBox
	private JComboBox<ItemComboBox> cBDepartmentOptions,cBAntiquity;
	
	private JFileChooser fileChooser;
	
	
	/**
	 * @return the mINewEmployee
	 */
	public JMenuItem getmINewEmployee() {
		return mINewEmployee;
	}

	/**
	 * @param mINewEmployee the mINewEmployee to set
	 */
	public void setmINewEmployee(JMenuItem mINewEmployee) {
		this.mINewEmployee = mINewEmployee;
	}

	public PrincipalScreen() {
		setLayout(null);
		setIconImage(new ImageIcon("images/icon.png").getImage());	
		setTitle("Principal Screen");
		getContentPane().setBackground(new Color(255, 0, 0));
		this.initComponents();
	}

	/**
	 * @return the mIListOfEmployee
	 */
	public JMenuItem getmIListOfEmployee() {
		return mIListOfEmployee;
	}

	/**
	 * @param mIListOfEmployee the mIListOfEmployee to set
	 */
	public void setmIListOfEmployee(JMenuItem mIListOfEmployee) {
		this.mIListOfEmployee = mIListOfEmployee;
	}

	private void initComponents() {
		this.initNavBarComponents();
		this.initPositionTopComponents();
		this.initPositionCenterComponents();
		this.initFooterComponents();
	}
	
	

	private void initNavBarComponents() 
	{

		fileChooser = new JFileChooser();
		//Setting filter fort fileChooser
		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.csv", "csv");
		fileChooser.setFileFilter(filter);
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		// Setting MenuBar
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 0, 0));
		setJMenuBar(menuBar);

		// Adding Options inside of the MenuBar
		optionsMenu = new JMenu("Options");
		optionsMenu.setBackground(new Color(255, 0, 0)); // Background color Red
		optionsMenu.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		optionsMenu.setForeground(new Color(255, 255, 255)); // foreground color White
		menuBar.add(optionsMenu);

		
		mINewEmployee = new JMenuItem("New Employee");
		mINewEmployee.setFont(new Font("Andale Mono", 1, 14));
		mINewEmployee.setForeground(new Color(255, 0, 0));
		optionsMenu.add(mINewEmployee);
		
		
		mIListOfEmployee = new JMenuItem("List Employees");
		mIListOfEmployee.setFont(new Font("Andale Mono", 1, 14));
		mIListOfEmployee.setForeground(new Color(255, 0, 0));
		optionsMenu.add(mIListOfEmployee);
		// Adding MenuItems to OptionsMenu
		mINewCalulation = new JMenuItem("Reset Input");
		mINewCalulation.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		mINewCalulation.setForeground(new Color(255, 0, 0)); // foreground color White
		optionsMenu.add(mINewCalulation);
	
		
		
		
		
		mIExitApplication = new JMenuItem("Exit");
		mIExitApplication.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		mIExitApplication.setForeground(new Color(255, 0, 0)); // foreground color White
		optionsMenu.add(mIExitApplication);
	
		calculateMenu = new JMenu("Calculate");
		calculateMenu.setBackground(new Color(255, 0, 0)); // Background color Red
		calculateMenu.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		calculateMenu.setForeground(new Color(255, 255, 255)); // foreground color White
		menuBar.add(calculateMenu);

		// Adding Menus Items
		mIHolidaysCalculation = new JMenuItem("Holidays");
		mIHolidaysCalculation.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		mIHolidaysCalculation.setForeground(new Color(255, 0, 0)); // foreground color White
		calculateMenu.add(mIHolidaysCalculation);
		
		
		aboutUsMenu = new JMenu("About Us...");
		aboutUsMenu.setBackground(new Color(255, 0, 0)); // Background color Red
		aboutUsMenu.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		aboutUsMenu.setForeground(new Color(255, 255, 255)); // foreground color White
		menuBar.add(aboutUsMenu);

		mIAboutUs = new JMenuItem("The Creator");
		mIAboutUs.setFont(new Font("Andale Mono", 1, 14)); // bold font and size 14
		mIAboutUs.setForeground(new Color(255, 0, 0)); // foreground color White
		mIAboutUs.addActionListener(listener-> JOptionPane.showMessageDialog(null, "This project has beed develop by Lic.Raul Alejandro Salas Texido"));
		aboutUsMenu.add(mIAboutUs);
	}

	/**
	 * @return the fileChooser
	 */
	public JFileChooser getFileChooser() {
		return fileChooser;
	}

	/**
	 * @param fileChooser the fileChooser to set
	 */
	public void setFileChooser(JFileChooser fileChooser) {
		this.fileChooser = fileChooser;
	}

	private void initPositionTopComponents() {
		// Setting Labels and Text Components Principal Screen Top Position
		ImageIcon logoImage = new ImageIcon("images/logo-coca.png");
		lBLogo = new JLabel(logoImage);
		lBLogo.setBounds(5, 5, 250, 100);
		add(lBLogo);

		lBWelcome = new JLabel("Welcome " +  ApplicationModel.getUserAuthenticateName());
		lBWelcome.setBounds(280, 30, 300, 50);
		lBWelcome.setFont(new Font("Andale Mono", 1, 30));
		lBWelcome.setForeground(new Color(255, 255, 255));
		add(lBWelcome);

		lBTitle = new JLabel("Employee Data for Calculate Holidays Time");
		lBTitle.setBounds(45, 140, 900, 25);
		lBTitle.setFont(new Font("Andale Mono", 0, 24));
		lBTitle.setForeground(new Color(255, 255, 255));
		add(lBTitle);

	}

	private void initPositionCenterComponents() {
		// Setting Labels and Text Components Principal Screen Center Position
		lBEmployeeName = new JLabel("Employee Name:");
		lBEmployeeName.setBounds(25, 188, 180, 25);
		lBEmployeeName.setFont(new Font("Andele Mono",1,12));
		lBEmployeeName.setForeground(new Color(255,255,255));
		add(lBEmployeeName);
		
		txtEmployeeName = new JTextField();
		txtEmployeeName.setBounds(25,213,150,25);
		txtEmployeeName.setBackground(new Color(224,224,224));
		txtEmployeeName.setForeground(new Color(255,0,0));
		add(txtEmployeeName);
		
		//FistLastName
		lBEmployeeFirstLastName = new JLabel("Employee First Last Name:");
		lBEmployeeFirstLastName.setBounds(25, 248, 180, 25);
		lBEmployeeFirstLastName.setFont(new Font("Andele Mono",1,12));
		lBEmployeeFirstLastName.setForeground(new Color(255,255,255));
		add(lBEmployeeFirstLastName);
		
		txtEmployeeFirstLastName = new JTextField();
		txtEmployeeFirstLastName.setBounds(25,273,150,25);
		txtEmployeeFirstLastName.setBackground(new Color(224,224,224));
		txtEmployeeFirstLastName.setForeground(new Color(255,0,0));
		add(txtEmployeeFirstLastName);
		
		//SecondLastName
		lBEmployeeSecondLastName = new JLabel("Employee Second Last Name:");
		lBEmployeeSecondLastName.setBounds(25, 308, 180, 25);
		lBEmployeeSecondLastName.setFont(new Font("Andele Mono",1,12));
		lBEmployeeSecondLastName.setForeground(new Color(255,255,255));
		add(lBEmployeeSecondLastName);
		
		txtEmployeeSecondLastName = new JTextField();
		txtEmployeeSecondLastName.setBounds(25,334,150,25);
		txtEmployeeSecondLastName.setBackground(new Color(224,224,224));
		txtEmployeeSecondLastName.setForeground(new Color(255,0,0));
		add(txtEmployeeSecondLastName);
		
		/**
		 * 
		 * Setting Section Department
		 * 
		 * **/
		lBDeparment = new JLabel("Select Department:");
		lBDeparment.setBounds(220, 188, 180, 25);
		lBDeparment.setFont(new Font("Andele Mono",1,12));
		lBDeparment.setForeground(new Color(255,255,255));
		add(lBDeparment);
			//ComboBox Departments Data
			cBDepartmentOptions = new JComboBox<ItemComboBox>(ComboBoxDataGenerator.generateData(Event.DEPARTMENT_DATA));
			cBDepartmentOptions.setRenderer(new ComboBoxItemRender());
			cBDepartmentOptions.setBounds(220, 213, 220, 25);
			cBDepartmentOptions.setBackground(new Color(224,224,224));
			cBDepartmentOptions.setFont(new Font("Andele Mono", 1, 12));
			cBDepartmentOptions.setForeground(new Color(255,0,0));
			
			add(cBDepartmentOptions);
		
		/**
		 * Setting Section Antiquity
		 * **/
		lBAntiquity = new JLabel("Select Antiquity:");
		lBAntiquity.setBounds(220,248, 180, 25);
		lBAntiquity.setFont(new Font("Andele Mono", 1, 12));
		lBAntiquity.setForeground(new Color(255,255,255));
		add(lBAntiquity);
		
			cBAntiquity = new JComboBox<ItemComboBox>(ComboBoxDataGenerator.generateData(Event.ANTIQUITY_DATA));
			cBAntiquity.setBounds(220, 273, 220, 25);
			cBAntiquity.setBackground(new Color(224,224,224));
			cBAntiquity.setFont(new Font("Andele Mono", 1, 12));
			cBAntiquity.setRenderer(new ComboBoxItemRender());
			cBAntiquity.setForeground(new Color(255,0,0));
			add(cBAntiquity);
			
		/**
		 * Setting Section Result
		 * */
		lBResult = new JLabel("Calculation Result:");
		lBResult.setBounds(220, 307,180, 25);
		lBResult.setFont(new Font("Andele Mono",1,12));
		lBResult.setForeground(new Color(255,255,255));
		add(lBResult);
		
			textArea =  new JTextArea();
			textArea.setEditable(false);
			textArea.setBackground(new Color(224,224,224));
			textArea.setFont(new Font("Andale Mono",1,11));
			textArea.setForeground(new Color(255,0,0));
			textArea.setText("\n  Here the result of the vacation calculation will appear");
			scrollPane = new JScrollPane(textArea);
			scrollPane.setBounds(220, 333, 385, 90);
			add(scrollPane);
		
	}
	
	

	
	

	/**
	 * @return the mIExitApplication
	 */
	public JMenuItem getmIExitApplication() {
		return mIExitApplication;
	}

	/**
	 * @param mIExitApplication the mIExitApplication to set
	 */
	public void setmIExitApplication(JMenuItem mIExitApplication) {
		this.mIExitApplication = mIExitApplication;
	}

	/**
	 * @return the mIHolidaysCalculation
	 */
	public JMenuItem getmIHolidaysCalculation() {
		return mIHolidaysCalculation;
	}

	/**
	 * @param mIHolidaysCalculation the mIHolidaysCalculation to set
	 */
	public void setmIHolidaysCalculation(JMenuItem mIHolidaysCalculation) {
		this.mIHolidaysCalculation = mIHolidaysCalculation;
	}

	/**
	 * @return the mINewCalulation
	 */
	public JMenuItem getmINewCalulation() {
		return mINewCalulation;
	}

	/**
	 * @param mINewCalulation the mINewCalulation to set
	 */
	public void setmINewCalulation(JMenuItem mINewCalulation) {
		this.mINewCalulation = mINewCalulation;
	}

	/**
	 * @return the txtEmployeeName
	 */
	public JTextField getTxtEmployeeName() {
		return txtEmployeeName;
	}

	/**
	 * @param txtEmployeeName the txtEmployeeName to set
	 */
	public void setTxtEmployeeName(JTextField txtEmployeeName) {
		this.txtEmployeeName = txtEmployeeName;
	}

	/**
	 * @return the txtEmployeeFirstLastName
	 */
	public JTextField getTxtEmployeeFirstLastName() {
		return txtEmployeeFirstLastName;
	}

	/**
	 * @param txtEmployeeFirstLastName the txtEmployeeFirstLastName to set
	 */
	public void setTxtEmployeeFirstLastName(JTextField txtEmployeeFirstLastName) {
		this.txtEmployeeFirstLastName = txtEmployeeFirstLastName;
	}

	/**
	 * @return the txtEmployeeSecondLastName
	 */
	public JTextField getTxtEmployeeSecondLastName() {
		return txtEmployeeSecondLastName;
	}

	/**
	 * @param txtEmployeeSecondLastName the txtEmployeeSecondLastName to set
	 */
	public void setTxtEmployeeSecondLastName(JTextField txtEmployeeSecondLastName) {
		this.txtEmployeeSecondLastName = txtEmployeeSecondLastName;
	}

	/**
	 * @return the textArea
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * @param textArea the textArea to set
	 */
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	/**
	 * @return the cBDepartmentOptions
	 */
	public JComboBox<ItemComboBox> getcBDepartmentOptions() {
		return cBDepartmentOptions;
	}

	/**
	 * @param cBDepartmentOptions the cBDepartmentOptions to set
	 */
	public void setcBDepartmentOptions(JComboBox<ItemComboBox> cBDepartmentOptions) {
		this.cBDepartmentOptions = cBDepartmentOptions;
	}

	/**
	 * @return the cBAntiquity
	 */
	public JComboBox<ItemComboBox> getcBAntiquity() {
		return cBAntiquity;
	}

	/**
	 * @param cBAntiquity the cBAntiquity to set
	 */
	public void setcBAntiquity(JComboBox<ItemComboBox> cBAntiquity) {
		this.cBAntiquity = cBAntiquity;
	}

	/**
	 * 
	 */
	private void initFooterComponents() {
		lBFooter = new JLabel("� 2020 The Coca-Cola Company | All rights reserved");
		lBFooter.setBounds(135, 445, 500, 30);
		lBFooter.setFont(new Font("Andele Mono",1,12));
		lBFooter.setForeground(new Color(255,255,255));
		add(lBFooter);
	}

}
