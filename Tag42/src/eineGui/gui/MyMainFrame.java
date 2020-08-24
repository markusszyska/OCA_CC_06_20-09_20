package eineGui.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyMainFrame extends JFrame{
	
	CenterPanel centerPanel;
	LeftPanel leftPanel;
	
	public LeftPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(LeftPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public CenterPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(CenterPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	public MyMainFrame() {
		this.setBounds(400, 400, 640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.setCenterPanel(new CenterPanel());
		this.add(this.getCenterPanel(), BorderLayout.CENTER);
		
		this.setLeftPanel(new LeftPanel());
		this.add(this.getLeftPanel(), BorderLayout.WEST);
		this.setVisible(true);
	}
	public void addActionListenerToLeftButton1(ActionListener al) {
		this.getLeftPanel().addActionListenerToLeftButton1(al);
	}
	
	
	
	
}
