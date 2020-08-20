package demo_mvc_observer;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainView extends JFrame {

	private JPanel mainPanel;
	private JPanel centerPanel;
	private JLabel zahlenLabel;
	private JPanel southPanel;
	private JButton btnCountUp, btnCountDown;
	
	
	public MainView() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(600, 400, 400, 200);
		
		//Panels initialisieren
		this.setZahlenLabel(new JLabel());
		this.setSouthPanel(new JPanel());
		this.setMainPanel(new JPanel());
		this.setCenterPanel(new JPanel());
		
		//Dem HauptPanel ein Layout geben
		this.getMainPanel().setLayout(new BorderLayout(5, 2));
		//Buttons initialisieren
		this.setBtnCountUp(new JButton("UP"));
		this.setBtnCountDown(new JButton("DOWN"));
		this.getBtnCountUp().setActionCommand("up");
		this.getBtnCountDown().setActionCommand("down");
		//Buttons dem SouthPanel hinzufuegen
		this.getSouthPanel().add(this.getBtnCountDown());
		this.getSouthPanel().add(this.getBtnCountUp());
		//Schriftgroesse/art im JLabel aendern
		this.getZahlenLabel().setFont(new Font("Arial", Font.PLAIN, 30));
		this.getZahlenLabel().setText("Hier kommt eine Zahl rein");
		//Text im JLabel Zentrieren
		this.getZahlenLabel().setHorizontalAlignment(SwingConstants.CENTER);
		this.getZahlenLabel().setVerticalAlignment(SwingConstants.CENTER);
		//Das HauptPanel dem HauptFrame hinzufuegen
		this.setContentPane(this.getMainPanel());
		
		this.getCenterPanel().add(this.getZahlenLabel());
		this.getMainPanel().add(this.getCenterPanel(), BorderLayout.CENTER);
		this.getMainPanel().add(this.getSouthPanel(), BorderLayout.SOUTH);
		
		this.setTitle("Mein Counter");
		this.setVisible(true);
	}

	public JPanel getMainPanel() {
		return mainPanel;
	}
	public void setMainPanel(JPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	public JPanel getCenterPanel() {
		return centerPanel;
	}
	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}
	public JLabel getZahlenLabel() {
		return zahlenLabel;
	}
	public void setZahlenLabel(JLabel zahlenLabel) {
		this.zahlenLabel = zahlenLabel;
	}
	public JPanel getSouthPanel() {
		return southPanel;
	}
	public void setSouthPanel(JPanel southPanel) {
		this.southPanel = southPanel;
	}
	public JButton getBtnCountUp() {
		return btnCountUp;
	}
	public void setBtnCountUp(JButton btnCountUp) {
		this.btnCountUp = btnCountUp;
	}
	public JButton getBtnCountDown() {
		return btnCountDown;
	}
	public void setBtnCountDown(JButton btnCountDown) {
		this.btnCountDown = btnCountDown;
	}
	public void addActionListenerToButtons(ActionListener al) {
		this.getBtnCountUp().addActionListener(al);
		this.getBtnCountDown().addActionListener(al);
	}
	
	
}
