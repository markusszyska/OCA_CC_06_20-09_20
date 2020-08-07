package zeitner.observerdemo.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.observerdemo.data.IObservableData;
import zeitner.observerdemo.label.ObserverDisplay;


public class DisplayPanel extends JPanel {
	

	private static final long serialVersionUID = 1211075577988693744L;
	private ObserverDisplay display;
	
	public ObserverDisplay getDisplay() {
		return this.display;
	}
	public void setDisplay(ObserverDisplay display) {
		this.display = display;
	}
	
	public DisplayPanel(IObservableData observableData) {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.BLUE);
		
		this.setDisplay(new ObserverDisplay(observableData));
		display.setVisible(true);

		super.add(display, BorderLayout.CENTER);

		
		super.setVisible(true);
	}

}
