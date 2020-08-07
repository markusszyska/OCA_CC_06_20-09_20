package zeitner.gui_05.view.mainframe.mainpanel.workingpanel.maintoolbar.exitbutton;

import javax.swing.JButton;

public class ExitButton extends JButton {

	private static final long serialVersionUID = -8570108741230550487L;

	public ExitButton() {
		super();
		super.setText("Exit");
		super.addActionListener(new ExitListener());
		super.setVisible(true);
	}
}
