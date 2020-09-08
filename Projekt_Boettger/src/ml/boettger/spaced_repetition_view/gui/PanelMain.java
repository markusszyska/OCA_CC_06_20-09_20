package ml.boettger.spaced_repetition_view.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelMain extends JPanel{
	
	//#########################################################################
	// private attributes for PanelMain
	//#########################################################################
	
	private JLabel labelNorthTestno;
	private PanelButtonsSouth panelButtonsSouth;
	private PanelQuestion panelQuestion;
		
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public PanelQuestion getPanelQuestion() {
		return panelQuestion;
	}

	public void setPanelQuestion(PanelQuestion panelQuestion) {
		this.panelQuestion = panelQuestion;
	}

	public JLabel getLabelNorthTestno() {
		return labelNorthTestno;
	}

	public void setLabelNorthTestno(JLabel labelNorthTestno) {
		this.labelNorthTestno = labelNorthTestno;
	}

	public PanelButtonsSouth getPanelButtonsSouth() {
		return panelButtonsSouth;
	}

	public void setPanelButtonsSouth(PanelButtonsSouth panelButtonsSouth) {
		this.panelButtonsSouth = panelButtonsSouth;
	}
	
	//#########################################################################
    // PanelMain constructor
	//#########################################################################
	
	public PanelMain() {
		super();
		this.setForeground(Color.WHITE);
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout(0, 0));

		//#####################################################################
		// add label test number - north, only for the heading text number
		//#####################################################################
		this.setLabelNorthTestno(new JLabel("Test: 001"));
		this.getLabelNorthTestno().setForeground(Color.WHITE);
		this.getLabelNorthTestno().setToolTipText(
			"<html>\r\n    Displays the number of the test.\r\n</html>");
		this.getLabelNorthTestno().setFont(new Font("Arial", Font.BOLD, 16));
		this.getLabelNorthTestno().
			setHorizontalAlignment(SwingConstants.CENTER);
		this.add(this.getLabelNorthTestno(), BorderLayout.NORTH);
		
		//#####################################################################
		// add PanelButtonsSouth for explanation, solution and next - south
		//#####################################################################
		this.setPanelButtonsSouth(new PanelButtonsSouth());
		this.add(this.getPanelButtonsSouth(), BorderLayout.SOUTH);
		
		//#####################################################################
		// add panel question - center, for the detailed question
		//#####################################################################
		this.setPanelQuestion(new PanelQuestion());
		this.add(this.getPanelQuestion(), BorderLayout.CENTER);		
	}	
}
