/**
 * 
 */
package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import interfaces.IObserver;
import models.ApplicationModel;
import ui.ListEmployeeScreen;
import utils.PDFDocument;
import utils.PDFGenerator;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ListEmployeeController implements IObserver{
	private ListEmployeeScreen listEmployeeScreen;
	private ApplicationModel appModel;
	
	public ListEmployeeController(ListEmployeeScreen listEmployeeScreen, ApplicationModel applicationModel) {
		this.listEmployeeScreen = listEmployeeScreen;
		this.appModel = applicationModel;
		this.appModel.registerObserver(this);
		this.initView();
	}
	
	private void initView() {
		listEmployeeScreen.setBounds(0,0,600,535);	
		listEmployeeScreen.setVisible(true);
		listEmployeeScreen.setResizable(false);
		listEmployeeScreen.setLocationRelativeTo(null);
	}
	
	
	public void initController() {
		this.listEmployeeScreen.getBtnExport().addActionListener(l->{
			try {
				exportBtnHandle();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	private void exportBtnHandle() throws IOException {
		new PDFGenerator().generatePdf(PDFDocument.createContent(this.appModel.getEmployees()));
		JOptionPane.showMessageDialog(listEmployeeScreen, "The employee list has been successfully exported");
	}

	@Override
	public void update(String event) {
		System.out.println("[INFO][LISTEMPLOYEECONTROLLER] Received a Notification");
		System.out.println(event);
		this.listEmployeeScreen.insertDataTable(this.appModel.getEmployees());
		
	}
}
