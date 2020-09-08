package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import javax.swing.text.MaskFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class TimeFieldDataPanel.
 */
public class TimeFieldDataPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The mask. */
	private String mask = "##.##.## ##:##:##";
    
    /** The format. */
    private String format = "dd.MM.yy HH:mm:ss";
    
    /** The FM date. */
    private java.text.SimpleDateFormat FMDate  = new java.text.SimpleDateFormat(format);
	
	/** The j text field. */
	private JFormattedTextField jTextField;
	
	/**
	 * Instantiates a new time field data panel.
	 *
	 * @param name the name
	 */
	public TimeFieldDataPanel(String name) {
		super();
		super.setLayout(new BorderLayout());
		JLabel jLabel = new JLabel(name);
		jLabel.setFont(new Font("Dialog", 0, 14));
		jLabel.setPreferredSize(new Dimension(100, 35));
		super.add(jLabel, BorderLayout.WEST);
		this.jTextField = new JFormattedTextField(getFormatter(mask));  
		this.jTextField.setEnabled(false);
		this.jTextField.setColumns(mask.length());
		this.jTextField.setFont(new Font("Dialog", 1, 14));
		this.jTextField.setPreferredSize(new Dimension(80, 35));
		this.jTextField.setSize(new Dimension(80, 35));
		super.add(this.jTextField, BorderLayout.CENTER);
		JButton jButton = new JButton("c");
		jButton.setPreferredSize(new Dimension(30, 35));
		jButton.addActionListener((event)->setLocalDateTime());
//		super.add(jButton, BorderLayout.EAST);
		super.setBorder(new EtchedBorder());
		super.setPreferredSize(new Dimension(250, 35));
//		setLocalDateTime();
		this.setVisible(true);

	}
	
	/**
	 * Gets the current date time.
	 *
	 * @return the current date time
	 */
	public String  getCurrentDateTime() {
		return FMDate.format(System.currentTimeMillis());
	}
    
    /**
     * Sets the local date time.
     *
     * @param dateTime the new local date time
     */
    public void setLocalDateTime(String dateTime){
    	this.jTextField.setValue(dateTime);
    }
    
    /**
     * Sets the local date time.
     */
    public void setLocalDateTime(){
        this.jTextField.setValue(FMDate.format(System.currentTimeMillis()));
    }

	/**
	 * Gets the formatter.
	 *
	 * @param s the s
	 * @return the formatter
	 */
	private MaskFormatter getFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
            formatter.setPlaceholderCharacter(' ');
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
        }
        return formatter;
    }
	
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return this.jTextField.getText();
	}
	
	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.jTextField.setText(text);
	}
	
	/**
	 * Run timer.
	 */
	public void runTimer() {
		new Thread(()->{
			while(true) {
				try {
					Thread.sleep(700);
					SwingUtilities.invokeLater(()->this.setLocalDateTime());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
