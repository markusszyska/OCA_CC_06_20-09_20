package ml.boettger.spaced_repetition_view.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FrameMain extends JFrame {
	
	//#########################################################################
	// private attributes for FrameMain
	//#########################################################################
	private PanelMain panelMain;
	private JLabel labelNorth;
	private JLabel labelWest;
	private JLabel labelEast;
	private JLabel labelSouth;
	
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public PanelMain getPanelMain() {
		return panelMain;
	}
	
	public void setPanelMain(PanelMain panelMain) {
		this.panelMain = panelMain;
	}	

	public JLabel getLabelSouth() {
		return labelSouth;
	}

	public void setLabelSouth(JLabel labelSouth) {
		this.labelSouth = labelSouth;
	}
	
	public JLabel getLabelNorth() {
		return labelNorth;
	}

	public void setLabelNorth(JLabel labelNorth) {
		this.labelNorth = labelNorth;
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

	//#########################################################################
	// constructor for main frame
	//#########################################################################
	
	public FrameMain() {
		super();
		this.setResizable(false);
		this.getContentPane().setForeground(Color.WHITE);
		this.getContentPane().setBackground(Color.BLUE);

		this.setTitle(
				"                       Space Repetition in Java");
		
		this.setBounds(25, 25, 750, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLabelNorth(new JLabel("B1N"));
		this.getLabelNorth().setHorizontalAlignment(SwingConstants.CENTER);
		this.add(this.getLabelNorth(), BorderLayout.NORTH);
		
		this.setLabelWest(new JLabel("B1W"));
		this.getLabelWest().setFont(new Font("Courier New", Font.PLAIN, 11));
		this.add(this.getLabelWest(), BorderLayout.WEST);
		
		this.setLabelEast(new JLabel("B1E"));
		this.getLabelEast().setFont(new Font("Courier New", Font.PLAIN, 11));
		this.add(this.getLabelEast(), BorderLayout.EAST);
		
		this.setLabelSouth(new JLabel("B1S"));
		this.getLabelSouth().setHorizontalAlignment(SwingConstants.CENTER);
		this.add(this.getLabelSouth(), BorderLayout.SOUTH);
		
		//#####################################################################
		// add main panel in the center
		//#####################################################################
		this.setPanelMain(new PanelMain());
		this.add(this.getPanelMain(), BorderLayout.CENTER);
		this.setVisible(true);		
	}	
}
