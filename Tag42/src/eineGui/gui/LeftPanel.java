package eineGui.gui;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LeftPanel extends JPanel{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	public JButton getBtn1() {
		return btn1;
	}
	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}
	public JButton getBtn2() {
		return btn2;
	}
	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}
	public JButton getBtn3() {
		return btn3;
	}
	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}
	public JButton getBtn4() {
		return btn4;
	}
	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}
	
	public LeftPanel() {
		this.setBtn1(new JButton("Button 1"));
		this.setBtn2(new JButton("Button 2"));
		this.setBtn3(new JButton("Button 3"));
		this.setBtn4(new JButton("Button 4"));
		
		this.setLayout(new GridLayout(4, 1));
		this.add(this.getBtn1());
		this.add(this.getBtn2());
		this.add(this.getBtn3());
		this.add(this.getBtn4());		
	}
	public void addActionListenerToLeftButton1(ActionListener al) {
		this.getBtn1().addActionListener(al);		
	}
	
	
	
}
