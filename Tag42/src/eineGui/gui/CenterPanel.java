package eineGui.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CenterPanel extends JPanel {
	private JButton btn1, btn2, btn3;
	private JTextArea txt1, txt2;

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

	public JTextArea getTxt1() {
		return txt1;
	}

	public void setTxt1(JTextArea txt1) {
		this.txt1 = txt1;
	}

	public JTextArea getTxt2() {
		return txt2;
	}

	public void setTxt2(JTextArea txt2) {
		this.txt2 = txt2;
	}

	public CenterPanel() {
		this.setBtn1(new JButton("Button 1"));
		this.setBtn2(new JButton("Button 2"));
		this.setBtn3(new JButton("Button 3"));
		this.setTxt1(new JTextArea("Ein Text"));
		this.setTxt2(new JTextArea("Zweiter Text"));
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets= new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(this.getTxt1(), gbc);
		
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets= new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 0;
		this.add(this.getBtn1(), gbc);
		
		gbc.insets= new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 0;
		super.add(this.getBtn2(), gbc);
		
		gbc.insets= new Insets(0, 0, 5, 0);
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 1;
		super.add(this.getTxt2(), gbc);
		
		gbc.insets= new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 1;
		super.add(this.getBtn3(), gbc);		
	}

}
