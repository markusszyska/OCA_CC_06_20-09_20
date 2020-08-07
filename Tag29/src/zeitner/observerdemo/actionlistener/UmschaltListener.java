package zeitner.observerdemo.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import zeitner.observerdemo.button.UmschaltButton;
import zeitner.observerdemo.data.IObservableData;




public class UmschaltListener implements ActionListener {
	
	private IObservableData observableData;
		
	public UmschaltListener(IObservableData observableData) {
		super();
		this.observableData = observableData;
	}
	public UmschaltListener() {
		super();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("UmschaltButton : Wunsch nach Wertänderung vom Benutzer erhalten");
		UmschaltButton quelle = ((UmschaltButton)(e.getSource())); 
		if (quelle.getText().equals("Welt")) {
			System.out.println("UmschaltButton : Leite Wunsch nach Wertänderung vom Benutzer an ObservableData weiter ...");
			this.observableData.setValue("Welt");
			System.out.println("UmschaltButton : Wunsch nach Wertänderung vom Benutzer an ObservableData weitergeleitet ...");
			quelle.setText("Hallo");
		} else {
			System.out.println("UmschaltButton : Leite Wunsch nach Wertänderung vom Benutzer an ObservableData weiter ...");
			this.observableData.setValue("Hallo");
			System.out.println("UmschaltButton : Wunsch nach Wertänderung vom Benutzer an ObservableData weitergeleitet ...");
			quelle.setText("Welt");
		}
		System.out.println("UmschaltButton : Wunsch nach Wertänderung vom Benutzer abgeschlossen");
	}

}
