package ml.boettger.spaced_repetition_view.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class PanelScrollQuestion extends JScrollPane{
	
	//#########################################################################
	// private attributes for PanelScrollQuestion
	//#########################################################################
	
	private JTextArea textAreaQuestion;
	
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public JTextArea getTextAreaQuestion() {
		return textAreaQuestion;
	}

	public void setTextAreaQuestion(JTextArea textAreaQuestion) {
		this.textAreaQuestion = textAreaQuestion;
	}
	
	//#########################################################################
	// constructor for PanelScrollQuestion
	//#########################################################################
	
	public PanelScrollQuestion() {
		this.setHorizontalScrollBarPolicy(
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		this.setPreferredSize(new Dimension(100, 100));
		
		//#####################################################################
		// textArea with the question in the north
		//#####################################################################
		this.setTextAreaQuestion(new JTextArea());
		this.getTextAreaQuestion().setMargin(new Insets(4, 8, 4, 8));
		this.getTextAreaQuestion().setBackground(Color.DARK_GRAY);
		this.getTextAreaQuestion().setForeground(Color.WHITE);
		
		this.getTextAreaQuestion().setFont(
			new Font("COURIER NEW", Font.BOLD, 12));
		
		this.getTextAreaQuestion().setEditable(false);
		this.getTextAreaQuestion().setText(				
"Consider the following class...\n"                                       +
"class TestClass{\n"                                                      +
"  void probe(Object x) { System.out.println(\"In Object\"); } //3\n\n"   + 
"  void probe(Number x) { System.out.println(\"In Number\"); } //2\n\n"   +
"  void probe(Integer x) { System.out.println(\"In Integer\"); } //2\n\n" +    
"  void probe(Long x) { System.out.println(\"In Long\"); } //4\n\n"       +				    
"  public static void main(String[] args){\n"                             +
"    double a = 10;\n"                                                    +  
"    new TestClass().probe(a);\n"                                         +
"  }\n"                                                                   +
"}\n"                                                                     +
"What will be printed?\n");
		this.getTextAreaQuestion().setToolTipText(
				"<html>\r\n" +
						"Displays the detailed question.\r\n" +
				"</html>");
		
		this.setViewportView(this.getTextAreaQuestion());		
	}	
}


