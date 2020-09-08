package ml.boettger.spaced_repetition_view.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelQuestion extends JPanel {
	
	//#########################################################################
	// private attributes for PanelQuestion
	//#########################################################################
	
	private PanelScrollQuestion panelScrollQuestion;
	private JLabel labelSouth;
	private JLabel labelWest;
	private JLabel labelEast;
	private PanelMultipleChoice panelMultipleChoice;
	
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public PanelMultipleChoice getPanelMultipleChoice() {
		return panelMultipleChoice;
	}

	public void setPanelMultipleChoice(
		PanelMultipleChoice panelMultipleChoice) {
		this.panelMultipleChoice = panelMultipleChoice;
	}

	public JLabel getLabelWest() {
		return labelWest;
	}

	public void setLabelWest(JLabel labelWest) {
		this.labelWest = labelWest;
	}

	public JLabel getLabelEast() {
		return labelEast;
	}

	public void setLabelEast(JLabel labelEast) {
		this.labelEast = labelEast;
	}

	public JLabel getLabelSouth() {
		return labelSouth;
	}

	public void setLabelSouth(JLabel labelSouth) {
		this.labelSouth = labelSouth;
	}

	public PanelScrollQuestion getPanelScrollQuestion() {
		return panelScrollQuestion;
	}

	public void setPanelScrollQuestion(PanelScrollQuestion panelScrollQuestion) {
		this.panelScrollQuestion = panelScrollQuestion;
	}
	
	//#########################################################################
	// constructor for PanelQuestion
	//#########################################################################
	
	public PanelQuestion() {
		super();
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		this.setLayout(new BorderLayout(0, 0));
		
		//#####################################################################
		// scroll panel for the question in the north
		//#####################################################################
		this.setPanelScrollQuestion(new PanelScrollQuestion());
		this.add(this.getPanelScrollQuestion(), BorderLayout.NORTH);
		
		//#####################################################################
		// filler label in the south
		//#####################################################################
		this.setLabelSouth(new JLabel("Label South"));
		this.getLabelSouth().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLabelSouth().setFont(new Font("Arial", Font.BOLD, 16));	
		this.add(this.getLabelSouth(), BorderLayout.SOUTH);
		
		//#####################################################################
		// filler label in the west
		//#####################################################################
		this.setLabelWest(new JLabel("W"));
		this.getLabelWest().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLabelWest().setFont(new Font("Arial", Font.BOLD, 16));	
		this.add(this.getLabelWest(), BorderLayout.WEST);
		
		//#####################################################################
		// filler label in the east
		//#####################################################################
		this.setLabelEast(new JLabel("E"));
		this.getLabelEast().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLabelEast().setFont(new Font("Arial", Font.BOLD, 16));	
		this.add(this.getLabelEast(), BorderLayout.EAST);
		
		//#####################################################################
		// multiple choice panel in the center
		//#####################################################################
		this.setPanelMultipleChoice(new PanelMultipleChoice());
		this.add(this.getPanelMultipleChoice(), BorderLayout.CENTER);
	}	
}
