package zeitner.gui_05.gui.actionlistener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import zeitner.gui_05.gui.button.UmschaltButton;
import zeitner.gui_05.gui.label.IDisplay;


public class UmschaltListener implements ActionListener {
	
	private IDisplay display;
	
	private IDisplay getDisplay() {
		return this.display;
	}
	private void setDisplay(IDisplay display) {
		this.display = display;
	}
	
	public UmschaltListener(IDisplay display) {
		super();
		this.setDisplay(display);
	}
	public UmschaltListener() {
		super();
		//this.setDisplay(new Display());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		UmschaltButton quelle = ((UmschaltButton)(e.getSource())); 
		if (quelle.getText().equals("Welt")) {
			this.getDisplay().setText("Welt");
			this.getDisplay().setBackground(Color.GREEN);
			quelle.setText("Hallo");
		} else {
			this.getDisplay().setText("Hallo");
			this.getDisplay().setBackground(Color.YELLOW);
			quelle.setText("Welt");
		}
	}

}
