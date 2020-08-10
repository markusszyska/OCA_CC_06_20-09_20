package demoJButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class DemoJButton {

	public static void main(String[] args) {
		JButton btn = new JButton();
		btn.setActionCommand("Load");
		
		btn.addActionListener(new BtnController());
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			}
		});
		
		btn.addActionListener((e)->{System.out.println("Button gedrueckt");});
		btn.addActionListener(RefController::load);
		
	}

}

class BtnController implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "Load":
			System.out.println("Button gedrueckt");
			break;
		}		
	}
}

class RefController{
	public static void load(ActionEvent e) {
		System.out.println("Load");
	}
}

