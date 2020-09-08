package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;

import ml.brainin.smallpizzeria.view.mainpanel.centerpanel.CenterPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class OrderTextAreaDataPanel.
 */
public class OrderTextAreaDataPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The j text area. */
	private JTextArea jTextArea;
	
	/**
	 * Instantiates a new order text area data panel.
	 *
	 * @param name the name
	 */
	public OrderTextAreaDataPanel(String name) {
		super();
		super.setLayout(new BorderLayout());
		JLabel label = new JLabel(name);
		label.setFont(new Font("Dialog", 1, 14));
		label.setPreferredSize(new Dimension(100, CenterPanel.WIDTH));
		label.setVerticalAlignment(JLabel.TOP);
		super.add(label, BorderLayout.WEST);
		this.jTextArea = new JTextArea();  
		this.setEnabled(false);
		this.jTextArea.setFont(new Font("Dialog", 1, 14));
		this.jTextArea.setPreferredSize(new Dimension( CenterPanel.WIDTH-label.getPreferredSize().width, CenterPanel.WIDTH));
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		super.add(jScrollPane, BorderLayout.CENTER);
		super.setBorder(new EtchedBorder());
		this.setVisible(true);

	}
	
	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.jTextArea.setText(text);
	}
}
