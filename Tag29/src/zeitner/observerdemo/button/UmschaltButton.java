package zeitner.observerdemo.button;

import javax.swing.JButton;

import zeitner.observerdemo.actionlistener.UmschaltListener;
import zeitner.observerdemo.data.IObservableData;



public class UmschaltButton extends JButton {

	private static final long serialVersionUID = 819617937313677019L;
	public UmschaltButton(String text, IObservableData observableData) {
		super();
		super.setText(text);
		super.addActionListener(new UmschaltListener(observableData));
		super.setVisible(true);
	}
	public UmschaltButton() {
		super();
		//this("StandardText",new Display());
	}
}
