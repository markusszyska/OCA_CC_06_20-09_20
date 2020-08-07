package zeitner.gui_05.view.mainframe.mainpanel.workingpanel.buttonpanel.umschaltbutton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.displaypanel.display.IDisplay;


public class UmschaltButton extends JButton {

	private static final long serialVersionUID = -4855935949197195382L;
	public UmschaltButton(String text, IDisplay display) {
		super();
		super.setText(text);
		super.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UmschaltButton quelle = ((UmschaltButton)(e.getSource())); 
				if (quelle.getText().equals("Welt")) {
					display.setText("Welt");
					display.setBackground(Color.GREEN);
					quelle.setText("Hallo");
				} else {
					display.setText("Hallo");
					display.setBackground(Color.YELLOW);
					quelle.setText("Welt");
				}
			}
		});
		super.setVisible(true);
	}
	public UmschaltButton() {
		super();
		//this("StandardText",new Display());
	}
}
