package ml.boettger.spaced_repetition_view.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButtonsSouth extends JPanel {
	private JButton buttonExplanation;
	private JButton buttonSolution;
	private JButton buttonConfirm;
	private JButton buttonNext;
		
	public JButton getButtonExplanation() {
		return buttonExplanation;
	}

	public void setButtonExplanation(JButton buttonExplanation) {
		this.buttonExplanation = buttonExplanation;
	}

	public JButton getButtonSolution() {
		return buttonSolution;
	}

	public void setButtonSolution(JButton buttonSolution) {
		this.buttonSolution = buttonSolution;
	}

	public JButton getButtonConfirm() {
		return buttonConfirm;
	}

	public void setButtonConfirm(JButton buttonConfirm) {
		this.buttonConfirm = buttonConfirm;
	}

	public JButton getButtonNext() {
		return buttonNext;
	}

	public void setButtonNext(JButton buttonNext) {
		this.buttonNext = buttonNext;
	}

	public PanelButtonsSouth() {
		super();
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) this.getLayout();
		flowLayout.setHgap(50);

		//#####################################################################
		// explanation button
		//#####################################################################
		this.setButtonExplanation(new JButton("Explanation"));
		
		this.getButtonExplanation().setToolTipText(
			"<html>\r\n" +
				"Displays an existing explanation.\r\n" +
			"</html>");
		
		this.getButtonExplanation().setEnabled(false);
		this.getButtonExplanation().setFont(new Font("Arial", Font.BOLD, 16));		
		this.add(this.getButtonExplanation());
		
		//#####################################################################
		// solution button
		//#####################################################################
		this.setButtonSolution(new JButton("Solution"));
		
		this.getButtonSolution().setToolTipText(
			"<html>\r\n" +
		    	"Show the solution in colored lines:<br><br>\r\n" +
			    "ERRORS are marked in RED<br>\r\n" +
			    "CORRECT SELECTIONS are marked in GREEN<br>\r\n" +
			    "CORRECT, but not SELECTED are marked in YELLOW<br>\r\n" +
			"</html>\t\t\r\n");
		
		this.getButtonSolution().setEnabled(false);
		this.getButtonSolution().setFont(new Font("Arial", Font.BOLD, 16));		
		this.add(this.getButtonSolution());		
		
		//#####################################################################
		// confirm button
		//#####################################################################
		this.setButtonConfirm(new JButton("Confirm"));
		
		this.getButtonConfirm().setToolTipText(
			"<html>\r\n" +
				"Confirm only, if you are sure!<br><br>\r\n" +
				"After confirmation the other buttons<br>\r\n" +
				"are enabled.\r\n" +
			"</html>\t\t\r\n");
		
		this.getButtonConfirm().setEnabled(true);
		this.getButtonConfirm().setFont(new Font("Arial", Font.BOLD, 16));		
		this.add(this.getButtonConfirm());		
		
		//#####################################################################
		// next button
		//#####################################################################
		this.setButtonNext(new JButton("Next"));
		
		this.getButtonNext().setToolTipText(
			"<html>\r\n" +
				"Get next question, after \"Confirm\".<br><br>\r\n" +
				"You should use<br>\t\r\n" +
				"\"Show explanation\", \"Show solution\"<br>\r\n" +
				"before calling \"Next\"" +
			"</html>\t\t\r\n");
		
		this.getButtonNext().setEnabled(false);
		this.getButtonNext().setFont(new Font("Arial", Font.BOLD, 16));		
		this.add(this.getButtonNext());				
	}
}
