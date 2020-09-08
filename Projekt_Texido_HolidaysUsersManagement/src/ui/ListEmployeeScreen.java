/**
 * 
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.Employee;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ListEmployeeScreen extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JLabel blTitle;
	private JTable employeesListTable;
	private JButton btnExport;
	
	/**
	 * @return the btnExport
	 */
	public JButton getBtnExport() {
		return btnExport;
	}



	/**
	 * @param btnExport the btnExport to set
	 */
	public void setBtnExport(JButton btnExport) {
		this.btnExport = btnExport;
	}



	private JScrollPane jScrollPane;
	public ListEmployeeScreen() {
		setTitle("List of Employees");
		setIconImage(new ImageIcon("images/icon.png").getImage());
			
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,0,0));
		getContentPane().add(panel,BorderLayout.NORTH);
		
		//Instance Visual Components
		blTitle = new JLabel("List of Employees");
		panel.add(blTitle);
		
		
		blTitle.setFont(new Font("Andele Mono",1,18));
		blTitle.setForeground(new Color(255,255,255)); //adding text Color

		
		employeesListTable = new JTable();
		jScrollPane = new JScrollPane(employeesListTable);		
		
		getContentPane().add(jScrollPane, BorderLayout.CENTER);
		ImageIcon icon =new ImageIcon("images/export-icon.jpg");
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance( 30, 30,  java.awt.Image.SCALE_SMOOTH ) ;  

		btnExport = new JButton("Export", new ImageIcon(newimg));
		btnExport.setBackground(new Color(255,255,255));
		btnExport.setFont(new Font("Andele Mono",1,14));
		btnExport.setForeground(new Color(255,0,0));
		getContentPane().add(btnExport, BorderLayout.SOUTH);
		
		
		
		
	}
	
	
	
	public void insertDataTable(List<Employee> employees) {
		DefaultTableModel tableModel = (DefaultTableModel)this.employeesListTable.getModel();
		tableModel.addColumn("EmployeeName");
		tableModel.addColumn("EmployeeLastName");
		tableModel.addColumn("Antiquity");
		tableModel.addColumn("Department");
		
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			Object o[]= {employee.getName(),employee.getLastName() + " " + employee.getLastSecondName() , employee.getDepartment().getName(), employee.getAntiquity()};
			tableModel.addRow(o);
		}
	}
	
}
