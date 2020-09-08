package ml.boettger.spaced_repetition_view.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class PanelMultipleChoice extends JPanel {
	static  private final int MAXCHOICES = 10; 
	private GridLayout gridLayoutMultipleChoices;
	private JCheckBox[] arrCheckBoxChoice = new JCheckBox[MAXCHOICES];

	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public JCheckBox[] getArrCheckBoxChoice() {
		return arrCheckBoxChoice;
	}

	public void setArrCheckBoxChoice(JCheckBox[] arrCheckBoxChoice) {
		this.arrCheckBoxChoice = arrCheckBoxChoice;
	}

	public static int getMaxchoices() {
		return MAXCHOICES;
	}

	public GridLayout getGridLayoutMultipleChoices() {
		return gridLayoutMultipleChoices;
	}
	
	public void setGridLayoutMultipleChoices(
			GridLayout gridLayoutMultipleChoices) {
		this.gridLayoutMultipleChoices = gridLayoutMultipleChoices;
	}
	
	//#########################################################################
	// constructor for PanelMultipleChoice
	//#########################################################################
	
	public PanelMultipleChoice() {
		super();
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		
		GridLayout gridLayoutMultipleChoices = new GridLayout(0, 1);
		gridLayoutMultipleChoices.setVgap(5);
		gridLayoutMultipleChoices.setHgap(5);
		this.setLayout(gridLayoutMultipleChoices);
		
		this.arrCheckBoxChoice[0] = new JCheckBox();
		this.arrCheckBoxChoice[0].setText("A. In Number");
		this.arrCheckBoxChoice[0].setMargin(new Insets(0,8,0,0));
		this.arrCheckBoxChoice[0].setFont(
			new Font("Courier New", Font.BOLD, 12));
		this.arrCheckBoxChoice[0].setBorderPaintedFlat(true);
		this.arrCheckBoxChoice[0].setBackground(Color.BLACK);
		this.arrCheckBoxChoice[0].setForeground(Color.WHITE);
		this.add(this.arrCheckBoxChoice[0]);

		this.arrCheckBoxChoice[1] = new JCheckBox();
		this.arrCheckBoxChoice[1].setText("B. In Object");
		this.arrCheckBoxChoice[1].setMargin(new Insets(0,8,0,0));
		this.arrCheckBoxChoice[1].setFont(
			new Font("Courier New", Font.BOLD, 12));
		this.arrCheckBoxChoice[1].setBorderPaintedFlat(true);
		this.arrCheckBoxChoice[1].setBackground(Color.BLACK);
		this.arrCheckBoxChoice[1].setForeground(Color.WHITE);
		this.add(this.arrCheckBoxChoice[1]);

		this.arrCheckBoxChoice[2] = new JCheckBox();
		this.arrCheckBoxChoice[2].setText("C. In Long");
		this.arrCheckBoxChoice[2].setMargin(new Insets(0,8,0,0));
		this.arrCheckBoxChoice[2].setFont(
			new Font("Courier New", Font.BOLD, 12));
		this.arrCheckBoxChoice[2].setBorderPaintedFlat(true);
		this.arrCheckBoxChoice[2].setBackground(Color.BLACK);
		this.arrCheckBoxChoice[2].setForeground(Color.WHITE);
		this.add(this.arrCheckBoxChoice[2]);

		this.arrCheckBoxChoice[3] = new JCheckBox();
		this.arrCheckBoxChoice[3].setText("D. In Integer");
		this.arrCheckBoxChoice[3].setMargin(new Insets(0,8,0,0));
		this.arrCheckBoxChoice[3].setFont(
			new Font("Courier New", Font.BOLD, 12));
		this.arrCheckBoxChoice[3].setBorderPaintedFlat(true);
		this.arrCheckBoxChoice[3].setBackground(Color.BLACK);
		this.arrCheckBoxChoice[3].setForeground(Color.WHITE);
		this.add(this.arrCheckBoxChoice[3]);

		this.arrCheckBoxChoice[4] = new JCheckBox();
		this.arrCheckBoxChoice[4].setText("E. It will not compile");
		this.arrCheckBoxChoice[4].setMargin(new Insets(0,8,0,0));
		this.arrCheckBoxChoice[4].setFont(
			new Font("Courier New", Font.BOLD, 12));
		this.arrCheckBoxChoice[4].setBorderPaintedFlat(true);
		this.arrCheckBoxChoice[4].setBackground(Color.BLACK);
		this.arrCheckBoxChoice[4].setForeground(Color.WHITE);
		this.add(this.arrCheckBoxChoice[4]);
	}		
}
