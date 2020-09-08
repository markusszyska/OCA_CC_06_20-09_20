/**
 * 
 */
package ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.exceptions.CsvValidationException;

import controller.ListEmployeeController;
import controller.PrincipalScreenController;
import interfaces.APerson;
import interfaces.IObserver;
import models.ApplicationModel;
import models.Employee;
import utils.Event;
import utils.ObjectMapper;


/**
 * @author Lic. Raul Alejandro Salas Texido
 *
 */
public class ProgressMonitorComponent extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JProgressBar progressBar;
	private String filePath;
	private ApplicationModel appModel;
	
	
	public ProgressMonitorComponent(String filePath,ApplicationModel appModel) throws CsvValidationException, IOException, InterruptedException {
		this.filePath = filePath;
		this.appModel = appModel;
		this.initView();
	}
	
	
	
	
	public void initView() throws CsvValidationException, IOException, InterruptedException {
	    GridBagLayout layout = new GridBagLayout();
		setIconImage(new ImageIcon("images/icon.png").getImage());
			
	    GridBagConstraints cons = new GridBagConstraints();
		setTitle("Please wait, Loading List of Employees...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,350,90);
		setLocationRelativeTo(null);
		
		this.progressBar = new JProgressBar();
		this.progressBar.setValue(0);
		this.progressBar.setStringPainted(true);
		this.progressBar.setForeground(new Color(255,0,0));
		
		layout.addLayoutComponent(this.progressBar, cons);
		add(this.progressBar);
		setVisible(true);
		readFile(filePath);
	}		
	
	private void readFile(String filePath) throws InterruptedException, IOException, CsvValidationException {
		
		File file = new File(this.filePath);
		FileReader fileReader;
		try {
			fileReader = new FileReader(file);
			CSVReader csvReader = new CSVReader(fileReader);

			long totalLengthFile = file.length();
			double lengthPercent = 100.0/ totalLengthFile;
			long readLength=0;
			String[] nextRecord;
			List<String[]> records = new ArrayList<>();
			
			while ((nextRecord=csvReader.readNext()) !=null) {
				readLength += nextRecord.length;
				records.add(nextRecord);
				Thread.sleep(100);
			    this.progressBar.setValue((int)Math.round(lengthPercent*readLength));
			}
			this.progressBar.setValue(100);
			fileReader.close();
			csvReader.close();
			setVisible(false);
			//Open Employees list
			ListEmployeeScreen listEmployeeScreen = new ListEmployeeScreen();
			ListEmployeeController listEmployeeController = new ListEmployeeController(listEmployeeScreen, appModel);
			listEmployeeController.initController();
			List<Employee> employees = ObjectMapper.mapListStringToListEmployee(records);
			System.out.println(employees);
			
			
			this.appModel.setEmployees(employees);
			this.appModel.notifyObservers(Event.FILE_LOADED);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
}
