package zeitner.observerdemo.label;

import java.awt.Color;

import javax.swing.JLabel;

import zeitner.observerdemo.data.IObservableData;

public class ObserverDisplay extends JLabel implements IObserverDisplay{

	private static final long serialVersionUID = 235680143296374280L;

	private IObservableData observableData;
	
	public ObserverDisplay(IObservableData observableData) {
		super();
		super.setBackground(Color.CYAN);
		super.setOpaque(true);
		super.setVisible(true);

		this.observableData = observableData;
		this.observableData.addObserver(this);
		super.setText(observableData.getValue().toString());
	}
	
	public ObserverDisplay() {
	}

	@Override
	public void update() {
		System.out.println("ObserverDisplay : Nachricht das der Wert geändert wurde erhalten.");
		super.setText(observableData.getValue().toString());
		System.out.println("ObserverDisplay : Der Wert wurde geändert.");
	}
}
